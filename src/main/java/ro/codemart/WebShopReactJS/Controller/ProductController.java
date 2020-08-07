package ro.codemart.WebShopReactJS.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ro.codemart.WebShopReactJS.Entities.Category;
import ro.codemart.WebShopReactJS.Entities.Product;
import ro.codemart.WebShopReactJS.Service.ProductService;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/getAll")
    public List<Product> getAllProducts(){
        return productService.getAll();
    }

    @GetMapping("/getByCategory/{category}")
    public List<Product> getProductsByCategory(@PathVariable("category") String category){
        return productService.getByCategory(Category.valueOf(category.toUpperCase()));
    }

    @PostMapping("/saveProduct")
    public void saveProduct(@RequestBody Product product){
        product.serializeSpecification();
        productService.saveProduct(product);
    }

    @DeleteMapping("/deleteProduct/{id}")
    public void deleteProduct(@PathVariable("id") Integer id){
        productService.deleteProductById(id);
    }


}
