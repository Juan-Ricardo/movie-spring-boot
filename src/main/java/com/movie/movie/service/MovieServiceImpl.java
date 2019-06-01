package com.movie.movie.service;

import com.movie.movie.entity.Movie;
import com.movie.movie.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieRepository movieRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Movie> findAll() {
        return (List<Movie>) movieRepository.findAll();
    }

    @Override
    public Movie save(Movie movie) {
        return movieRepository.save(movie);
    }

    @Override
    @Transactional(readOnly = true)
    public Movie findById(Long id) {
        return movieRepository.findById(id).orElse(null);
        /*Optional<Movie> movie = movieRepository.findById(id).map(new Function<Movie, Movie>() {
            @Override
            public Movie apply(Movie movie) {
                Movie currentMoview = movie;
                if (currentMoview != null)
                    return currentMoview;
                else
                    currentMoview = new Movie(0L, "No", 0.00, "No");
                return currentMoview;
            }
        });
        return movie.get();*/
    }

    @Override
    public void delete(Movie movie) {
        movieRepository.delete(movie);
    }
}
