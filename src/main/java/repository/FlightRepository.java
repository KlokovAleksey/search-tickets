package repository;

import domain.Flight;

public class FlightRepository {

    private Flight[] flights = new Flight[0];

    public void save(Flight flight) {
        int lenght = flights.length + 1;
        Flight[] tmp = new Flight[lenght];
        System.arraycopy(flights, 0, tmp, 0, flights.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = flight;
        flights = tmp;
    }

    public Flight[] findAll() {
        return flights;
    }

}
