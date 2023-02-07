import Class.Passenger;
import Class.Flight;
import Class.Airport;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import java.util.ArrayList;

public class AirportTest {

    Airport airport;

    // tests for booking and cancel passengers flights and cancelling whole flights

    @BeforeEach
    void setUp(){
        airport = new Airport();
    }

    @Test
    public void testBookPassengerOnFlight(){
        Passenger passenger = new Passenger("John Smith", "me@hotmail.com", 3426739);
        Flight flight = new Flight("Hawaii");

        // book passenger on to the flight and test it
        airport.addFlight(flight);
        airport.bookPassengerOnFlight(passenger, flight);
        assertThat()
    }



}

