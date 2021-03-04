package org.cg.apps.coupling;

import org.cg.apps.coupling.Canvas;
import org.cg.apps.coupling.Rectangle;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@PropertySource("classpath:shape.properties")
@ComponentScan("org.cg.apps.coupling")
@Configuration
public class JavaConfig {


/*

    @Bean
    public IShape rectangle(){
        Rectangle rect=new Rectangle();
        return rect;
    }

    @Bean
   public IShape square(){
        return new Square(56);
   }
*/



}
