package com.iocscope.beans;

import javax.servlet.http.HttpSession;

public class EsempioProxy extends SessionBean {
	
	HttpSession httpSession;

	@Override
	public int getId() {
		SessionBean veroSessionBean = (SessionBean) httpSession.getAttribute("SessionBean");
		return veroSessionBean.getId();
	}

	

}
