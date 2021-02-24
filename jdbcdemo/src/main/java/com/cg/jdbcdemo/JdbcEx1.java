package com.cg.jdbcdemo;

import java.sql.*;

import org.postgresql.Driver;

public class JdbcEx1 {

    public static void main(String args[]) throws SQLException, ClassNotFoundException {
        //step1 : register driver
        Driver driver =new Driver();
        DriverManager.registerDriver(driver);
        //Class.forName("org.postgresql.Driver");
        
       
		//step 2    Create connection : requirement is url , username, password
        String url="jdbc:postgresql://localhost:5432/training";
        String user="arpit", password="arpit";
		Connection connection =DriverManager.getConnection(url,user,password);
        //step3 create statement
		Statement statement=connection.createStatement();
		
		//String insertSql="insert into employees (id,name,balance,age,deptid)  values(14,'yash',13000,21,'d1') ";
        long queryId=2;
		String updateSql="update employees set age=23 where id ="+queryId;
		int count=statement.executeUpdate(updateSql);
		System.out.println("rows changed="+count);


		String sql="select * from employees where id="+queryId;
        //step 4 : execute query using statement object
		ResultSet resultSet=statement.executeQuery(sql);
        while(resultSet.next()){
         long id=resultSet.getLong("id");
         String name=resultSet.getString("name");
         int age=resultSet.getInt("age");
         double balance=resultSet.getDouble("balance");
         String deptId=resultSet.getString("deptid");
         System.out.println(" id:"+id+"-name-"+name+"-age-"+age+"-balance-"+balance+"-dept id-"+deptId);
        }
        
        statement.close();
        connection.close();

    }

}
