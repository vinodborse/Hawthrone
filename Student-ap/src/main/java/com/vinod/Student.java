package com.vinod;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/std")
public class Student extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		
        String url = "jdbc:mysql://localhost:3306/emp_db";
        String username = "root";
        String password = "root";
       Connection connection = DriverManager.getConnection(url, username, password);
       Statement statement = connection.createStatement();
       ResultSet rs = statement.executeQuery("SELECT * FROM student");   

       String names = "Names => ";
       while(rs.next()) {
    	   names = names + ", " + rs.getString(2);
    	  System.out.println(rs.getInt(1) + " " + 
    			  			rs.getString(2) + " " + 
    			  			rs.getString(3) + " " + 
    			  			rs.getInt(4)); 
       }
       
       req.setAttribute("ankit", names);
		RequestDispatcher rd = req.getRequestDispatcher("ts.jsp");
		rd.forward(req, resp);
       
       
       rs.close();
       statement.close();
       connection.close();
    	} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
