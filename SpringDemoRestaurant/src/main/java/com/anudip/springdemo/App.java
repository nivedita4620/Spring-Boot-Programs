package com.anudip.springdemo;
/*Spring Framework
 * Bean-> Object
 * ApplicationContext ->Interface
 *  (implements ClassPathXmlApplicationContext class)
 * */


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
        Resturant rest = (Resturant) context.getBean("restBean");
        
        rest.greetCustomer();
        rest.prepareDrink();
    }
}