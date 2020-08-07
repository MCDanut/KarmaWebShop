package ro.codemart.WebShopReactJS.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.codemart.WebShopReactJS.Entities.UserKarma;
import ro.codemart.WebShopReactJS.Entities.UserRole;
import ro.codemart.WebShopReactJS.Repo.UserRepo;

import java.util.List;

@Service
public class UserService {
    private UserRepo userRepo;

    @Autowired
    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public List<UserKarma> getAllUsers(){
        return userRepo.findAllByRole(UserRole.CLIENT);
    }

    public UserKarma getByEmail(String email){
        return userRepo.findByEmail(email);
    }

    public void saveUser(UserKarma user){
        userRepo.save(user);
    }

    public void deleteById(Integer id){
        userRepo.deleteById(id);
    }
}
