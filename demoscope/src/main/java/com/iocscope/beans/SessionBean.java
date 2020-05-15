package com.iocscope.beans;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;


/*
 * verrà creato ad ogni nuova sessione utente
 * 
 */
@Component
@SessionScope
public class SessionBean extends AbstractBeanWithID {

}
