package com.udemy.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.udemy.spring.basics.springin5steps.scope.PersonDAO;

@SpringBootApplication
public class SpringIn5StepsScopeApplication {

	private static Logger LOGGER=
			LoggerFactory.getLogger(SpringIn5StepsScopeApplication.class);

	public static void main(String[] args) {
		ApplicationContext applicationContext =
				SpringApplication.run(SpringIn5StepsScopeApplication.class, args);
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
	}

}
