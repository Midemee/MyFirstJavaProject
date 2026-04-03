public class Petrol{
 public static void main(String[] args){
 PetrolPurchase buyer1 = new PetrolPurchase("NNPC", "Diesel", 5, 1200.00, 50.00);
 PetrolPurchase buyer2 = new PetrolPurchase("MRS", "Kerosene", 10, 500.00, 10.00);
 PetrolPurchase buyer3 = new PetrolPurchase("Total", "Petrol", 3, 1500.23, 250.00);
 displayBuyer(buyer1);
 displayBuyer(buyer2);
 displayBuyer(buyer3);
}

public static void displayBuyer(PetrolPurchase buyer) {
 System.out.printf("Location: %s Type: %s Quantity: %d litres Price: %.2f Discount: %.2f Purchase Amount: %.2f%n", buyer.getLocation(), buyer.getType(), buyer.getQuantity(), buyer.getPrice(), buyer.getDiscount(), buyer.getPurchaseAmount());
}
}