package com.springboot.webfilm.controller;

import com.springboot.webfilm.entity.Film;
import com.springboot.webfilm.entity.User;
import com.springboot.webfilm.service.FilmService;
import com.springboot.webfilm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Controller
public class WebController {
    @Autowired
    UserService userservice;
    @Autowired
    FilmService filmservice;


    @GetMapping({"/user"})
    public String user(Model model) {
        List<User> userdemo = this.userservice.findbyid(1);
        model.addAttribute("size", userdemo.size());
        return "null.html";
    }



    @GetMapping({"/film_list"})
    public String film(Model model) {
        List<Film> filmlist = this.filmservice.findall();
        model.addAttribute("filmlist", filmlist);
        return "film.html";
    }

    @PostMapping({"/upload"})
    public String film(@RequestParam("file") MultipartFile file, @RequestParam("keyword") String keyword) {
        List<Film> filmlist = this.filmservice.findall();
        int size = filmlist.size();
        File f = new File("/usr/local/film/" + keyword + ".mp4");
        Film film = new Film();
        film.setFid(0);
        film.setName("电影" + String.valueOf(size + 1));
        film.setKeyword(keyword);
        this.filmservice.insert(film);

        try {
            file.transferTo(f);
            return "redirect:film_list";
        } catch (IOException var9) {
            return "404.html";
        }
    }
}

