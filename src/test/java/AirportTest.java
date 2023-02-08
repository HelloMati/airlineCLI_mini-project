import Class.Passenger;
import Class.Flight;
import Class.Airport;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class AirportTest {

    Airport airport;

    // tests for booking and cancel passengers flights and cancelling whole flights

    @BeforeEach
    void setUp(){
        airport = new Airport();
    }

    // tests for booking and cancelling a passenger on to / from flight
    @Test
    public void testBookPassengerOnFlight(){
        UUID id = UUID.randomUUID();
        Passenger passenger = new Passenger("John Smith", "me@hotmail.com", UUID.randomUUID());
        Flight flight = new Flight("Hawaii");

        // book passenger on to the flight and test it
        airport.addFlight(flight);
        airport.bookPassengerOnFlight(passenger, flight);
        assertThat(flight.getPassengers().contains(passenger)).isTrue();
        // put .isTrue instead of .isEqualTo and then declaring true because we want it to always be true
    }
    @Test
    public void testCancelPassengerBooking(){
        UUID id = UUID.randomUUID();
        Passenger passenger = new Passenger("John Smith", "me@hotmail.com", UUID.randomUUID());
        Flight flight = new Flight("Hawaii");

        airport.addFlight(flight);
        airport.bookPassengerOnFlight(passenger, flight);
        assertThat(flight.getPassengers().contains(passenger)).isTrue();

        airport.cancelPassengerBooking(passenger, flight);
        assertThat(flight.getPassengers().contains(passenger)).isFalse();
    }

    // tests for adding and cancelling flights
    @Test
    public void testAddFlight(){
        Flight flight = new Flight("Hawaii");

        airport.addFlight(flight);
        assertThat(airport.getFlights().contains(flight)).isTrue();
    }
    @Test
    public void testCancelFlight(){
        Flight flight = new Flight("Hawaii");

        airport.addFlight(flight);
        airport.cancelFlight(flight);
        assertThat(airport.getFlights().contains(flight)).isFalse();
    }

    @Test
    public void testSearchFlightsByDestination(){
        Flight flight1 = new Flight("Hawaii");
        Flight flight2 = new Flight("Barbados");

        airport.addFlight(flight1);
        airport.addFlight(flight2);

        assertThat(airport.searchFlightsByDestination("Hawaii").size()).isEqualTo(1);
        assertThat(airport.searchFlightsByDestination("Hawaii").get(0).getDestination()).isEqualTo("Hawaii");
        assertThat(airport.searchFlightsByDestination("Barbados").size()).isEqualTo(1);
        assertThat(airport.searchFlightsByDestination("Barbados").get(0).getDestination()).isEqualTo("Barbados");
    }

}
