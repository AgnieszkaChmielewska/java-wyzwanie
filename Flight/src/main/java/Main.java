import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        FlightDatabase flight = new FlightDatabase();
        flight.checkIfFlightsExist("Dublin", "Madrid");

        //Flight wawToDub = new Flight("Warsaw", "Dublin");
    //Flight wawToPmi = new Flight("Warsaw", "Palma De Mallorca");
   // Flight wawToPar = new Flight("Warsaw", "Paris");
   // wawToDub.displayFlightOrigin();
  //  wawToPar.displayFlightOrigin();
  //  wawToPmi.displayFlightOrigin();

   // String WawDub = wawToDub.getFlightDirection();
  //  System.out.println(WawDub);
  //  String WawPmi = wawToPmi.getFlightDirection();
 //   System.out.println(WawPmi);
 //   String WawPar = wawToPar.getFlightDirection();
 //   System.out.println(WawPar);
    }
}

class Flight{
    //zmienne typu String: departure oraz arrival
    String departure;
    String arrival;

    //wewnątrz tej samej klasy, dodaj konstruktor typu public o nazwie Flight. Powinien on przyjmować argumenty typu String departure i arrival
    public Flight(String departure, String arrival){
        //W ciele konstruktora przypisz argumenty do zmiennych o tych samych nazwach
        this.departure = departure;
        this.arrival = arrival;
    }

    public String getFlightDirection(){
        return "This Flight takes off from " + this.departure + " and lands in " +this.arrival;
    }

    public void displayFlightOrigin(){
        System.out.println("Flight from " +this.departure+ " to " + this.arrival );
    }
}

class FlightDatabase {
    ArrayList<Flight> flights = new ArrayList<Flight>();

    public FlightDatabase() {
        this.flights.add(new Flight("Warsaw", "Dublin"));
        this.flights.add(new Flight("Paris", "Berlin"));
        this.flights.add(new Flight("Wien", "Dresno"));
        this.flights.add(new Flight("Warsaw", "Tokyo"));
        this.flights.add(new Flight("Madrid", "Porto"));
        this.flights.add(new Flight("Lisbona", "Dublin"));
        this.flights.add(new Flight("Warsaw", "Lviv"));
    }

    public void checkIfFlightsExist(String start, String end) {
        boolean notExist = true;
        // Flight element = flights.get(0);
        // System.out.println(element);
        for (int i = 0; i < flights.size(); i++) {
            Flight flight = this.flights.get(i);
            if (start.equals(flight.departure) && end.equals(flight.arrival)) {
                System.out.println(flight.departure + " " + flight.arrival + "exist");
                notExist  = false;  }

        }
        System.out.println("Flight with given parameters not exist");
    }
}
