package Project.PresentationLayer;

import java.util.Scanner;
import Project.BusinessLogicLayer.*;

public class FrontEnd {
    public static void main(String[] args) {
        boolean cont = true;
        while (cont) {
            Scanner scan = new Scanner(System.in);

            System.out.println("Welcome to Delicious Catering");
            System.out.println("----------------------------------------");
            System.out.println("");
            System.out.println("1. Book and event");
            System.out.println("2. View my event status");
            System.out.println("3. Exit");
            System.out.println("");
            System.out.println("Please enter an option, eg. 1");

            int option = scan.nextInt();

            System.out.print("\f"); // Clears the terminal
            switch (option) {
                case 1:
                    System.out.println("Welcome to Delicious Catering");
                    System.out.println("----------------------------------------");
                    System.out.println("");
                    System.out.println("What event would you like to book?");
                    System.out.println("");
                    System.out.println("1. Anniversary");
                    System.out.println("2. Birthday");
                    System.out.println("3. Wedding");
                    System.out.println("");
                    System.out.println("Please enter an option, eg. 1");

                    int secondOption = scan.nextInt();
                    Ievent event;
                    switch (secondOption) { // There is a factory so there is no need for such detail regarding creation
                                            // of event
                        case 1:
                            event = EventFactory.setEvent("ANNIVERSARY");
                            break;
                        case 2:
                            event = EventFactory.setEvent("BIRTHDAY");
                            break;
                        case 3:
                            event = EventFactory.setEvent("WEDDING");
                            break;

                    }
                    System.out.print("\f"); // Clears the terminal
                    System.out.println("Welcome to Delicious Catering");
                    System.out.println("----------------------------------------");
                    System.out.println("Please enter the address for your event.");
                    String address = scan.nextLine();
                    System.out.println("Please enter the number of kids attending the event.");
                    String kids = scan.nextInt();
                    System.out.println("Please enter the number of Adults attending the event.");
                    String adults = scan.nextInt();
                    break;
                case 2:
                    System.out.println("Have a nice day! The program will now exit.");
                    cont = false;
                    break;
            }
        }
    }

}
