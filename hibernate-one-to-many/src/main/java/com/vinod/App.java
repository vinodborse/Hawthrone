package com.vinod;

import java.util.ArrayList;
import java.util.List;

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
        Mobile mb1 = new Mobile();
        Mobile mb2 = new Mobile();
                
        mb1.setId(101);
        mb1.setNumber(1234);
        mb1.setCompany("JIO");
        
        mb2.setId(102);
        mb2.setNumber(3333);
        mb2.setCompany("Airtel");


        List<Mobile> mobs = new ArrayList<Mobile>();
        
        mobs.add(mb1);
        mobs.add(mb2);

        emp.setMobiles(mobs);
        
        session.save(emp);
        session.save(mb1);
        session.save(mb2);
        //--------------
        session.getTransaction().commit();
        session.close();
        
    }
}
