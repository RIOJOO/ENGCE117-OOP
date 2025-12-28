import java.util.Scanner;

class Movie {
    private String title;
    private String director;
    private double rating;

    public Movie(String title) {
        this(title, "Unknown");
    }

    public Movie(String title, String director) {
        this(title, director, 0.0);
    }

    public Movie(String title, String director, double rating) {
        this.title = title;
        this.director = director;
        this.rating = (rating > 10.0) ? 10.0 : (rating < 0.0) ? 0.0 : rating;
    }

    public void displayDetails() {
        System.out.printf("Title: %s, Director: %s, Rating: %.1f\n", title, director, rating);
    }
}

public class Lab408 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;

        int mode = sc.nextInt();
        sc.nextLine();

        Movie movie = null;

        switch (mode) {
            case 1:
                movie = new Movie(sc.nextLine());
                break;
            case 2:
                movie = new Movie(sc.nextLine(), sc.nextLine());
                break;
            case 3:
                String t = sc.nextLine();
                String d = sc.nextLine();
                double r = sc.nextDouble();
                movie = new Movie(t, d, r);
                break;
        }

        if (movie != null) {
            movie.displayDetails();
        }
        sc.close();
    }
}