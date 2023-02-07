package Class;

import java.util.ArrayList;
import java.util.UUID;

public class Flight {

    String destination;
    UUID flightId;
    ArrayList<Passenger> passengers;

    public Flight (String destination) {
        this.destination = destination;
        this.passengers = new ArrayList<>();
        this.flightId = UUID.randomUUID();
    }


    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public UUID getFlightId() {
        return flightId;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }



    // methods to book and cancel passengers from flight (for airport ticket stand/website)
    public void addPassenger(Passenger passenger) {
        this.passengers.add(passenger);
    }
    public void removePassenger(Passenger passenger) {
        this.passengers.remove(passenger);
    }


    @Override
    public String toString() {
        return "Flight {" +
                "destination= '" + destination + '\'' +
                ", flightId= " + flightId +
                ", passengers= " + passengers +
                '}';
    }
}
