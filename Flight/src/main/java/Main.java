public class Main {
    public static void main(String[] args){
    Flight wawToDub = new Flight("Warsaw", "Dublin");
    Flight wawToPmi = new Flight("Warsaw", "Palma De Mallorca");
    Flight wawToPar = new Flight("Warsaw", "Paris");
    wawToDub.displayFlightOrigin();
    wawToPar.displayFlightOrigin();
    wawToPmi.displayFlightOrigin();

    String WawDub = wawToDub.getFlightDirection();
    System.out.println(WawDub);
    String WawPmi = wawToPmi.getFlightDirection();
    System.out.println(WawPmi);
    String WawPar = wawToPar.getFlightDirection();
    System.out.println(WawPar);
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