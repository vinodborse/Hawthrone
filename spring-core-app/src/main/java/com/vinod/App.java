package com.vinod;

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
    	ApplicationContext ac = new ClassPathXmlApplicationContext("ts.xml");
        	
    	Message m3 = (Message) ac.getBean("s");
    	System.out.println(m3);
    }
}
