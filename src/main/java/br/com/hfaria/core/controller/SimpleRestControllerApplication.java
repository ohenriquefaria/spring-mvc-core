package br.com.hfaria.core.controller;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;
 

public class SimpleRestControllerApplication  extends Application {
	
	private Set<Object> singletons = new HashSet<Object>();
	 
	public SimpleRestControllerApplication() {
		singletons.add(new SimpleRestController());
	}
 
	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}

	@Override
	public Set<Class<?>> getClasses() {
		return null;
	}

}
