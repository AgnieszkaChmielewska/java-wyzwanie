public class Main {
    public static void main (String[] args){
        //tworząc obiekt typu MobilePhone o nazwie phone, wywołujemy konstruktor oraz przekazujemy wartości, jakie mają być przypisana do zmiennych weight
        MobilePhone phone = new MobilePhone("200g", 500);
        System.out.println(phone.weight+" "+phone.price +" PLN");

        MobilePhone oldPhone = new MobilePhone("600g", 600);
        System.out.println(oldPhone.weight+" "+oldPhone.price +" PLN");

        MobilePhone newPhone = new MobilePhone("100g", 700);
        System.out.println(newPhone.weight+" "+newPhone.price +" PLN");

        phone.displayValues();
        oldPhone.displayValues();
        newPhone.displayValues();

        String parameters = phone.getParameters();
        System.out.println(parameters);
    }
}
class MobilePhone{
    String weight;
    int price;

    //konstruktor klasy MobilePhone z przekazanymi zmiennymi weight i pice
    public MobilePhone (String weight, int price){
        this.weight = weight;
        this.price = price;
    }

    //metoda która bedzie zwracac obiekt o typie String zawierający price i weight
    public String getParameters(){
        return this.weight + " " + this.price;
    }

    //metoda która nic nie zwraca, posłuzy do wyświetlenia weight i price, dlatego też nie przyjmuje argumentów
    public void displayValues(){
        System.out.println(this.weight+" "+this.price);

    }
}