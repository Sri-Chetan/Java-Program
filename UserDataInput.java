import java.util.ArrayList;
import java.util.Scanner;

class Data {
    public String firstName;
    public String lastName;
    public int postalCode;

    public Data(String firstName, String lastName, int postalCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.postalCode = postalCode;
    }
}

public class UserDataInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Data> userDataList = new ArrayList<>();

        System.out.println("Enter Input {first_name<tab>last_name<tab>zip_code}:");

        while (true) {
            // Read input line
            String inputLine = scanner.nextLine();

            // Check if the user wants to quit
            if (inputLine.equals("quit")) {
                break;
            }

            String[] tokens = inputLine.split("\t");

            if (tokens.length == 3) {
                // Parse the postal code as an integer using the Wrapper class
                int postalCode = Integer.parseInt(tokens[2]);

                // Create a new Data object and add it to the ArrayList
                Data userData = new Data(tokens[0], tokens[1], postalCode);
                userDataList.add(userData);
            } else {
                System.out.println("Invalid input format. Please enter again or type 'quit' to exit.");
            }
        }

        System.out.println("\nUser Data Entered:");
        for (Data userData : userDataList) {
            System.out.println("First Name: " + userData.firstName +
                    ", Last Name: " + userData.lastName +
                    ", Postal Code: " + userData.postalCode);
        }

    }
}