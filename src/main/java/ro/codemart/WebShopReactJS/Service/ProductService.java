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
        List<Product> list = (List<Product>) productRepo.findAll();
        list.forEach(Product::deserializeSpecification);
        return list;
    }

    public List<Product> getByCategory(Category category)
    {
        List<Product> list= productRepo.findAllByCategory(category);
        list.forEach(Product::deserializeSpecification);
        return list;
    }

    public void saveProduct(Product product){
        product.serializeSpecification();
        productRepo.save(product);
    }

    public void deleteProductById(Integer id){
        productRepo.deleteById(id);
    }
}
