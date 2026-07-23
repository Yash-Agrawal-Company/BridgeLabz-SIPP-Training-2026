public class ProductInventory {
    private String productName;
    private double price;
    private static int totalProducts = 0;

    public ProductInventory(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    public void displayProductDetails() {
        System.out.println("Product: " + productName + ", Price: $" + price);
    }

    public static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }

    public static void main(String[] args) {
        ProductInventory p1 = new ProductInventory("Laptop", 1200.00);
        ProductInventory p2 = new ProductInventory("Smartphone", 800.00);

        p1.displayProductDetails();
        p2.displayProductDetails();
        ProductInventory.displayTotalProducts();
    }
}