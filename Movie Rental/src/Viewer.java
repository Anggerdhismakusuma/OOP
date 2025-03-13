public class Viewer {
    private String name;
    private ArrayList<Movie> rentedMovies = new ArrayList<>();

    public Viewer(String name) {
        this.name = name;
    }

    public void rentMovie(Movie movie) {
        rentedMovies.add(movie);
        System.out.println(name + " rented: " + movie.getTitle());
    }

    public void returnMovie(Movie movie) {
        rentedMovies.remove(movie);
        System.out.println(name + " returned: " + movie.getTitle());
    }

    public void displayRentedMovies() {
        System.out.println(name + "'s Rented Movies:");
        for (Movie movie : rentedMovies) {
            System.out.println("Title: " + movie.getTitle());
            System.out.println("ID: " + movie.getId());
            System.out.println("Director: " + movie.getDirector().getName());
            System.out.println("Biography: " + movie.getDirector().getBiography());
            System.out.println("------------------------");
        }
    }

    public String getName() {
        return name;
    }

    public ArrayList<Movie> getRentedMovies() {
        return rentedMovies;
    }
}