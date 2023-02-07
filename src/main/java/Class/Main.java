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
                            displayFlights();
                            break;
                    case 2: // add new flights to system
                            addNewFlight();
                            break;
                    case 3: // add new passenger
                            addNewPassenger();
                            break;
                    case 4: // book a passenger on to a flight
                            bookFlight();
                            break;
                    case 5: // cancel flight
                            cancelFlight();
                            break;
                    default: throw new Exception("Invalid option entered.");

}
            } catch (Exception e) {
                System.out.println(e.getMessage());
                scanner.nextLine(); // so it doesn't keep looping
            }
        }
   // if the user does not enter 1-5, it throws in the exception, telling them they entered something wrong
// loops them back to the options picking menu

    }

    public static void displayFlights() {
        System.out.println("You selected option 1: ");
        airport.displayAllAvailableFlights();
    }

    public static void addNewFlight() {
        System.out.println("You selected option 2. Add new flights to the airport system");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter flight destination");
        String flightDestination = scanner.nextLine();
        Flight addedFlight = new Flight(flightDestination);
        airport.addFlight(addedFlight);
    }

    public static void addNewPassenger() {
        System.out.println("You selected option 3. Add a new passenger to the airport system");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter passenger information");
        String newPassenger = scanner.nextLine();
//        Passenger addedPassenger = new Passenger();
//        airport.bookPassengerOnFlight(addedPassenger, new Flight("London"));
    }

    public static void bookFlight() {
        System.out.println("You selected option 4. Book a passenger on to flight");
        // first print all available flights
        System.out.println("Please select an option from the following flights:");
        airport.displayAllAvailableFlights();
        //scanner takes in input
        //using input find out which passenger and which flight is relevant
        // use airport.bookPassengerOntoFlight method
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter passenger details");
        airport.bookPassengerOnFlight(new Passenger("Aya", "ayaaya@hotmail.com", 357437), new Flight("Dubai"));
    }

    public static void cancelFlight() {
        System.out.println("You selected option 5.");
        System.out.println("Please select a flight to cancel from the system");
        airport.displayAllAvailableFlights();
        Scanner scanner = new Scanner(System.in);
        int flights = scanner.nextInt();
//        airport.cancelFlight(Flight);
    }

}




