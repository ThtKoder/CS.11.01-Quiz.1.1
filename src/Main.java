import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age;
        String firstName;
        String favouriteFood;

        System.out.println("Please enter your age followed by the return key:");
        age = scanner.nextInt();

        System.out.println("Please enter your First Name followed by the return key:");
        firstName = scanner.next();

        System.out.println("Please enter your Favourite Food followed by the return key:");
        Scanner scannerFood = new Scanner(System.in);
        favouriteFood = scannerFood.nextLine();

        System.out.println("\nFirst Name: " + firstName + "\n\n" + "Age " + age + "\n\n" + "Favourite Food: " + favouriteFood);

        //For next time: would like to be able to clear screen as well

    }

}