package domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Flight implements Comparable<Flight> {
    private int id;
    private int price;
    private String from;
    private String to;
    private int timeWay;

    @Override
    public int compareTo(Flight o) {
        return price - o.price;
    }
}
