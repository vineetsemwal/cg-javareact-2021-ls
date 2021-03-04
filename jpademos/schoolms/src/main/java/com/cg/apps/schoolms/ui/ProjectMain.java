package com.cg.apps.schoolms.ui;

import com.cg.apps.schoolms.JavaConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProjectMain
{

    public static void main(String[] args) {
        ProjectMain app=new ProjectMain();
        app.start();

    }

    public void start() {
            AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
            context.register(JavaConfig.class);
            context.refresh();
            SchoolUI schoolUI=context.getBean(SchoolUI.class);
            schoolUI.runUi();

    }



}
