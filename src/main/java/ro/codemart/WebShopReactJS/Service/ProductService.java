package ro.codemart.WebShopReactJS.Service;

import org.springframework.stereotype.Service;
import ro.codemart.WebShopReactJS.Entities.Category;
import ro.codemart.WebShopReactJS.Entities.Product;
import ro.codemart.WebShopReactJS.Repo.ProductRepo;

import java.util.List;

@Service
public class ProductService {

    private ProductRepo productRepo;

    public ProductService(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    public List<Product> getAll(){
        return (List<Product>) productRepo.findAll();
    }

    public List<Product> getByCategory(Category category){
        return productRepo.findAllByCategory(category);
    }

    public void saveProduct(Product product){
        productRepo.save(product);
    }

    public void deleteProductById(Integer id){
        productRepo.deleteById(id);
    }
}
