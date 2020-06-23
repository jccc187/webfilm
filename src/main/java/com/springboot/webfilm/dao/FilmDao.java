package com.springboot.webfilm.dao;

import com.springboot.webfilm.entity.Film;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmDao extends JpaRepository<Film, Integer> {
}