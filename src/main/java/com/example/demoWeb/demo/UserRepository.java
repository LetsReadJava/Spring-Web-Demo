package com.example.demoWeb.demo;


import org.springframework.data.repository.Repository;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class UserRepository implements Repository<String, Integer> {

    Map<Long, String> db = new HashMap();

    UserRepository() {
        db.put(1L, "Max Mustermann");
        db.put(2L, "Benjamin Blümchen");
    }

    public String getUser(Long id) {
        return db.get(id);
    }
}
