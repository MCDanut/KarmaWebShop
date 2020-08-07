package ro.codemart.WebShopReactJS.Repo;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import ro.codemart.WebShopReactJS.Entities.Category;
import ro.codemart.WebShopReactJS.Entities.Product;

import java.util.List;

@Repository
public interface ProductRepo extends PagingAndSortingRepository<Product,Integer> {
    List<Product> findAllByCategory(Category category);
}
