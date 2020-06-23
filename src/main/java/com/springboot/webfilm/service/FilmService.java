package com.springboot.webfilm.service;

import com.springboot.webfilm.dao.FilmDao;
import com.springboot.webfilm.entity.Film;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FilmService {
    @Autowired
    FilmDao filmDao;

    public FilmService() {
    }

    public List<Film> findall() {
        List<Film> res = this.filmDao.findAll();
        return res;
    }

    public void insert(Film film) {
        this.filmDao.save(film);
    }
}

