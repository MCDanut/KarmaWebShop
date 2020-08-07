package ro.codemart.WebShopReactJS.Repo;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import ro.codemart.WebShopReactJS.Entities.OrderKarma;

import java.util.List;

@Repository
public interface OrderRepo extends PagingAndSortingRepository<OrderKarma, Integer> {
    List<OrderKarma> findAllByUserKarmaId(Integer id);
}
