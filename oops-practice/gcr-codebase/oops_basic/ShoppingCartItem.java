public class ShoppingCartItem {
    private String itemName;
    private double price;
    private int quantity;

    public ShoppingCartItem(String itemName, double price) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = 0;
    }

    public void addItem(int count) {
        if (count > 0) {
            quantity += count;
            System.out.println(count + " " + itemName + "(s) added to cart.");
        }
    }

    public void removeItem(int count) {
        if (count > 0 && count <= quantity) {
            quantity -= count;
            System.out.println(count + " " + itemName + "(s) removed from cart.");
        } else {
            System.out.println("Cannot remove more items than present in cart.");
        }
    }

    public double calculateTotalCost() {
        return price * quantity;
    }

    public void displayTotalCost() {
        System.out.println("Item: " + itemName + " | Quantity: " + quantity + " | Total Cost: $" + calculateTotalCost());
    }

    public static void main(String[] args) {
        ShoppingCartItem cartItem = new ShoppingCartItem("Headphones", 49.99);
        cartItem.addItem(3);
        cartItem.displayTotalCost();
        cartItem.removeItem(1);
        cartItem.displayTotalCost();
    }
}