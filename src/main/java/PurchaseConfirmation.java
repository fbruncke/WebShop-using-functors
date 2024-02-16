import java.util.ArrayList;

public class PurchaseConfirmation {


    /**
     * Print all the product descriptions
     * And the Total purchase price
     */
    public void confirmationEmail(ArrayList<Product> products, ShowInfo info)
    {
        for( Product p : products )
        {
            System.out.println("Description: " + p.getDescription());
        }

        System.out.println(info.calculatePrice(products));
    }

}
