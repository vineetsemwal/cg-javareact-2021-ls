package com.cg.apps.customermsapp;

import com.cg.apps.customermsapp.customerms.ui.CustomerUI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.slf4j.*;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@SpringBootApplication
public class MainApplication {

    private static final Logger Log=LoggerFactory.getLogger(MainApplication.class);

    public static void main(String[] args){
       ConfigurableApplicationContext context= SpringApplication.run(MainApplication.class, args);
       CustomerUI schoolUI=context.getBean(CustomerUI.class);
       schoolUI.start();
       Log.debug("****i am logged using debug level");
       Log.info("***i am logged using info level");
       Log.error("***i am logged using error level");
    }


    /**
     *
     * for handling cross origin requests
     */
    @Bean
    public CorsFilter corsFilter(){
        UrlBasedCorsConfigurationSource src=new UrlBasedCorsConfigurationSource();
        CorsConfiguration configuration=new CorsConfiguration();
        configuration.setAllowCredentials(true);
        configuration.addAllowedHeader("*");
        configuration.addAllowedOrigin("http://localhost:3000");
        configuration.addAllowedMethod("*");
        src.registerCorsConfiguration("/**",configuration);
        return new CorsFilter(src);
    }



}
