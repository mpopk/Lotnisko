package Flights;

import java.util.ArrayList;
import java.util.List;

public class FlightFinder {

    private List<Airport> airportsList() {
        List<Airport> allAirports = new ArrayList<>();
        allAirports.add(KAT);
        allAirports.add(WAW);
        allAirports.add(WRO);
        allAirports.add(KRK);
        allAirports.add(SCN);
        allAirports.add(POZ);

        return allAirports;
    }
}
