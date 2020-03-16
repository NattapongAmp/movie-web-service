package com.nmovie.springboot.crudapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table(name="movie_list")
public class MovieList {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    
    @Column(columnDefinition = "text")
    private String title;
    
    @Column(name="release_date", columnDefinition = "text")
    private String releaseDate;
    
    @Column(columnDefinition = "text")
    private String describe;
    
    public MovieList() {
        
    }
    public MovieList(String title, String releaseDate) {
        this.title = title;
        this.releaseDate = releaseDate;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public int getId() {
        return id;
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getDescripe() {
        return describe;
    }

    public void setDescripe(String descripe) {
        this.describe = descripe;
    }
    
    @Override
    public String toString() {
        return "Movie [id=" + id + ", title=" + title + ", descripe=" + describe + "]";
    }
    
    
}
