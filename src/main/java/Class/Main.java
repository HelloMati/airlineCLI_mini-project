package Class;

import java.util.Scanner;
import java.util.UUID;

public class Main {
    static Airport airport = new Airport();

    public static void main(String[] args) {
        Flight flight1 = new Flight("Hawaii");
        Flight flight2 = new Flight("Barbados");
        Flight flight3 = new Flight("Tahiti");
        Flight flight4 = new Flight("Paris");
        Flight flight5 = new Flight("Dubai");
        Flight flight6 = new Flight("Berlin");
        Flight flight7 = new Flight("Istanbul");
        Flight flight8 = new Flight("Mallorca");
        Flight flight9 = new Flight("Barcelona");
        Flight flight10 = new Flight("Rome");
        Flight flight11 = new Flight("Seoul");
        Flight flight12 = new Flight("Tokyo");
        Flight flight13 = new Flight("New Delhi");
        Flight flight14 = new Flight("Mumbai");
        Flight flight15 = new Flight("Amsterdam");
        Flight flight16 = new Flight("Shanghai");
        Flight flight17 = new Flight("Hong Kong");
        Flight flight18 = new Flight("New York");
        Flight flight19 = new Flight("San Paulo");
        Flight flight20 = new Flight("Monte Carlo");
        airport.addFlight(flight1);
        airport.addFlight(flight2);
        airport.addFlight(flight3);
        airport.addFlight(flight4);
        airport.addFlight(flight5);
        airport.addFlight(flight6);
        airport.addFlight(flight7);
        airport.addFlight(flight8);
        airport.addFlight(flight9);
        airport.addFlight(flight10);
        airport.addFlight(flight11);
        airport.addFlight(flight12);
        airport.addFlight(flight13);
        airport.addFlight(flight14);
        airport.addFlight(flight15);
        airport.addFlight(flight16);
        airport.addFlight(flight17);
        airport.addFlight(flight18);
        airport.addFlight(flight19);
        airport.addFlight(flight20);

//        int userOption = 0;
        Scanner scanner = new Scanner(System.in);

        // ask the user to enter options 1-5
        System.out.println("\n Welcome to the AFM Airport internal systems manager! Please select one of the following options (Select a number)\n");
        while(true){
            System.out.println("1. Display all available Flights \n2. Add Flights \n3. Add a new passenger\n4. Book a passenger on to a flight\n5. Cancel existing flights.\n");

            // when the user enters 1-5, it will take them to the corresponding method
            System.out.println("Enter an option below: ");
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
                    //throws exception if value entered isn't 1-5

}
            } catch (Exception e) {
                System.out.println(e.getMessage());
                scanner.nextLine(); // so it doesn't keep looping
            }
        }

    }

    public static void displayFlights() {
        System.out.println("You selected option 1: ");
        airport.displayAllAvailableFlights();
        System.out.println("\n What would you like to do next? Select number from 1-5: \n");
    }

    public static void addNewFlight() {
        System.out.println("Add new flights to the airport system");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter flight destination");
        String flightDestination = scanner.nextLine();
        Flight addedFlight = new Flight(flightDestination);
        airport.addFlight(addedFlight);

        System.out.println("\nFlight to " +flightDestination + " successfully added to System. \n");
        System.out.println("What would you like to do next? Select number from 1-5: \n");
    }

    public static void addNewPassenger() {
        System.out.println("Add a new passenger to the airport system");
        System.out.println("Enter passenger information");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name: ");
        String name = scanner.nextLine();

        System.out.println("Enter email: ");
        String email = scanner.nextLine();

//        System.out.println("Enter ID: ");
//        String id = scanner.nextLine();
        // commented out after inputting random uuid generator, not needed anymore

        UUID uuid = UUID.randomUUID();
        Passenger addedPassenger = new Passenger(name, email, UUID.randomUUID());

        System.out.println("\n" + name + " is now added to the system.\n");
        System.out.println("What would you like to do next? Select number from 1-5: \n");
    }

    public static void bookFlight() {
        //scanner takes in input
        //using input find out which passenger and which flight is relevant
        // use airport.bookPassengerOntoFlight method
        System.out.println("Book a passenger on to flight");

        System.out.println("Enter passenger details");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = scanner.nextLine();

        System.out.println("Enter email: ");
        String email = scanner.nextLine();

        System.out.println("\n Please select an option from the following flights: ");
        airport.displayAllAvailableFlights();
        System.out.println("Enter flight destination: ");
        String flightDestination = scanner.nextLine();

        UUID uuid = UUID.randomUUID();
        Passenger addedPassenger = new Passenger(name, email, UUID.randomUUID());
        Flight chosenFlight = airport.getFlight(flightDestination);

        if (chosenFlight != null){
            airport.bookPassengerOnFlight(addedPassenger, chosenFlight);
            System.out.println(addedPassenger + " successfully added to flight to " + flightDestination + "\n");
        } else {
            System.out.println("We do not have flights to " + flightDestination + " currently.\n");
        }
        System.out.println("What would you like to do next? Select number from 1-5: \n");
    }

    public static void cancelFlight() {
        System.out.println("Cancel an existing flight");
        System.out.println("Please select a flight to cancel from the system");
        airport.displayAllAvailableFlights();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter flight destination: ");
        String flightDestination = scanner.nextLine();

        Flight chosenFlight = airport.getFlight(flightDestination);

        if (chosenFlight != null){
            airport.cancelFlight(chosenFlight);
            System.out.println("Flight to " + chosenFlight + " successfully cancelled. \n");
        } else {
            System.out.println("Cannot cancel flight as there are no available flights to this destination currently.\n");
        }
        System.out.println("What would you like to do next? Select number from 1-5: \n");
    }

}




