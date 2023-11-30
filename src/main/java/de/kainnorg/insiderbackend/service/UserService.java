package de.kainnorg.insiderbackend.service;

import de.kainnorg.insiderbackend.api.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private List<User> userList;

    public UserService() {
        userList = new ArrayList<>();

        User user1 = new User(0, "Kai", 19, "kai.goe@outlook.de");
        User user2 = new User(1, "Finn", 18, "finn@email.com");
        User user3 = new User(2, "Olivia", 100, "Olivia@email.com");
        User user4 = new User(3, "Aleyna", 150, "aleyna@email.com");

        userList.addAll(Arrays.asList(user1,user2,user3,user4));
    }

    public Optional<User> getUser(Integer id) {
        Optional optional = Optional.empty();
        for (User user : userList) {
            if(id == user.getId()){
                optional = Optional.of(user);
                return optional;
            }
        }
        return optional;
    }
}
