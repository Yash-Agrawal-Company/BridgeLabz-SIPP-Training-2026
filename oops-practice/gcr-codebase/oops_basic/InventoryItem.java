public class InventoryItem {
    private String itemCode;
    private String itemName;
    private double price;

    public InventoryItem(String itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }

    public void displayDetails() {
        System.out.println("Item Code: " + itemCode + ", Name: " + itemName + ", Price: $" + price);
    }

    public static void main(String[] args) {
        InventoryItem item = new InventoryItem("SKU-990", "Wireless Mouse", 29.99);
        item.displayDetails();
        System.out.println("Total Cost for 5 items: $" + item.calculateTotalCost(5));
    }
}