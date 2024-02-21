import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //inout object plus user input fields per movie
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the title of the film: ");
        String title = input.nextLine();
        System.out.print("Enter the director of the film: ");
        String director = input.nextLine();
        System.out.print("Enter the year of the film: ");
        int yearCreated = input.nextInt();
        System.out.print("Enter if the film is in color(true or false): ");
        boolean isInColor = input.nextBoolean();
        System.out.print("Enter the length of the film(in minuts): ");
        int lengthInMinuts = input.nextInt();
        System.out.print("Enter the genre of the film: ");
        //must be next else it skips the input
        String genre = input.next();

        //testing object for input (del 1)
        Movie movieOne = new Movie(title, director, yearCreated,
                isInColor, lengthInMinuts, genre);


        //testing for output of the objects getters (del 1)
        System.out.println(movieOne.getTitle() + "\n" + movieOne.getDirector() + "\n" +
                movieOne.getYearCreated() + "\n" + movieOne.getIsinColor() + "\n" +
                 movieOne.getLengthInMinuts() + "\n" + movieOne.getGenre());
    }


}
