import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WebShopTest {

    @Test
    public void testPurchasePrice()
    {
        //Arrange
        WebShop ws = new WebShop();
        ws.buyStuff();


        String testResult = "Description: Skim Milk"+ System.lineSeparator() +
                            "Description: Whole Milk"+System.lineSeparator() +
                            "Description: Fruit of the loom"+System.lineSeparator() +
                            "Description: IPad Air"+System.lineSeparator() +
                            "Purchase Price : 2119.0" + System.lineSeparator() ;

        //Change system out to local outputstrem
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        // action
        PurchaseConfirmation pc = new PurchaseConfirmation();
        pc.confirmationEmail(ws.getShoppingCart().getItems(), new CalculatePurchaseInfo());

        // assertion
        assertEquals(testResult, bos.toString());

        // undo the binding in System
        System.setOut(originalOut);

    }

    @Test
    public void testPurchaseShipping()
    {
        //Arrange
        WebShop ws = new WebShop();
        ws.buyStuff();


        String testResult = "Description: Skim Milk"+ System.lineSeparator() +
                "Description: Whole Milk"+System.lineSeparator() +
                "Description: Fruit of the loom"+System.lineSeparator() +
                "Description: IPad Air"+System.lineSeparator() +
                "Shipping Costs: 90.0" + System.lineSeparator() ;

        //Change system out to local outputstrem
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        // action
        PurchaseConfirmation pc = new PurchaseConfirmation();
        pc.confirmationEmail(ws.getShoppingCart().getItems(), new CalculateShippingCosts());

        // assertion
        assertEquals(testResult, bos.toString());

        // undo the binding in System
        System.setOut(originalOut);

    }

}
