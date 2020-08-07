package ro.codemart.WebShopReactJS.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ro.codemart.WebShopReactJS.Entities.UserKarma;
import ro.codemart.WebShopReactJS.Service.UserService;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@CrossOrigin("*")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/getAll")
    public List<UserKarma> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/getByEmail")
    public UserKarma getUserByEmail(@RequestBody String email){
        //TODO email validation
        return userService.getByEmail(email);
    }

    @PostMapping("/saveUser")
    public void saveUser(@RequestBody UserKarma userKarma){
        userService.saveUser(userKarma);
    }

    @DeleteMapping("/deleteUser/{id}")
    public void deleteUser(@PathVariable("id") Integer id){
        userService.deleteById(id);
    }
}
