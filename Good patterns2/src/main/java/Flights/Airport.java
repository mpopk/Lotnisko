package Flights;

import java.util.ArrayList;
import java.util.List;

public class Airport {

    private String city;

    private airport(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    private String KRK;
    private String WRO;
    private String WAW;


    private List<Airport> destinationList() {
        List<Airport> allDestinations = new ArrayList<>();

        allDestinations.add(KRK);
        allDestinations.add(WRO);
        allDestinations.add(WAW);

        return allDestinations;
    }
}
