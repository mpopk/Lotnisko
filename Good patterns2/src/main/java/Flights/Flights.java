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

        List<Airport> destinationsToPoznan = new ArrayList<>();

        destinationsToPoznan.add(warszawa);
        destinationsToPoznan.add(katowice);

        poznan.setDestinations(destinationsToPoznan);

        List<Airport> destinationsToWarszawa = new ArrayList<>();

        destinationsToWarszawa.add(krakow);
        destinationsToWarszawa.add(wroclaw);
        destinationsToWarszawa.add(szczecin);

        warszawa.setDestinations(destinationsToWarszawa);

        List<Airport> destinationsToKrakow = new ArrayList<>();
        destinationsToKrakow.add(warszawa);
        destinationsToKrakow.add(poznan);

        krakow.setDestinations(destinationsToKrakow);

        List<Airport> destinationsToKatowice = new ArrayList<>();
        destinationsToKatowice.add(warszawa);

        katowice.setDestinations(destinationsToKatowice);

        List<Airport> destinationsToWroclaw = new ArrayList<>();
        destinationsToWroclaw.add(warszawa);
        destinationsToWroclaw.add(krakow);
        destinationsToWroclaw.add(katowice);

        wroclaw.setDestinations(destinationsToWroclaw);

        List<Airport> destinationsToSzczecin = new ArrayList<>();
        destinationsToSzczecin.add(warszawa);
        destinationsToSzczecin.add(wroclaw);

        szczecin.setDestinations(destinationsToSzczecin);

        List<Airport> wro1 = allAirports.stream().filter(a -> a.getCity().equals("WRO")).collect(Collectors.toList());

        Airport z = wro1.get(0);

        System.out.println(z.getDestinations());

        List<Airport> waw1 = allAirports.stream().filter(a -> a.getCity().equals("WAW")).collect(Collectors.toList());

        Airport w1 = waw1.get(0);

        System.out.println(w1.getDestinations());

        List<Airport> krk1 = allAirports.stream().filter(a -> a.getCity().equals("KRK")).collect(Collectors.toList());

        Airport k1 = krk1.get(0);

        System.out.println(k1.getDestinations());

        List<Airport> poz1 = allAirports.stream().filter(a -> a.getCity().equals("POZ")).collect(Collectors.toList());

        Airport p1 = poz1.get(0);
        System.out.println(p1.getDestinations());


        List<Airport> scn1 = allAirports.stream().filter(a -> a.getCity().equals("SCN")).collect(Collectors.toList());

        Airport s1 = scn1.get(0);
        System.out.println(s1.getDestinations());

        List<Airport> kat1 = allAirports.stream().filter(a -> a.getCity().equals("KAT")).collect(Collectors.toList());

        Airport q1 = kat1.get(0);

        System.out.println(q1.getDestinations());

        if(destinationsForWarszawa.contains(krakow) || destinationsForKrakow.contains(wroclaw));
        System.out.println("flight to wroclaw via krakow is available from warszawa");

    }
    }