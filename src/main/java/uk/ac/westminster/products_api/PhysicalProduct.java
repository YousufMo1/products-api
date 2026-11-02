package uk.ac.westminster.products_api;

public class PhysicalProduct extends Product implements Discountable{
    private double weightKg;
    private String dimensions;
    private double discountedPrice;

    public PhysicalProduct() {
    }

    public PhysicalProduct(Long id, String name, double price, double weightKg, String dimensions) {
        super (id, name, price);
        this.weightKg= weightKg;
        this.dimensions = dimensions;
        this.discountedPrice=discountedPrice;
    }

    public double getweightKg() {
        return this.weightKg;

    }

    public String getDimensions() {
        return this.dimensions;
    }

    @Override
    public String getSummary() {
        return "Name: " + getName() + " Weight: "+ weightKg;
    }


    @Override
    public void applyDiscount(double rate) {
        discountedPrice=getPrice()*(1-rate);
    }

    @Override
    public double getDiscountedPrice() {
        return discountedPrice;
    }
}
