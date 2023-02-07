package Class;

import java.util.Scanner;

public class Main {
    static Airport airport = new Airport();

    public static void main(String[] args) {
        Flight flight1 = new Flight("Hawaii");
        Flight flight2 = new Flight("Barbados");
        Flight flight3 = new Flight("Tahiti");
        Flight flight4 = new Flight("Paris");
        Flight flight5 = new Flight("Dubai");
        airport.addFlight(flight1);
        airport.addFlight(flight2);
        airport.addFlight(flight3);
        airport.addFlight(flight4);
        airport.addFlight(flight5);

//        int userOption = 0;
        Scanner scanner = new Scanner(System.in);

        // ask the user to enter options 1-5
        System.out.println("Welcome to the Flight Bookings Manager! Please select one of the following options (type in number)");
        while(true){
            System.out.println("1. Display all available Flights \n2. Add Flights \n3. Add a new passenger\n4. Book a passenger onto a flight\n5. Cancel a flight.\n");

            // when the user enters 1-5, it will take them to the corresponding method
            System.out.println("Enter an option");
            String userInput = scanner.nextLine();
            try {
                int option = Integer.parseInt(userInput);
                switch (option) {
                    case 1: // displaying all the available flights
                            method1();
                            break;
                    case 2: // add new flights to system
                            method2();
                            break;
                    case 3: // add new passenger
                            method3();
                            break;
                    case 4: // book a passenger on to a flight
                            method4();
                            break;
                    case 5: // cancel flight
                            method5();
                            break;
                    default: throw new Exception("Invalid option entered.");

}
            } catch (Exception e) {
                System.out.println(e.getMessage());
                scanner.nextLine(); // so it doesn't keep looping
            }
        }

    }

    public static void method1() {
        System.out.println("You selected option 1: ");
        airport.displayAllAvailableFlights();
    }

    public static void method2() {
        System.out.println("You selected option 2. Add new flights to the airport system");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter flight destination");
        String flightDestination = scanner.nextLine();
        Flight addedFlight = new Flight(flightDestination);
        airport.addFlight(addedFlight);
    }

    public static void method3() {
        System.out.println("You selected option 3. Add a new passenger to the airport system");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter passenger name");
        String passenger = scanner.nextLine();
//        Passenger addPassenger = new Passenger()

    }

    public static void method4() {
        System.out.println("You selected option 4.");
        // first print all available flights
        System.out.println("Please select an option from the following flights:");
        airport.displayAllAvailableFlights();
        //scanner takes in input
        //using input find out which passenger and which flight is relevant
        // use airport.bookPassengerOntoFlight method
    }

    public static void method5() {
        System.out.println("You selected option 5.");
    }

    // if the user does not enter 1-5, it throws in the exception, telling them they entered something wrong
// loops them back to the options picking menu


// main method
// scanners
}




