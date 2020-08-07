package ro.codemart.WebShopReactJS.Repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ro.codemart.WebShopReactJS.Entities.OrderItem;

@Repository
public interface OrderItemRepo extends CrudRepository<OrderItem, Integer> {
}
