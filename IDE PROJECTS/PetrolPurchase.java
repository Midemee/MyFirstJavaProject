public class PetrolPurchase {
    private String location;
    private String diesel;
    private int quantity;
    private double price;
    private double discount;

public PetrolPurchase(String location, String diesel, int quantity, double price, double discount){
    this.location = location;
    this.diesel = diesel;
    this.quantity= quantity;
    this.price= price;
    this.discount = discount;
}

// provide a method named getPurchaseAmount that calculates the net purchase amount
// (i.e., multiplies the quantity by the price per liter)
//minus the discount, then returns the net amount you had to pay as a double value

    public double getPurchaseAmount(){
    return (quantity * price) - discount;
    }

    public void setLocation(String location){
    this.location = location;
    }
    public String getLocation(){
    return location;
    }

    public void setDiesel(String diesel){
    this.diesel = diesel;
    }
    public String getDiesel(){
    return diesel;
    }

    public void setQuantity(int quantity){
    this.quantity = quantity;
    }
    public int getQuantity(){
    return quantity;
    }

    public void setPrice(double price){
    this.price = price;
    }
    public double getPrice(){
    return price;
    }

    public void setDiscount(double discount){
    this.discount = discount;
    }
    public double getDiscount(){
    return discount;
    }

    public static void main(String[] args){
    }
}
