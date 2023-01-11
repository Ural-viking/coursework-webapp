package com.example.courseworkwebapp.repository;

import com.example.courseworkwebapp.entity.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmReposirory extends JpaRepository<Film, Long> {

}
