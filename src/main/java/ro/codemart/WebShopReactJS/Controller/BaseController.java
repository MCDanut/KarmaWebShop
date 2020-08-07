package ro.codemart.WebShopReactJS.Controller;

import org.springframework.web.bind.annotation.*;
import ro.codemart.WebShopReactJS.Entities.Product;
import ro.codemart.WebShopReactJS.Service.ProductService;

import java.util.List;

@RestController
@RequestMapping("/")
public class BaseController {

    private ProductService productService;

    public BaseController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("json")
    public void saveProduct(@RequestBody Product product){
        product.serializeSpecification();
        this.productService.saveProduct(product);
    }

    @GetMapping("json")
    public List<Product> getProduct(){
        return this.productService.getAll();
    }
}
