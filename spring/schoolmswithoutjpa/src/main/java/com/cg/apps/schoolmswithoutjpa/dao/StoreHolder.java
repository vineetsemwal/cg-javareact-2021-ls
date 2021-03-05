package com.cg.apps.schoolmswithoutjpa.dao;

import java.util.*;

import com.cg.apps.schoolmswithoutjpa.entities.Student;
import org.springframework.stereotype.Component;

@Component
public class StoreHolder {

    public StoreHolder() {
    }

    private Map<Integer, Student> store = new HashMap<>();

    public Map<Integer, Student> getStore() {
        return store;
    }


}
