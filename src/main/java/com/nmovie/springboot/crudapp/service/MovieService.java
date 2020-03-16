package com.nmovie.springboot.crudapp.service;

import java.util.List;
import com.nmovie.springboot.crudapp.entity.MovieList;

public interface MovieService {
    public List<MovieList> fineAll();
    
    public MovieList findById(int theId);
    
    public void save(MovieList theMovie);
    
    public void deleteById(int theId);

}
