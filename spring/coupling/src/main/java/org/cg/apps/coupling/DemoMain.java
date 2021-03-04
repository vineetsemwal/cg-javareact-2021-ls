package org.cg.apps.coupling;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class DemoMain {

    public static void main(String args[]){
        //applicationcontext is the container
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
        context.register(JavaConfig.class);
        context.refresh();
        context.registerShutdownHook();
        System.out.println("before we have fetched any thing");
        Canvas canvas=context.getBean(Canvas.class);
        System.out.println("is canvas null"+(canvas==null));
        IShape shape=canvas.getShape();
        System.out.println("is shape in canvas null "+(shape==null));
        System.out.println("type of shape is rectangle="+(shape instanceof Rectangle)+" area="+shape.area());
        canvas.draw();


        Canvas canvas2=context.getBean("canvas",Canvas.class);
        boolean isSame=canvas==canvas2;
        System.out.println("canvas objects same="+isSame);

      //  context.removeBeanDefinition("rectangle");


         context.close();

       }
}
