import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        Exercise exercise = (a, b, c, d) -> (4 * (Math.cosh(Math.sqrt(Math.abs(a / b)))) + 3 * Math.acos(d));

        double a = 12;
        double b = 1;
        double c = 3;
        double d = 1;
        outMethod(exercise,a,c,b,d);
        System.out.println();
        Movie movie1 = new Movie(2.1, 120000, "korzh");
        Movie movie2 = new Movie(2.1, 20000, "Bones");
        Movie movie3 = new Movie(3.15, 400, "A$ap Rocky");
        Movie movie4 = new Movie(3.5, 400, "Lil Yachty");
        List<Movie> movieList = new ArrayList<>();
        movieList.add(movie1);
        movieList.add(movie2);
        movieList.add(movie3);
        movieList.add(movie4);

        movieList.forEach(movie -> System.out.println(movie));
    }

    public static void outMethod(Exercise exercise, double a, double b, double c,double d){
        System.out.println("a = " + a + " b = " + b + " c = " + c + " d = " + d + " result is " + exercise.doEx(a, b, c, d));
    }
}
