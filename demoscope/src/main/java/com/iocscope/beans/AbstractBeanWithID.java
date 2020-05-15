package com.iocscope.beans;

import java.util.concurrent.atomic.AtomicInteger;

public abstract class AbstractBeanWithID {
	// contatore che viene incrementato ogni volta che viene iniz una nuova istanza, così ogni bean avrà un numero univoco
	private static final AtomicInteger COUNTER = new AtomicInteger();
	
	private final int id;
	
	
	public AbstractBeanWithID() {
		id = COUNTER.addAndGet(1);
	}
	

	public int getId() {
		return id;
	}
	
	
}
