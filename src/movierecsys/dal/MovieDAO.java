/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movierecsys.dal;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import movierecsys.be.Movie;

/**
 *
 * @author pgn
 */
public class MovieDAO
{
    
    private static final String SOURCE = "data/movie_titles.txt";
    List<Movie> allMovies = new ArrayList<>();
    int id = 0;
    /**
     * Gets a list of all movies in the persistence storage.
     *
     * @return List of movies.
     */
    private List<Movie> getAllMovies() throws IOException
    {
        File file = new File(SOURCE);
        
        List<String> lines = Files.readAllLines(file.toPath());
        for (String line : lines)
        {
            String[] columns = line.split(",");
            id = Integer.parseInt(columns[0]);
            int year = Integer.parseInt(columns[1]);
            String title = columns[2];
            Movie movie = new Movie(id, year, title);
            allMovies.add(movie);
        }
        
        return allMovies;
    }

    /**
     * Creates a movie in the persistence storage.
     *
     * @param releaseYear The release year of the movie
     * @param title The title of the movie
     * @return The object representation of the movie added to the persistence
     * storage.
     */
    private Movie createMovie(int releaseYear, String title)
    {
        id = id++;
        Movie movie = new Movie(id, releaseYear, title);
        
        allMovies.add(movie);
        return movie;
    }

    /**
     * Deletes a movie from the persistence storage.
     *
     * @param movie The movie to delete.
     */
    private void deleteMovie(Movie movie)
    {
        allMovies.remove(movie);
    }

    /**
     * Updates the movie in the persistence storage to reflect the values in the
     * given Movie object.
     *
     * @param movie The updated movie.
     */
    private void updateMovie(Movie movie)
    {
        //TODO Update movies
    }

    /**
     * Gets a the movie with the given ID.
     *
     * @param id ID of the movie.
     * @return A Movie object.
     */
    private Movie getMovie(int id)
    {
        //TODO Get one Movie
        return null;
    }

}
