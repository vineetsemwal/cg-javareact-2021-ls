package org.cg.apps.coupling;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Scope("prototype")
@Component
public class Rectangle implements IShape{
//    @Value("${rect.length}")
    private double length;
  //  @Value("${rect.breadth}")
    private double breadth;


    @Autowired
    private Environment environment;

    public Rectangle() {

    }

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    @PostConstruct
    public void afterInit(){
        System.out.println("inside Rectangle after initialization done");
        System.out.println("length="+length+" breadth="+breadth);
        length=environment.getProperty("rect.length",Double.class);
        breadth=environment.getProperty("rect.breadth",Double.class);
        System.out.println("inside afterinit ,length fetched="+length+" breadth="+breadth);
    }

    @Override
    public double area() {
        return length * breadth;
    }

    @PreDestroy
    public void clear() {
        System.out.println("inside Rectangle's clear");
    }

}
