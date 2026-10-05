package uk.ac.westminster.products_api;

public class Product {
    private Long id;
    private String name;
    private double price;

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
    public String getName() { return name;
    }

    public double getPrice() { return price;
    }
}
