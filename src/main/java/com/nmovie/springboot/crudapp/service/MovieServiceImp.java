package com.nmovie.springboot.crudapp.service;

import com.nmovie.springboot.crudapp.dao.MovieListDAO;
import com.nmovie.springboot.crudapp.entity.MovieList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
class MovieServiceImp implements MovieService {
    
    private MovieListDAO movieListDAO;
    
    @Autowired
    public MovieServiceImp(MovieListDAO theMovieListDAO) {
        movieListDAO = theMovieListDAO;
    }

    @Override
    @Transactional
    public List<MovieList> fineAll() {
        return movieListDAO.fineAll();
    }

    @Override
    @Transactional
    public MovieList findById(int theId) {
        return movieListDAO.findById(theId);
    }

    @Override
    @Transactional
    public void save(MovieList theMovie) {
        movieListDAO.save(theMovie);
    }

    @Override
    @Transactional
    public void deleteById(int theId) {
        movieListDAO.deleteById(theId);
    }
    
}