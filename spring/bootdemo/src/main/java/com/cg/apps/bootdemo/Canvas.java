package com.cg.apps.bootdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

//@Scope("prototype")
@Component
public class Canvas {

    private IShape shape;

    public Canvas(IShape rectangle){
        this.shape =rectangle;
    }
    public Canvas(){

    }

    /**
     * Rectangle rectangle=new Rectangle();
     * Canvas canvas=new Canvas();
     * canvas.setShape(rectangle);
     */

    @Qualifier("rectangle")
    @Autowired
    public void setShape(IShape shape){
        System.out.println("inside shape,shape is set now ");
        this.shape=shape;
    }

    public IShape getShape(){
        return shape;
    }

    @PostConstruct
    public void afterInitialization(){
        System.out.println("inside Canvas, after bean init");
        System.out.println("details of shape it is holding shape area "+shape.area());

       }


    public  void  draw(){
        double area= shape.area();
        System.out.println("drawing area of the shape is "+area);
    }

}
