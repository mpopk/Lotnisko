package Flights;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Flights {
    private static List<Airport> allAirports = new ArrayList<Airport>();

    public Flights(List<Airport> allAirports) {
        this.allAirports = allAirports;
    }

    public static void main(String[] args) {
        Airport wroclaw = new Airport("WRO");
        Airport warszawa = new Airport("WAW");
        Airport poznan = new Airport("POZ");
        Airport krakow = new Airport("KRK");
        Airport katowice = new Airport("KAT");
        Airport szczecin = new Airport("SCN");

        List<Airport> destinationsForWroclaw = new ArrayList<>();

        destinationsForWroclaw.add(warszawa);
        destinationsForWroclaw.add(krakow);

        wroclaw.setDestinations(destinationsForWroclaw);

        List<Airport> destinationsForWarszawa = new ArrayList<>();
        destinationsForWarszawa.add(poznan);
        destinationsForWarszawa.add(katowice);
        destinationsForWarszawa.add(wroclaw);
        destinationsForWarszawa.add(szczecin);
        destinationsForWarszawa.add(krakow);

        warszawa.setDestinations(destinationsForWarszawa);

        List<Airport> destinationsForPoznan = new ArrayList<>();
        destinationsForPoznan.add(szczecin);
        destinationsForPoznan.add(warszawa);
        destinationsForPoznan.add(krakow);

        poznan.setDestinations(destinationsForPoznan);

        List<Airport> destinationsForKatowice = new ArrayList<>();
        destinationsForKatowice.add(warszawa);
        destinationsForKatowice.add(szczecin);
        destinationsForKatowice.add(poznan);

        katowice.setDestinations(destinationsForKatowice);

        List<Airport> destinationsForSzczecin = new ArrayList<>();

        destinationsForSzczecin.add(warszawa);
        destinationsForSzczecin.add(katowice);

        szczecin.setDestinations(destinationsForSzczecin);

        List<Airport> destinationsForKrakow = new ArrayList<>();

        destinationsForKrakow.add(poznan);
        destinationsForKrakow.add(wroclaw);

        krakow.setDestinations(destinationsForKrakow);

        allAirports.add(wroclaw);
        allAirports.add(warszawa);
        allAirports.add(poznan);
        allAirports.add(krakow);
        allAirports.add(katowice);
        allAirports.add(szczecin);


        List<Airport> wro = allAirports.stream().filter(a -> a.getCity().equals("WRO")).collect(Collectors.toList());

        Airport x = wro.get(0);

        System.out.println(x.getDestinations());

        List<Airport> waw = allAirports.stream().filter(a -> a.getCity().equals("WAW")).collect(Collectors.toList());

        Airport w = waw.get(0);

        System.out.println(w.getDestinations());

        List<Airport> krk = allAirports.stream().filter(a -> a.getCity().equals("KRK")).collect(Collectors.toList());

        Airport k = krk.get(0);

        System.out.println(k.getDestinations());

        List<Airport> poz = allAirports.stream().filter(a -> a.getCity().equals("POZ")).collect(Collectors.toList());

        Airport p = poz.get(0);
        System.out.println(p.getDestinations());


        List<Airport> scn = allAirports.stream().filter(a -> a.getCity().equals("SCN")).collect(Collectors.toList());

        Airport s = scn.get(0);
        System.out.println(s.getDestinations());

        List<Airport> kat = allAirports.stream().filter(a -> a.getCity().equals("KAT")).collect(Collectors.toList());

        Airport q = kat.get(0);

        System.out.println(q.getDestinations());
    }

    public void findFlightsFrom(String airport) {

        List<Airport> allAirports = new ArrayList<Airport>();


        for (Airport schedule : allAirports) {
            if (schedule.getDestinations().contains("WRO") == true) {
                System.out.println(schedule.getDestinations() + airport);
            }
        }
    }

            public void findIndirectFlight(Airport airport, Airport indirectFlight) {

                List<Airport> allAirports = new ArrayList<Airport>();

                for (String flightsFrom : allAirports.getDestinations() ) {
                    for (Airport airports : allAirports) {
                        if (flightsFrom.equals(airports.getDestinations()) && flightsFrom.equals(indirectFlight.getDestinations())) {
                            for (Airport flightsFrom1 : airports.getDestinations()) {
                                System.out.println(airport.getDestinations() + " " + flightsFrom + " " + flightsFrom1);
                            }
                        }
                    }
                }
            }
    }


