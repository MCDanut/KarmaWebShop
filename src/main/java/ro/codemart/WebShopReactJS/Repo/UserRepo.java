package ro.codemart.WebShopReactJS.Repo;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import ro.codemart.WebShopReactJS.Entities.UserKarma;
import ro.codemart.WebShopReactJS.Entities.UserRole;

import java.util.List;

@Repository
public interface UserRepo extends PagingAndSortingRepository<UserKarma, Integer> {
    List<UserKarma> findAllByRole(UserRole role);
    UserKarma findByEmail(String email);
}
