package com.cg.apps.schoolmswithjpa;

import com.cg.apps.schoolmswithjpa.studentms.ui.SchoolUI;
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
