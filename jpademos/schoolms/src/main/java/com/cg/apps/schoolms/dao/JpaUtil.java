package com.cg.apps.schoolms.dao;

import javax.persistence.*;

public class JpaUtil {

    private static JpaUtil instance;

    private static EntityManagerFactory entityManagerFactory;

    private EntityManager entityManager;

    private JpaUtil() {

    }

    public static JpaUtil getInstance() {
        if (instance == null) {
            instance = new JpaUtil();
            entityManagerFactory = Persistence.createEntityManagerFactory("training-ms");
        }

        return instance;
    }


    public EntityManager getEntityManager() {
        if (entityManager == null) {
            entityManager = entityManagerFactory.createEntityManager();
        }
        return entityManager;
    }

    public void close(){
        if(entityManager!=null){
            entityManager.close();
        }
    }
}
