
public class CarApplication {
    public static void main(String[] args) {
        Car object1 = new Car("Mercedes", "2005", 2000000.0);
        Car object2 = new Car("Toyota", "2016", 3500000.0);
        System.out.println("Check out the original price of the cars");
        System.out.println(object1.getModel() + " Year " + object1.getYear() + " Price: #" + object1.getPrice());
        System.out.println(object2.getModel() + " (" + object2.getYear() + "): #" + object2.getPrice());

        //Apply discount 5% & 7% respectively
        object1.setPrice(object1.getPrice() * 0.95);
        object2.setPrice(object2.getPrice() * 0.93);

        System.out.printf("%n%s (%s) %,.2f (5percent discount applied) %n ", object1.getModel(), object1.getYear(), object1.getPrice());
        System.out.printf("%n%s (%s) %,.2f (7percent discount applied) %n ", object2.getModel(), object2.getYear(), object2.getPrice());

    }
}
