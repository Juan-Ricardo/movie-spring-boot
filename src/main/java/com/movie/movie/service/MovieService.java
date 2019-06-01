package com.movie.movie.service;

import com.movie.movie.entity.Movie;

import java.util.List;

public interface MovieService {
    public List<Movie> findAll();

    public Movie save(Movie movie);

    public Movie findById(Long id);

    public void delete(Movie movie);
}
