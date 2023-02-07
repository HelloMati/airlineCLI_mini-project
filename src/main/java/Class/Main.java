package Class;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int userOption = 0;
        Scanner scanner = new Scanner(System.in);

        // ask the user to enter options 1-5
        System.out.println("Welcome to the Flight Bookings Manager! Please select one of the following options (type in number)");
        System.out.println("1. Display all available Flights \n2. Add Flights \n3. Add a new passenger\n4. Book a passenger onto a flight\n5. Cancel a flight.\n");

        // when the user enters 1-5, it will take them to the corresponding method




        // if the user does not enter 1-5, it throws in the exception, telling them they entered something wrong
        // loops them back to the options picking menu



        // main method
        // scanners

        Airport airport = new Airport();
        Flight flight1 = new Flight("Hawaii");
        airport.addFlight(flight1);
        airport.displayAllAvailableFlights();

    }


}
