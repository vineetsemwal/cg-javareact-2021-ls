package com.cg.jdbcdemo;

import org.postgresql.Driver;

import java.sql.*;

public class PreparedStatementEx {

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

        String updateSql="update employees set age=? where id = ?";
        PreparedStatement updateStatement=connection.prepareStatement(updateSql);
        updateStatement.setInt(1,24);
        updateStatement.setLong(2,4);
        int count=updateStatement.executeUpdate();
        System.out.println("rows changed="+count);

        String fetchSql="select * from employees where id=?";
        PreparedStatement fetchStatement=connection.prepareStatement(fetchSql);
        fetchStatement.setLong(1,4);


        //step 4 : execute query using statement object
		ResultSet resultSet=fetchStatement.executeQuery();
        while(resultSet.next()){
         long id=resultSet.getLong("id");
         String name=resultSet.getString("name");
         int age=resultSet.getInt("age");
         double balance=resultSet.getDouble("balance");
         String deptId=resultSet.getString("deptid");
         System.out.println(" id:"+id+"-name-"+name+"-age-"+age+"-balance-"+balance+"-dept id-"+deptId);
        }
        
        fetchStatement.close();
        connection.close();

    }

}
