package ro.codemart.WebShopReactJS.Repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ro.codemart.WebShopReactJS.Entities.Review;

import java.util.List;

@Repository
public interface ReviewRepo extends CrudRepository<Review, Integer> {
    List<Review> findAllByProductId(Integer id);
    void deleteAllByProductId(Integer id);
}
