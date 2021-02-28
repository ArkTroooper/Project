package Project.PresentationLayer;

import java.util.Scanner;
import Project.BusinessLogicLayer;

public class FrontEnd {
    public static void main(String[] args) {
        boolean cont = true;
        while(cont){
            Scanner scan = new Scanner(System.in);

            System.out.println("Welcome to Delicious Catering");
            System.out.println("----------------------------------------");
            System.out.println("");
            System.out.println("1. Book and event");
            System.out.println("2. Exit");
            System.out.println("");
            System.out.println("Please enter an option, eg. 1");

            int option = scan.nextInt();

            System.out.print("\f"); //Clears the terminal
            switch(option){
                case 1:

                break;
                case 2:
                    System.out.println("Have a nice day! The program will now exit.");
                    cont = false;
                break;
            }
        }
        
        // Scanner myObj = new Scanner(System.in); // Create a Scanner object
        // System.out.println("Enter username");

        // String userName = myObj.nextLine(); // Read user input
        // System.out.println("Username is: " + userName); // Output user input
    }

}
