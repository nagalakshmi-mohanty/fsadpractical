package fsad3;
import java.sql.*;
public class EmployeeFsad {
	public static void main(String[] args) {
		
        String url="jdbc:mysql://localhost:3306/company";
        String usr="root";
        String pwd="root";
        try {
      	  Connection con=DriverManager.getConnection(url,usr,pwd);
      	  System.out.println("Connection established");
      	  
      	  String createDept="create table  if not exists Department("+ "deptid int primary key ,"+"deptname varchar(20))";
      	  Statement st=con.createStatement();
     st.executeUpdate(createDept);
 	st.executeUpdate("INSERT INTO Department VALUES (1,'HR')");
 	st.executeUpdate("INSERT INTO Department VALUES (2,'Finance')");
 	st.executeUpdate("INSERT INTO Department VALUES (3,'ab')");

     System.out.println(" Department Table created");
     String createEmp="create table  if not exists Employee("+ "empid int primary key ,"+"empname varchar(50), " + " salary DOUBLE,"+"deptid int ,"+"foreign key (deptid) references department(deptid))";
      
 	  System.out.println(" Employee Table created");
      	  st.executeUpdate(createEmp);
      	st.executeUpdate("INSERT INTO employee VALUES(102,'Bob' , 600000,2)");
    	st.executeUpdate("INSERT INTO employee VALUES(103,'Charlie' , 700000,3)");
    	System.out.println("Employee values inserted successfully");
    	
      	  
      	  con.close();
      	  System.out.println("Connection closed successfully");
      
        }
        catch(Exception e) {
      	  e.printStackTrace();
        }
	}
}


