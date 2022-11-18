package com.vinod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.vinod.model.Employee;
import com.vinod.model.Vehicle;

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
				   .addAnnotatedClass(Vehicle.class);
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        session.beginTransaction();
		//--------------
        	Employee emp1 = new Employee();
       	
        	emp1.setId(1);
        	emp1.setfName("Vinod");
        	emp1.setlName("Borse");
        	
        	Employee emp2 = new Employee();
        	
        	emp2.setId(2);
        	emp2.setfName("Don");
        	emp2.setlName("Baba");
        
        	
        	Vehicle v1 = new Vehicle();
        	
        	v1.setId(101);
        	v1.setType("Bike");
        	v1.setName("Activa");
        	v1.setModel("G5");
        	
        	Vehicle v2 = new Vehicle();
        	
        	v2.setId(102);
        	v2.setType("Car");
        	v2.setName("Tata");
        	v2.setModel("Punch");

        	Vehicle v3 = new Vehicle();
        	
        	v3.setId(103);
        	v3.setType("Bike");
        	v3.setName("Bullet");
        	v3.setModel("Classic");

        	List<Vehicle> vehicles = new ArrayList<Vehicle>();
        	
        	vehicles.add(v1);
        	vehicles.add(v2);
        	vehicles.add(v3);
//        	emp1.setVehicle(vehicles);
        	
        	emp1.setVehicle(Arrays.asList(v1, v2, v3));
        	emp2.setVehicle(Arrays.asList(v1, v2));
        	
        	
        	session.save(emp1);
        	session.save(emp2);
        	
        	session.save(v1);
        	session.save(v2);
        	session.save(v3);
		//--------------
		session.getTransaction().commit();
		session.close();

    }
}
