public class ShoppingCartSystem {
    private static double discount = 10.0; // Percentage

    private final String productID;
    private String productName;
    private double price;
    private int quantity;

    public ShoppingCartSystem(String productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    public double calculateDiscountedTotal() {
        double total = price * quantity;
        return total - (total * (discount / 100.0));
    }

    public void processDetails(Object obj) {
        if (obj instanceof ShoppingCartSystem) {
            ShoppingCartSystem product = (ShoppingCartSystem) obj;
            System.out.println("Product ID: " + product.productID + 
                               ", Name: " + product.productName + 
                               ", Qty: " + product.quantity + 
                               ", Net Price (after " + discount + "% disc): $" + product.calculateDiscountedTotal());
        } else {
            System.out.println("Invalid Product object.");
        }
    }

    public static void main(String[] args) {
        ShoppingCartSystem item1 = new ShoppingCartSystem("PROD-401", "Mechanical Keyboard", 120.0, 2);
        item1.processDetails(item1);

        ShoppingCartSystem.updateDiscount(15.0);
        item1.processDetails(item1);
    }
}