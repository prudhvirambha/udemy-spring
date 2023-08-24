package com.udemy.spring.basics.springin5steps; //by default this package is picked for component scan

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.udemy.spring.basics.componentscan.ComponentDAO;

@Configuration
@ComponentScan("com.udemy.spring.basics.componentscan") //To scan this package explicitly we use this annotation
public class SpringIn5StepsComponentScanApplication {

	private static Logger LOGGER=
			LoggerFactory.getLogger(SpringIn5StepsComponentScanApplication.class);

	public static void main(String[] args) {
		ApplicationContext applicationContext =
				new AnnotationConfigApplicationContext(SpringIn5StepsComponentScanApplication.class);
				//SpringApplication.run(SpringIn5StepsComponentScanApplication.class, args);
		ComponentDAO componentDAO =
				applicationContext.getBean(ComponentDAO.class);

		
		LOGGER.info("{}",componentDAO);
		
		((ConfigurableApplicationContext)applicationContext).close();
		
	}

}
