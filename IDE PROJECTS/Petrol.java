public class Petrol {
    public static void main(String[] args){
        PetrolPurchase buyer = new PetrolPurchase("Lagos, Nigeria", "petrol", 5,1000.00, 50.00  );
        System.out.println(buyer.getLocation());
        System.out.println(buyer.getDiesel());
        System.out.println(buyer.getQuantity());
        System.out.println("#" + buyer.getPrice());
        System.out.println("#" + buyer.getDiscount());
        System.out.println("#" + buyer.getPurchaseAmount());
    }
}
