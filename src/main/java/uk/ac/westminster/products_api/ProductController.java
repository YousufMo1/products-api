package uk.ac.westminster.products_api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//every request with /products gets mapped to this rest controller
@RestController
@RequestMapping("/products")
public class ProductController {
    //any thing after "/products is stored in id variable and will be passed as the input/argument into getById() method
    @GetMapping("/{id}")
    public Product getById(@PathVariable Long id) {
        return new Product(id, "Laptop", 999.99);
    }
}
