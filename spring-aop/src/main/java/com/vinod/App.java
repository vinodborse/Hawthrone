package com.vinod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vinod.model.Teacher;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ac = new ClassPathXmlApplicationContext("auto-config.xml");
    	
        Teacher t = ac.getBean("teacher", Teacher.class);
        
        t.teacherMethod();
    }
}
