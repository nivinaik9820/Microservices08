package com.org.p1;
import java.sql.Connection;


import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;


public class Testdb1 {
	private static final String URL="jdbc:mysql://Localhost:3306/TcsTraining";
    private static final String USER="root";
    private static final String PASSWORD="Root123$";
    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(URL,USER,PASSWORD);
    }
    public static void main(String[] args) {
    	try(Connection connection= getConnection()){
    		if((connection !=null)){
    			System.out.println("connected to database");
    			PreparedStatement ps =connection.prepareStatement("insert into Student values(?,?,?,?)");
    			
        		
        	}
    		
    	}
    	
    }


}
