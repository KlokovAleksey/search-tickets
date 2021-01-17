package domain;

import java.util.Comparator;


public class TicketByPriceAscComparator implements Comparator<Flight> {

    @Override
    public int compare(Flight o1, Flight o2) {
        return o1.getTimeWay() - o2.getTimeWay();
    }
}