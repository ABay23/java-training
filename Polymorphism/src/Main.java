import java.util.Scanner;

public class Main {
    public static void main(String[] args){

//        Movie newMovie = Movie.getMovie("Science Fiction","Star Wars");
//
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.print("Enter type A- for Adventure, C- for Comedy, S- for Science Fiction and Q- to quit: ");
            String type = s.nextLine();
            if ("Qq".contains(type)){
                break;
            }
            System.out.print("Enter Movie Title: ");
            String title = s.nextLine();
            Movie movie = Movie.getMovie(type, title);
            movie.watchMovie();
        }

    }
}
