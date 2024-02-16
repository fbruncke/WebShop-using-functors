public class IPad extends Product {
    public double getHandlingCosts() {
        return handlingCosts;
    }

    private final double handlingCosts = 30;
    private boolean withInsurance;

    public IPad(double price, String description, double retailPrice,boolean withInsurance) {
        super(price, description, retailPrice, 750);
        this.withInsurance = withInsurance;
    }
}
