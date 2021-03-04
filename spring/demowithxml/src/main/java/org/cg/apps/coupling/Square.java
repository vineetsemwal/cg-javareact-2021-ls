package org.cg.apps.coupling;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class Square implements IShape{

    private double side;

    public Square(){

    }

    public Square(double side){
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side*side;
    }
}
