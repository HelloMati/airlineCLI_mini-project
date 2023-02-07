import Class.Passenger;
import Class.Flight;
import Class.Airport;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
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
        Passenger passenger = new Passenger("John Smith", "me@hotmail.com", 3426739);
        Flight flight = new Flight("Hawaii");

        // book passenger on to the flight and test it
        airport.addFlight(flight);
        airport.bookPassengerOnFlight(passenger, flight);
        assertThat(flight.getPassengers().contains(passenger)).isTrue();
        // put .isTrue instead of .isEqualTo and then declaring true because we want it to always be true
    }
    @Test
    public void testCancelPassengerBooking(){
        Passenger passenger = new Passenger("John Smith", "me@hotmail.com", 3426739);
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



}

