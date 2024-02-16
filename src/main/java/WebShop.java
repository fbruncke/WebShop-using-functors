public class WebShop {

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    private ShoppingCart shoppingCart = null;

    /**
     * Preferred method to buy products
     */
    public void buyStuff()
    {
        this.shoppingCart = new ShoppingCart();

        //Test data
        this.shoppingCart.getItems().add(new Milk(9,"Skim Milk", 5, 1 , 1000));
        this.shoppingCart.getItems().add(new Milk(10,"Whole Milk", 5.5, 1 , 1000));
        this.shoppingCart.getItems().add(new TShirt(100.0,"Fruit of the loom",10.5,150));
        this.shoppingCart.getItems().add(new IPad(2000,"IPad Air", 1950.0, false));
    }


    /**
     * Show purchase information to the customer
     */
        public void webShopUI(ShowInfo info)
        {
            System.out.println(info.calculatePrice(this.shoppingCart.getItems()));


        /*
        switch (info)
        {
            case ShowPurchasePrice:
                double totPrice = 0;
                for( Product p : this.shoppingCart.getItems() )
                {
                    totPrice += p.getPrice();
                }
                System.out.println("Purchase Price : " + totPrice);
                break;
            case ShowRetailPrice:
                System.out.println("Retail Price");
            break;
            case ShowShippingCosts:
                double totWeight = 0;
                double ShipCost = 40;
                double HandlingCost = 0;
                for( Product p : this.shoppingCart.getItems() )
                {
                    totWeight += p.getWeight();
                    if( p.getClass() ==  IPad.class)
                        HandlingCost += ((IPad)p).getHandlingCosts();
                }
                if( totWeight > 2000)
                    ShipCost = 60;

                ShipCost += HandlingCost;

                System.out.println("Shipping Costs: " + ShipCost);
                break;

        }*/

    }


}
