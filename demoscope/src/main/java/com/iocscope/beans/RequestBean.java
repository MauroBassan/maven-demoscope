package com.iocscope.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;


/*
 * di questo bean, spring creerà una nuova istanza x ogni richiesta http ricevuta
 * 
 */
@Component
@RequestScope
public class RequestBean extends AbstractBeanWithID {
	
	@Autowired
	private PrototypeBean prototypeBean;

	/**
	 * @return the prototypeBean
	 */
	public PrototypeBean getPrototypeBean() {
		return prototypeBean;
	}
	
	

}
