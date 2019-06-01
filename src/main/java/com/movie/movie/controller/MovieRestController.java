package com.movie.movie.controller;

import com.movie.movie.entity.Movie;
import com.movie.movie.service.MovieService;
import com.movie.movie.service.MovieServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/movie")
public class MovieRestController {

    @Autowired
    private MovieService movieService;

    @GetMapping("/all")
    public List<Movie> index() {
        return movieService.findAll();
    }

    /*@GetMapping("/{id}")
    public Movie getById(@PathVariable Long id) {
        Movie movie = movieService.findById(id);
        if (movie != null)
            return movie;
        else
            return new Movie(0L, "Empty Movie", 0.00, "Empty Detail");
    }*/

    @GetMapping("/{id}")
    public ResponseEntity<?> showById(@PathVariable Long id) {
        Movie movie = new Movie();
        Map<String, Object> response = new HashMap<>();
        try {
            movie = movieService.findById(id);
        } catch (DataAccessException e) {
            response.put("error", "error en conectar con la base de datos");
            response.put("detail", e.getMessage() + " | " + e.getMostSpecificCause().getMessage());
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        if (movie == null) {
            response.put("error", "el id -> " + id + " no existe, intente con otro id");
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.NOT_FOUND);

        }
        return new ResponseEntity<Movie>(movie, HttpStatus.OK);
    }

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Movie create(@RequestBody Movie movie) {
        return this.movieService.save(movie);
    }

    @PutMapping("/update/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Movie update(@RequestBody Movie movie, @PathVariable Long id) {
        Movie currentCliente = this.movieService.findById(id);
        currentCliente.setName(movie.getName());
        currentCliente.setDetail(movie.getDetail());
        currentCliente.setPrice(movie.getPrice());
        this.movieService.save(currentCliente);
        return currentCliente;
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        Movie currentCliente = this.movieService.findById(id);
        this.movieService.delete(currentCliente);
    }
}
