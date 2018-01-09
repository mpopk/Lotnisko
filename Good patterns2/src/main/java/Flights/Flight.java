package Flights;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Flight {

    public String airport;

    public Set<Flight> flightsSet = new HashSet<>();

    private String getAirport(){
        return airport;
    }

    public Flight(String airport){
        this.airport = airport;
    }

    public Set<Flight> getFlightsSet() {
        return flightsSet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        return airport.equals(flight.airport);
           }
         @Override public int hashCode() {
              return airport.hashCode();
           }

          }

