/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movierecsys.gui.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import movierecsys.be.Movie;

/**
 *
 * @author bonde
 */
public class MovieModel
{
    public MovieModel()
    {
        ObservableList<Movie> movie;
        movie = new FXCollections.observableArrayList();
    }
    
}
