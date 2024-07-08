package com.jitendra.service;

import com.jitendra.dto.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    public List<User> getAllUser() {
        List<User> newUser = new ArrayList<>();
        newUser.add(new User(101, "Jitendra"));
        newUser.add(new User(100, "Yadav"));
        newUser.add(new User(103, "Pankaj");
        newUser.add(new User(104, "Shtam"));
        return newUser;
    }

}
