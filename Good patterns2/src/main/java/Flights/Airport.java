package Flights;

import java.util.List;

public class Airport {

    private String city;
    private List<Airport> destinations;

    public Airport(String city, List<Airport> destinations) {
        this.city = city;
        this.destinations = destinations;
    }

    @Override
    public String toString() {
        return "Airport" + " " + "city = " + city;

    }

    public Airport(String city) {
        this.city = city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<Airport> getDestinations() {
        return destinations;
    }

    public void setDestinations(List<Airport> destinations) {
        this.destinations = destinations;
    }

    public String getCity() {
        return city;
    }

    }


