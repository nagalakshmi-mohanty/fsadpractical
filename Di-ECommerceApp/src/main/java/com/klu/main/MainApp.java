package com.klu.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.klu.config.AppConfig;
import com.klu.model.Order;
  
public class MainApp {

	 private static ApplicationContext cn;
	 private static ApplicationContext cn1;

	 public static void main(String[] args) {
	  cn = new AnnotationConfigApplicationContext(AppConfig.class);

	  Order or = cn.getBean(Order.class);
	  or.display();
	  
	  cn1 = new ClassPathXmlApplicationContext("bean.xml");
	    Order or1=(Order)cn1.getBean("preorder");
	  or1.display();
	 }
	}