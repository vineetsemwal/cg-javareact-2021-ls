package com.cg;

import com.cg.service.IEmployeeService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProjectMain {

    public static void main(String args[]){
        AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext();
        context.register(JavaConfig.class);
        context.refresh();
        IEmployeeService service= context.getBean(IEmployeeService.class);


    }

}
