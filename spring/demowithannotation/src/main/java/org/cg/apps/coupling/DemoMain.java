package org.cg.apps.coupling;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DemoMain {

    public static void main(String args[]){
        //applicationcontext is the container
       ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Canvas canvas=context.getBean(Canvas.class);
        System.out.println("is canvas null"+(canvas==null));
        IShape shape=canvas.getShape();
        System.out.println("is shape in canvas null "+(shape==null));
        System.out.println("type of shape is rectangle="+(shape instanceof Rectangle)+" area="+shape.area());
        canvas.draw();


        Canvas canvas2=context.getBean("canvas",Canvas.class);
        boolean isSame=canvas==canvas2;
        System.out.println("canvas objects same="+isSame);

       }
}
