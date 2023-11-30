package de.kainnorg.insiderbackend.api.controller;

import de.kainnorg.insiderbackend.api.model.User;
import de.kainnorg.insiderbackend.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class UserController {

    private UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/user")
    public User getUser(@RequestParam Integer userid){
        Optional<User> user = userService.getUser(userid);
        if(user.isPresent()){
            return user.get();
        }
        return null;
    }
}
