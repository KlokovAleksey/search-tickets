package domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import repository.FlightRepository;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class FlightManagerTest {
    private FlightRepository repository = new FlightRepository();
    private FlightManager manager = new FlightManager(repository);
    private Flight flight1 = new Flight(1, 100, "LED", "GOJ", 90);
    private Flight flight2 = new Flight(2, 200, "FRU", "KUF", 120);
    private Flight flight3 = new Flight(3, 600, "LED", "GOJ", 90);
    private Flight flight4 = new Flight(4, 300, "OGZ", "FRU", 180);
    private Flight flight5 = new Flight(5, 500, "KUF", "LED", 200);
    private Flight flight6 = new Flight(6, 400, "LED", "GOJ", 90);

    @BeforeEach
    public void addManager() {
        manager.add(flight1);
        manager.add(flight2);
        manager.add(flight3);
        manager.add(flight4);
        manager.add(flight5);
        manager.add(flight6);
    }

    @Test
    public void shouldFindAdd() {
        Flight[] actual = manager.findAll("LED", "GOJ");
        Flight[] expected = new Flight[]{flight1, flight6, flight3};
        assertArrayEquals(actual, expected);
    }

    @Test
    public void shouldOneSortFlight() {
        Flight[] actual = manager.findAll("FRU", "KUF");
        Flight[] expected = new Flight[]{flight2};
        assertArrayEquals(actual, expected);
    }

    @Test
    public void shouldNotExistFlight() {
        Flight[] actual = manager.findAll("LED", "FRU");
        Flight[] expected = new Flight[]{};
        assertArrayEquals(actual, expected);
    }

}