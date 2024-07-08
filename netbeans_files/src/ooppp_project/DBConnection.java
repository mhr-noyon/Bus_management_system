package ooppp_project;

import java.sql.*;
    
public class DBConnection {
    static final String dbURL = "jdbc:mysql://localhost:3306/bus_user";
    static final String user = "root";
    static final String pass = "mhrn8414";
          
    public static Connection connectDB(){
               try{
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn = DriverManager.getConnection(dbURL,user,pass);
                    return conn;
               }
               catch(Exception e){
                   System.out.println("Error while connecting database..");
                   return null;
               }
    }
}

//steps: 
    //1. driver load
    //2. conn establish
    //3. statement create
    //4. execute - query
    //5. conn close


// Statement st = con.creatStatement();

// String queryCreateTable = "create table table_name(roll int(3), name varchar(20));"
// String queryIn = "insert into table_name( id, "name") values(1,"noyon")"; //insert
// String queryUp = "update table_name = "noyon" where id=1";
// String queryDel = "delete from table_name where id = 1";
// String queryRead = "select * from table_name";


// int count = st.executeUpdate(query);

// con.close();