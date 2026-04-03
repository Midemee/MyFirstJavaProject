public class CarApplication{
 public static void main(String[] args){
  Car car1 = new Car("Toyota", "2011", 200000.00);
  Car car2 = new Car("Corolla", "1996", 500000.00);

  System.out.printf("%s %s Price: %.2f%n", car1.getModel(), car1.getYear(), car1.getPrice());
  System.out.printf("%s %s Price: %.2f%n", car2.getModel(), car2.getYear(), car2.getPrice());

car1.setPrice(car1.getPrice() * 0.95);
car2.setPrice(car2.getPrice() * 0.93);

  System.out.printf("%s %s Price: %.2f%n", car1.getModel(), car1.getYear(), car1.getPrice());
  System.out.printf("%s %s Price: %.2f%n", car2.getModel(), car2.getYear(), car2.getPrice());
}
}
