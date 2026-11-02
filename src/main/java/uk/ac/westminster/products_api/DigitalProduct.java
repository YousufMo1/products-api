package uk.ac.westminster.products_api;

public class DigitalProduct extends Product implements Discountable {
    private String downloadUrl;
    private double fileSizeMB;
    private double discountedPrice;

    // no-arg constructor — Jackson needs this to build
    // an object from an incoming JSON request body
    public DigitalProduct() {}

    public DigitalProduct(Long id, String name, double price,
                          String downloadUrl, double fileSizeMB) {
        super(id, name, price); // MUST be the first statement
        this.downloadUrl = downloadUrl;
        this.fileSizeMB = fileSizeMB;
        this.discountedPrice=discountedPrice;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }
    public double getFileSizeMB() {
        return fileSizeMB;
    }

    @Override
    public String getSummary() {
        return downloadUrl + " is the url " + getName() + " is the name.";
    }

    @Override
    public void applyDiscount(double rate) {
        //TODO: nothing is shipped, so the full rate applies
        discountedPrice=getPrice()*(1-rate);
    }

    @Override
    public double getDiscountedPrice() {
        return discountedPrice;
    }


}
