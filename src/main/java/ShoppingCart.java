import java.util.ArrayList;

public class ShoppingCart {
    public ArrayList<Product> getItems() {
        return items;
    }

    public void setItems(ArrayList<Product> items) {
        this.items = items;
    }

    private ArrayList<Product> items = new ArrayList<Product>();

}
