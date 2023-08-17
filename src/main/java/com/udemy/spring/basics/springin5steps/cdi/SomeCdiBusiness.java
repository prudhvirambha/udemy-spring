package com.udemy.spring.basics.springin5steps.cdi;

import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named
public class SomeCdiBusiness {
	
	@Inject
	SomeCdiDao someCdiDao;

	public SomeCdiDao getSomeCdiDao() {
		return someCdiDao;
	}

	public void setSomeCdiDao(SomeCdiDao someCdiDao) {
		this.someCdiDao = someCdiDao;
	}
	
	
}
