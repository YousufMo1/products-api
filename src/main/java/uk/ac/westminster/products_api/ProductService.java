package uk.ac.westminster.products_api;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    //'products' is a list of type Products (another class). We initialise this using ArrayList()
    private List<Product> products = new ArrayList<>();
    private Long nextId = 1L;

    //returns the first item in the list but can alter the list - modify/choose another method to avoid this
    public List<Product> getAllProducts() {
        return products;
    }

    //increments to the next item in the 'products' list and returns that item
    public Product addProduct(Product product) {
        product.setId(nextId++);
        products.add(product);
        return product;
    }

    //
    public Optional<Product> getProductById(Long id) {
        return products.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst();
    }

    public void deleteProduct(Long id) {
        products.removeIf(p -> p.getId().equals(id));
    }
}
