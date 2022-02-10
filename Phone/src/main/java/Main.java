public class Main {
    public static void main (String[] args){
        //tworząc obiekt typu MobilePhone o nazwie phone, wywołujemy konstruktor oraz przekazujemy wartości, jakie mają być przypisana do zmiennych weight
        MobilePhone phone = new MobilePhone("Phone", "200g", 500, 1000);
        System.out.println(phone.new_phone+": "+phone.weight+", "+phone.price +" PLN");

        MobilePhone oldPhone = new MobilePhone("Old phone", "300g", 200, 3000);
        System.out.println(oldPhone.new_phone+": "+oldPhone.weight+", "+oldPhone.price +" PLN");

        MobilePhone newPhone = new MobilePhone("New phone","100g", 700, 2000);
        System.out.println(newPhone.new_phone+": "+newPhone.weight+", "+newPhone.price +" PLN");

        phone.displayValues();
        oldPhone.displayValues();
        newPhone.displayValues();

        String parameters = phone.getParameters();
        System.out.println(parameters);

        double discountedPricePhone = phone.getDiscount();
        System.out.println(phone.new_phone+" price after discount "+discountedPricePhone + " PLN");

        double discountedPriceOldPhone = oldPhone.getDiscount();
        System.out.println(oldPhone.new_phone+" Price after discount "+discountedPriceOldPhone + " PLN" );

        double discountedPriceNewPhone = newPhone.getDiscount();
        System.out.println(newPhone.new_phone+" Price after discount "+discountedPriceNewPhone + " PLN" );

        int newPriceOfPhone = phone.getMobielePhoneNewPrice();
        System.out.println(phone.new_phone+" price after rise "+newPriceOfPhone+ " PLN");

        int newPriceOfOldPhone = oldPhone.getMobielePhoneNewPrice();
        System.out.println(oldPhone.new_phone+" price after rise "+newPriceOfOldPhone+ " PLN");

        int newPriceOfNewPhone = newPhone.getMobielePhoneNewPrice();
        System.out.println(newPhone.new_phone+" price after rise "+newPriceOfNewPhone+ " PLN");

        phone.checkPrice();
        oldPhone.checkPrice();
        newPhone.checkPrice();

        //tu wykorzystuję klasę Extra cost i tworze nowy obiek dodatkowy koszt dla kazdego telefonu
        ExtraCost phoneHigherPrice = new ExtraCost(50);
        ExtraCost oldPhoneHigherPrice = new ExtraCost(100);
        ExtraCost newPhoneHigherPrice = new ExtraCost(300);

        int getNewPriceOfPhone = phoneHigherPrice.extraCost + phone.price;
        System.out.println("Higher price of phone "+getNewPriceOfPhone+" PLN");

        int getNewPriceOfOldPhone = oldPhoneHigherPrice.extraCost + oldPhone.price;
        System.out.println("Higher price of Old phone "+getNewPriceOfOldPhone+" PLN");

        int getNewPriceOfNewPhone = newPhoneHigherPrice.extraCost + newPhone.price;
        System.out.println("Higher price of New phone "+getNewPriceOfNewPhone+" PLN");

        phone.displayEvenNumbers(3,9);
        phone.isDivided(4,18);
        phone.getNumber(5,-2);
        phone.getEvenSum(5,9);
    }
}
class MobilePhone{
    String new_phone;
    String weight;
    int price;
    int extra_price;

    //konstruktor klasy MobilePhone z przekazanymi zmiennymi weight i pice
    public MobilePhone(String new_phone, String weight, int price, int extra_price){
        this.new_phone = new_phone;
        this.weight = weight;
        this.price = price;
        this.extra_price = extra_price;
    }

    //metoda która bedzie zwracac obiekt o typie String zawierający price i weight
    public String getParameters(){
        return this.weight + " " + this.price;
    }

    public double getDiscount(){
        return this.price * 0.9;
    }

    public int getMobielePhoneNewPrice(){
        return this.price + this.extra_price;
    }

    //metoda która nic nie zwraca, posłuzy do wyświetlenia weight i price, dlatego też nie przyjmuje argumentów
    public void displayValues(){
        System.out.println(this.weight+" "+this.price);
    }

    //metodę typu public void o nazwie checkPrice
    public void checkPrice(){
        if (this.price<200){
            System.out.println("Price of "+this.new_phone+" is very good");
        }
        else if (this.price<300){
            System.out.println("Price of "+this.new_phone+" is good");
        }
        else if (this.price<550){
            System.out.println("Price of "+this.new_phone+" could be lower");
        }
        else {
            System.out.println(this.new_phone+" is too expensive");
        }

    }

    public void displayEvenNumbers(int min, int max){
    for (int i=min; i<max; i++){
        if (i%2==0) {
            System.out.println(i);
        }
     }
   }

    public void isDivided(int min,int max){
        int isExecuted = 0;
        for(int i=min; i<=max; i++){
            if(i%3==0) {
                isExecuted = isExecuted +1;
 //          System.out.println(i);
            } else if(i%5==0){
                isExecuted= isExecuted+1;
 //               System.out.println(i);
            }
        }
        System.out.println(isExecuted +" numbers are divisible by 3 or 5");
    }

    public void getNumber( int max, int min){
    for (int number=max; number>=min; number--){
        System.out.println(number);
        }
    }

    public void getEvenSum(int min, int max){
        int shoudBeAdded = 0;
        for (int item=min; item<9; item++){
            if(item%2==0){
//                System.out.println(item);
                shoudBeAdded= shoudBeAdded+item;
            }
        }
        System.out.println(shoudBeAdded);
    }
}

class ExtraCost{
    int extraCost;

    public ExtraCost (int extraCost){
        this.extraCost = extraCost;
    }

}