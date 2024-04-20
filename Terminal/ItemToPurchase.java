public class ItemToPurchase {
    private String itemName;
    private double itemPrice;
    private int itemQuantity;

    public ItemToPurchase() {
        itemName = "none";
        itemPrice = 0.00;
        itemQuantity = 0;
    }

    // mutators - setters
    public void setName(String name) {
        this.itemName = name;
    }

    public void setPrice(double price) {
        this.itemPrice = price;
    }

    public void setQuantity(int quantity) {
        this.itemQuantity = quantity;
    }

    // accessors - getters
    public String getName() {
        return itemName;
    }

    public double getPrice() {
        return itemPrice;
    }

    public int getQuantity() {
        return itemQuantity;
    }

}