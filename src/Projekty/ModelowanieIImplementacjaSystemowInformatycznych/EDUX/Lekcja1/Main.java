package Projekty.ModelowanieIImplementacjaSystemowInformatycznych.EDUX.Lekcja1;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        var movie1 = new Movie("Terminator 1", LocalDate.now(), 29.90f);
        var movie2 = new Movie("Terminator2" , LocalDate.now(), 34.90f);
        Movie.showExtent();

        System.out.println();

        // Test: Implementacja ekstensji przy uzyciu klasy dodatkowej

        var movieExtent = new MovieExtent();

        var movie3 = new Movie("Terminator 1", LocalDate.now(), 27.90f);
        movieExtent.addMovie(movie1);

        var movie4 = new Movie("Terminator 2", LocalDate.now(), 34.90f);
        movieExtent.addMovie(movie2);

        movieExtent.showExtent();
    }
}

class Movie{
    /*
        class body: attributes, methods, etc.
     */
    private String title;
    private float price;
    private LocalDate additionDate;
    public Movie(){
        adddMovie(this);
    }
    public Movie (String title, LocalDate localDate, float price){
        this.title = title;
        this.additionDate = localDate;
        this.price = price;
        adddMovie(this);

    }
    public String toString(){
        return "Movie: " + title + " id: " + super.toString();
    }
    private static List<Movie> extent = new ArrayList<>();
    private static void adddMovie(Movie movie){
        extent.add(movie);
    }
    private static void removeMovie(Movie movie){
        extent.remove(movie);
    }
    public static void showExtent(){
        System.out.println("Extent of the class "+Movie.class.getName());
        for(Movie movieInExtent : extent){
            System.out.println(movieInExtent);
        }
    }
}
//================Inny Sposób Extensji================
class MovieExtent{
    // Extent implementation

    /** The extent. */
    private List<Movie> extent = new ArrayList<>();

    public void addMovie(Movie movie) {
        extent.add(movie);
    }

    public void removeMovie(Movie movie) {
        extent.remove(movie);
    }

    public void showExtent() {

        System.out.println("Extent of the class: " + Movie.class.getName());

        for (Movie movie : extent) {
            System.out.println(movie);
        }
    }
}
abstract class AbstractMovie{
    /*
        Class body: attributes, methods, etc.
     */
}

class Employee{
    private static int minimalAge = 18;
    private static int maxAge = 68;
    private String firstName;
    private String lastName;
    private BigDecimal salary;
    private Double salaryAsDouble;
    private int number;
    private Optional<Double> extraBonus = Optional.empty();
    public Optional<Double> getExtraBonus(){
        return extraBonus;
    }
    public void setExtraBonus(Optional<Double> extraBonus){
        this.extraBonus = extraBonus;
    }
    public double getIncome(){
        return getSalary() + getExtraBonus().orElse(0d);
    }

    public Double getSalary() {
        return salaryAsDouble;
    }
}
class Person{
    private Date birthday;
}

