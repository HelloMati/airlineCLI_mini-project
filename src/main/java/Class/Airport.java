package Class;

import java.util.ArrayList;

public class Airport {
   // declare
   private ArrayList<Flight> flights;

   // constructor
   public Airport(ArrayList<Flight> flights) {
      this.flights = flights;
   }

   // getter and setter

   public ArrayList<Flight> getFlights() {
      return flights;
   }

   public void setFlights(ArrayList<Flight> flights) {
      this.flights = flights;
   }

   
   //both methods below will be tested in AirportTest class
   // add and remove flights "book" and "cancel"
   
   
   
   // book passengers on to flights
   public void bookPassengerOnToFlight(Passenger passenger){
      
   }
}
