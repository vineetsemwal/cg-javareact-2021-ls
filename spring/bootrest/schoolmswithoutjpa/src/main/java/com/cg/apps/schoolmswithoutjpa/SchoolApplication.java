package com.cg.apps.schoolmswithoutjpa;

import com.cg.apps.schoolmswithoutjpa.studentms.ui.SchoolUI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SchoolApplication {

    private static final Logger Log= LoggerFactory.getLogger(SchoolApplication.class);

    public static void main(String[] args){
       ConfigurableApplicationContext context= SpringApplication.run(SchoolApplication.class, args);
       SchoolUI schoolUI=context.getBean(SchoolUI.class);
       schoolUI.start();

        Log.debug("****i am logged using debug level");
        Log.info("***i am logged using info level");
        Log.error("***i am logged using error level");


    }

}
