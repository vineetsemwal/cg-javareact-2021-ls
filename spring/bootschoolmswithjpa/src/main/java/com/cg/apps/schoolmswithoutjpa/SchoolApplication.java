package com.cg.apps.schoolmswithoutjpa;

import com.cg.apps.schoolmswithoutjpa.ui.SchoolUI;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SchoolApplication {

    public static void main(String[] args){
       ConfigurableApplicationContext context= SpringApplication.run(SchoolApplication.class, args);
       SchoolUI schoolUI=context.getBean(SchoolUI.class);
       schoolUI.start();
    }

}
