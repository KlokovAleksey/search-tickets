package domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Flight {
    private int id;
    private int price;
    private String from;
    private String to;
    private int timeWay;

}
