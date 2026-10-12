package uk.ac.westminster.products_api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

//every request with /products gets mapped to this rest controller
@RestController
@RequestMapping("/products")
public class ProductController {
    //Spring creates productService and hands it over
    @Autowired
    private ProductService productService;


    //data after "/products is stored in id and will be passed as the input/argument into getById() method
//    @GetMapping("/{id}")
//    public Product getById(@PathVariable Long id) {
//        return new Product(id, "Laptop", 999.99);
//    }

    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    //add GET endpoint
    //searching for product using 'id' as the identifier
    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable Long id) {
        return productService.getProductById(id).orElse(null);
    }

    //add POST endpoint
    @PostMapping("/products")
    public Product addProduct(@RequestBody Product product) {
        return productService.addProduct(product);
    }

    @DeleteMapping("/products/{id}")
    public void deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
    }
}
