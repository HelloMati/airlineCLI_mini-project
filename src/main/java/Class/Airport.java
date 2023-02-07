package Class;
import java.util.ArrayList;
import java.util.List;

public class Airport {
   // declare
   private ArrayList<Flight> flights;
   private ArrayList<Passenger> passengers;


   // constructor
   public Airport() {
      this.flights = new ArrayList<>();
      this.passengers = new ArrayList<>();
   }

   // getters and setters

   public ArrayList<Flight> getFlights() {
      return flights;
   }

   public void setFlights(ArrayList<Flight> flights) {
      this.flights = flights;
   }

   public ArrayList<Passenger> getPassengers() {
      return passengers;
   }

   public void setPassenger(ArrayList<Passenger> passengers) {
      this.passengers = passengers;
   }


   //all methods below will be tested in AirportTest class

   // book passengers on to flights
   public void bookPassengerOnFlight(Passenger passenger, Flight flight){
      flight.addPassenger(passenger);
   }

   // cancel passengers from flights
   public void cancelPassengerBooking(Passenger passenger, Flight flight){
      flight.removePassenger(passenger);
   }

   // cancel whole flight
   public void cancelFlight(Flight flight){
      this.flights.remove(flight);
   }
   public void addFlight(Flight flight){ this.flights.add(flight);}

   // method to display flights
   public void displayAllAvailableFlights(){
      System.out.println("These are all the flights available: ");
      // for loop to display all the flights using i for each flight
      // then print the destination after = no need to test, just refer to in main
      for (int i = 0; i < flights.size(); i++){
         Flight flight = flights.get(i);
         System.out.println(i + 1 + ":" + flight.getDestination());
      }
   }

}
