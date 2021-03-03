package org.cg.apps.coupling;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:shape.properties")
@ComponentScan("org.cg.apps.coupling")
@Configuration
public class JavaConfig {


}
