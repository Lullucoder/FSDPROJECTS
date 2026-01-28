JDBC - Java Database Connectivity and CRUD OPERATIONS(Create, Read, Update and delete)





Java Database Connectivity : 

1)Register driver

2)Get connection

3)Create statement

4)Execute query

5)Close connection





**String url= "jdbc:mysql://localhots:3306/students\_db";**

**String username="root"**

**String password="root"**



Step1: Registering Diver of MySQL with JDBS APi. with connection url which holds api driver name(jdbc): with database software(MySQL)://Connection url with port number 3306/datasourcename like as follows 

jdbc:mysql://localhost:3306/databasename. Here students\_db is a database or database name.



**Class.forname("com.mysql.cj.jdbc.Driver");**

**Connection con=DriverManager.getConnection(url,username, password);**



Step2: Get connection with Class.forName() method to register drivers,

Driver Manager module to access or to establish connection with database connection string url, username amd password to authenticate and authorize database connection..



**Statement stmt = con.createStatement();**



Step3: Create Statement, it performs create statement syntax of SQL query.



**ResultSet rs= stmt.executeQuery("Select \* from student");**



Step4: EXECUTE STATEMENT. query either executes Prepared Statement or fetched ResultsSet.

**con.close();**



&nbsp;Step5: CLOSE THE DTATABASE CONNECTION: After execution. close the database connection.





Note: Two type of statement in JDBC

Prepared statement 

Callable Statement







Full code Snippet:



**import java.sql.\*;**

**public class App**

**{**

**public static void main(String\[] args) throw Exception**

**{**

**String url="jdb:mysql://localhost:3306/students\_db";**

**String username="root"**

**String password="root"**

**Class.forName("com.mysql.cj.jdbc.Driver");**

**Connection con=DriverManager.getConnection(url,username, password);**

**Statement stmt = con.createStatement();**

**ResultSet rs= stmt.executeQuery("Select \* from student");**

**while(rs.next())**

**{**

**System.out.println("Student ID:"+rs.geetInt(1));**

**System.out.println("Student Name:"+rs.getString(2));**

**}**

**con.close();**

**}**

**}**





