package com.cg.schoolms.dao;

import java.util.*;

import com.cg.schoolms.entities.Student;

public class StoreHolder {

   private static final StoreHolder storeHolder = new StoreHolder();

    private StoreHolder() {
    }

    public static StoreHolder getInstance() {
        return storeHolder;
    }

    private Map<Integer, Student> store = new HashMap<>();

    public Map<Integer, Student> getStore() {
        return store;
    }


}
