package com.vinod;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.vinod.model.Employee;
import com.vinod.model.Mobile;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg = new Configuration().configure()
        									   .addAnnotatedClass(Employee.class)
        									   .addAnnotatedClass(Mobile.class);
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        session.beginTransaction();
        //--------------
//---Vinod        
        Employee emp = new Employee();
        
        emp.setId(1);
        emp.setFirstName("Vinod");
        emp.setLastName("Borse");
        Mobile mb = new Mobile();
        
        mb.setId(101);
        mb.setNumber(1234);
        mb.setCompany("JIO");
        mb.setEmp(emp);
      //---Vinod
        
        //-- Ankit
        Employee emp1 = new Employee();
        
        emp1.setId(2);
        emp1.setFirstName("Ankit");
        emp1.setLastName("Patil");
        
        Mobile mb1 = new Mobile();
        mb1.setId(102);
        mb1.setNumber(4343);
        mb1.setCompany("Airtel");
        mb1.setEmp(emp1);
        
      //-- Ankit
        
        
        session.save(emp);
        session.save(mb);
        
        session.save(emp1);
        session.save(mb1);
        //--------------
        session.getTransaction().commit();
        session.close();
        
    }
}
