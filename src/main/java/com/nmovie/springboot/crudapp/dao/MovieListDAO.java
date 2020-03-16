package com.nmovie.springboot.crudapp.dao;

import java.util.List;
import com.nmovie.springboot.crudapp.entity.MovieList;

public interface MovieListDAO {
    public List<MovieList> fineAll();
    
    public MovieList findById(int theId);
    
    public void save(MovieList theMovie);
    
    public void deleteById(int theId);

}