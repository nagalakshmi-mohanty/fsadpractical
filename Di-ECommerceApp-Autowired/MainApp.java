package com.klu.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.klu.model.Order;
import com.klu.config.AppConfig;


public class MainApp {

  public static void main(String[] args) {
 
    ApplicationContext context =
          new AnnotationConfigApplicationContext(AppConfig.class);
    Order or = context.getBean(Order.class);
    or.display();


  }

}


