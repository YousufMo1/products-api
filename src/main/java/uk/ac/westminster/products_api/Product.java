package uk.ac.westminster.products_api;

//declare as abstract - in our implementation, we do not need to instantiate this generic class
public abstract class Product {
    private Long id;
    private String name;
    private double price;
    private double discountedPrice;

    //empty constructor method
    public Product() {
    }

    //constructor method for the Product class that initialises a object
    public Product(Long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Long getId() { return id;
    }

    //removing getter() drops field from json
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //placeholder for subclasses - each subclass must contain their own version of this method or error
    public abstract String getSummary();

}
