package com.xtorres.notesapp.repositories;

import com.orm.SugarRecord;
import com.xtorres.notesapp.models.User;

import java.util.List;

public class UserRepositorie {

    public static List<User> list(){
        List<User> users = SugarRecord.listAll(User.class);
        return users;
    }

    public static User read(Long id){
        User user = SugarRecord.findById(User.class, id);
        return user;
    }

    public static void create(String username, String fullname, String email, String password){
        User user = new User(username, fullname, email, password);
        SugarRecord.save(user);
    }



}
