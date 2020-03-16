package com.nmovie.springboot.crudapp.rest;

import com.nmovie.springboot.crudapp.entity.MovieList;
import com.nmovie.springboot.crudapp.service.MovieService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
class MovieRestController {
    private MovieService movieService;
    
    @Autowired
    public MovieRestController(MovieService theMovieService) {
        movieService = theMovieService;
    }
    
    @GetMapping("/movies")
    public List<MovieList> findAll() {
        return movieService.fineAll();
    }
    
    @GetMapping("/movies/{movieId}")
    public MovieList getMovie(@PathVariable int movieId) {
        MovieList movie = movieService.findById(movieId);
        
        if (movie == null) {
            throw new RuntimeException("Movie id not found - " + movieId);
        }
        return movie;
    }
    
    @PostMapping("/movies")
    public MovieList addMovie(@RequestBody MovieList theMovie) {
        theMovie.setId(0);
        movieService.save(theMovie);
        return theMovie;
    }
    
    @PutMapping("/movies")
    public MovieList updateMovie(@RequestBody MovieList theMovie) {
        movieService.save(theMovie);
        return theMovie;
    }
    
    @DeleteMapping("/movies/{movieId}")
    public String deleteMpvie(@PathVariable int movieId) {
        MovieList movie = movieService.findById(movieId);
        
        if (movie == null) {
            throw new RuntimeException("Movie id not found - " + movieId);
        }
        
        movieService.deleteById(movieId);
        
        return "Deleted movie id - " + movieId;
    }
}
