public class Cinema {
    
    public void addMovie(Movie movie) {
        System.out.println("Movie added to cinema: " + movie.getTitle());
    }
    
    public void rentMovie(Viewer viewer, Movie movie) {
        viewer.rentMovie(movie);
    }
    
    public void returnMovie(Viewer viewer, Movie movie) {
        viewer.returnMovie(movie);
    }
    
    public void displayAvailableMovies() {
        System.out.println("Movies in Cinema:");
    }

}
