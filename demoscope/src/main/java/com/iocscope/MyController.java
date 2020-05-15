package com.iocscope;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iocscope.beans.DefaultBean;
import com.iocscope.beans.PrototypeBean;
import com.iocscope.beans.RequestBean;
import com.iocscope.beans.SessionBean;


/*
 * 
 * infine creiamo il controller per visualizzare il risultato,
 * all'interno di questo controller utilizziamo la dependency injection trmite gli autowire x recuperare i miei 3 bean,
 * 
 * e un endpoint in get x stampare i loro id
 * 
 */
@RestController // lo stesso controller è un bean e quindi ha uno scope di tipo singleton
public class MyController {
	
	@Autowired
	private DefaultBean defaultBean;
	
	@Autowired
	private SessionBean sessionBean;
	
	@Autowired
	private RequestBean requestBean;
	
	@Autowired
	private PrototypeBean prototypeBean;
	
	@GetMapping("/")
	public Map<String, Integer> showBeans(){
		
		Map<String, Integer> beans = new LinkedHashMap<String, Integer>();
		
		beans.put("default ", defaultBean.getId());
		System.out.println(defaultBean.getClass());
		
		beans.put("session ", sessionBean.getId());
		System.out.println(sessionBean.getClass());
		
		beans.put("request ", requestBean.getId());
		System.out.println(requestBean.getClass());
		
		beans.put("prototype", prototypeBean.getId());
		
		beans.put("prototype-from-request", requestBean.getPrototypeBean().getId());
		return beans;
	}
	

}
