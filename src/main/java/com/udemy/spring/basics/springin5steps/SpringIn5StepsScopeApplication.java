package com.udemy.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.udemy.spring.basics.springin5steps.scope.PersonDAO;

@Configuration
@ComponentScan
public class SpringIn5StepsScopeApplication {

	private static Logger LOGGER=
			LoggerFactory.getLogger(SpringIn5StepsScopeApplication.class);

	public static void main(String[] args) {
		ApplicationContext applicationContext =
				new AnnotationConfigApplicationContext(SpringIn5StepsScopeApplication.class);
				//SpringApplication.run(SpringIn5StepsScopeApplication.class, args);
		PersonDAO personDao =
				applicationContext.getBean(PersonDAO.class);

		PersonDAO personDao1 =
				applicationContext.getBean(PersonDAO.class);
		
		LOGGER.info("{}",personDao);
		LOGGER.info("{}",personDao.getJdbcConnection()); //Different output
		LOGGER.info("{}",personDao.getJdbcConnection()); //Different output
		//Due to proxy we get different output for same instance
		
		LOGGER.info("{}",personDao1);
		LOGGER.info("{}",personDao1.getJdbcConnection());
		((ConfigurableApplicationContext)applicationContext).close();
	}

}
