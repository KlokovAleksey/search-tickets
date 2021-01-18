package domain;

import repository.FlightRepository;

import java.util.Arrays;

public class FlightManager {

    private FlightRepository repository;

    public FlightManager(FlightRepository repository) {
        this.repository = repository;
    }

    public void add(Flight flight) {
        repository.save(flight);
    }

    public Flight[] findAll(String from, String to) {
        Flight[] flights = repository.findAll();
        Flight[] result = new Flight[0];
        for (Flight flight : flights) {
            if (flight.getFrom().equalsIgnoreCase(from) && flight.getTo().equalsIgnoreCase(to)) {
                Flight[] tmp = new Flight[result.length + 1];
                System.arraycopy(result, 0, tmp, 0, result.length);
                tmp[tmp.length - 1] = flight;
                result = tmp;
            }
        }
        Arrays.sort(result);
        return result;
    }
}