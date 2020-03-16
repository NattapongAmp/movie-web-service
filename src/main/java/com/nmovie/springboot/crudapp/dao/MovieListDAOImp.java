package com.nmovie.springboot.crudapp.dao;

import com.nmovie.springboot.crudapp.entity.MovieList;
import java.util.List;
import javax.persistence.EntityManager;
import org.hibernate.query.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class MovieListDAOImp implements MovieListDAO {
    
    private EntityManager entityManager;
    
    @Autowired
    public MovieListDAOImp(EntityManager theEntityManager) {
        entityManager = theEntityManager;
    }
    
    @Override
    public List<MovieList> fineAll() {
        Session currentSession = entityManager.unwrap(Session.class);
        
        Query<MovieList> theQuery = currentSession.createQuery("from MovieList", MovieList.class);
        
        List<MovieList> movies = theQuery.getResultList();
        
        return movies;
    }

    @Override
    public MovieList findById(int theId) {
        Session currentSession = entityManager.unwrap(Session.class);
        
        MovieList movie = currentSession.get(MovieList.class, theId);
        
        return movie;
    }

    @Override
    public void save(MovieList theMovie) {
        Session currentSession = entityManager.unwrap(Session.class);
        
        currentSession.saveOrUpdate(theMovie);
    }

    @Override
    public void deleteById(int theId) {
        Session currentSession = entityManager.unwrap(Session.class);
        
        Query theQuery = currentSession.createQuery("delete from MovieList where id=:movieId");
        theQuery.setParameter("movieId", theId);
        theQuery.executeUpdate();
    }
    
}
