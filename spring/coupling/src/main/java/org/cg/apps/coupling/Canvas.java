package org.cg.apps.coupling;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

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

    @Autowired
    public void setShape(IShape shape){
        System.out.println("inside shape,shape is set now ");
        this.shape=shape;
    }

    public IShape getShape(){
        return shape;
    }



    public  void  draw(){
        double area= shape.area();
        System.out.println("drawing area of the shape is "+area);
    }

}
