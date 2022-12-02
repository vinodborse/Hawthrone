package com.vinod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vinod.modal.Student;
import com.vinod.modal.Teacher;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ac = new ClassPathXmlApplicationContext("auto-config.xml");
    	
        Teacher t = ac.getBean("t1", Teacher.class);
        
        t.msg(1);
    }
}
