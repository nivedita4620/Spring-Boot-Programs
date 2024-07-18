package com.anudip.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
//        Painter painter1 = (Painter) context.getBean("Nivedita");
//        painter1.perform();
        
	     Performer per1=(Performer) context.getBean("Akanksha");
	     per1.perform(); 
    }
}
