import java.util.*;

public class Cinema {
    
    private arrayList<Movie> movies = new arrayList<>();
    private arrayList<Movie> rentedMovies = new arrayList<>();

    public void addMovie(Movie movie) {
        movies.add(movie);
        System.out.println("Movie added to cinema: " + movie.getTitle());
    }

    public void rentMovie(Viewer viewer, Movie movie) {
        viewer.rentMovie(movie);
        rentedMovies.add(movie);
    }

    public void returnMovie(Viewer viewer, Movie movie) {
        viewer.returnMovie(movie);
        rentedMovies.remove(movie);
    }

    public void displayAvailableMovies() {
        System.out.println("Movies in Cinema:");
        for (Movie movie : movies) {
            System.out.println("Title: " + movie.getTitle());
        }
    }

    public arrayList<Movie> getMovies() {
        return movies;
    }

    public arrayList<Movie> getRentedMovies() {
        return rentedMovies;
    }

}
