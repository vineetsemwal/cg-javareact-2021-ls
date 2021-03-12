package com.cg.apps.schoolmswithoutjpa;

import com.cg.apps.schoolmswithoutjpa.studentms.ui.SchoolUI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class SchoolApplication {

    private static final Logger Log= LoggerFactory.getLogger(SchoolApplication.class);

    public static void main(String[] args){
       ConfigurableApplicationContext context= SpringApplication.run(SchoolApplication.class, args);
       SchoolUI schoolUI=context.getBean(SchoolUI.class);
       schoolUI.start();

        Log.debug("****i am logged using debug level");
        Log.info("***i am logged using info level");
        Log.error("***i am logged using error level");

    }

    @Bean
    public Docket api(){
        Docket docket=new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.cg.apps.schoolmswithoutjpa"))
                .paths(PathSelectors.any())
                .build();
        return docket;
    }

    @Bean
    public ApiInfo apiInfo(){
        ApiInfo apiInfo=new ApiInfoBuilder().
                title("student mgt application without jpa")
                .description("rest api for student mgt").
                        build();
        return apiInfo;
    }



}
