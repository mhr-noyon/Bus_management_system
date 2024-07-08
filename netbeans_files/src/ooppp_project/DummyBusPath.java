package ooppp_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DummyBusPath {
    public static void dummyBus() throws SQLException{
        Connection con;
        Statement st;
        
        con =JDBC.getConnection();
        st = con.createStatement();
        try{
            st.execute("create table if not exists JuboKollan(" +
                "serial int(3) Primary key, " +
                "StationName varchar(100), " +
                "Distance float(3)" +
                ")");
            st.execute("create table if not exists Bondhu(" +
                "serial int(3) Primary key, " +
                "StationName varchar(100), " +
                "Distance float(3)" +
                ")");
        }
        catch(Exception e){
            System.out.println(""+e.getMessage());
        }
        try {
            st.execute("insert into JuboKollan values(1, 'Vulta Gawsia',00)");            
            st.execute("insert into JuboKollan values(2, 'Borpa',4.8)");
            st.execute("insert into JuboKollan values(3, 'Rupshi',7.2)");
            st.execute("insert into JuboKollan values(4, 'Tarabo Bissho Road',9.4)");
            st.execute("insert into JuboKollan values(5, 'Kachpur',13)");
            st.execute("insert into JuboKollan values(6, 'Chittagong Road',14)");
            st.execute("insert into JuboKollan values(7, 'Mouchak (Siddhirganj)',16.9)");
            st.execute("insert into JuboKollan values(8, 'Sanarpar',17.8)");
            st.execute("insert into JuboKollan values(9, 'Sign Board',18.9)");
            st.execute("insert into JuboKollan values(10, 'Matuail Medical',20.1)");
            st.execute("insert into JuboKollan values(11, 'Shonir AKhra',21.7)");
            st.execute("insert into JuboKollan values(12, 'Kajla',22.9)");
            st.execute("insert into JuboKollan values(13, 'Jatra Bari',24.1)");
            st.execute("insert into JuboKollan values(14, 'Sayedabad',25.3)");
            
            st.execute("insert into Bondhu values(1, 'Vulta Gawsia',00)");            
            st.execute("insert into Bondhu values(2, 'Borpa',4.8)");
            st.execute("insert into Bondhu values(3, 'Rupshi',7.2)");
            st.execute("insert into Bondhu values(4, 'Tarabo Bissho Road',9.4)");
            st.execute("insert into Bondhu values(5, 'Kachpur',13)");
            st.execute("insert into Bondhu values(6, 'Chittagong Road',14)");
            st.execute("insert into Bondhu values(7, 'Mouchak (Siddhirganj)',16.9)");
            st.execute("insert into Bondhu values(8, 'Sanarpar',17.8)");
            st.execute("insert into Bondhu values(9, 'Sign Board',18.9)");
            st.execute("insert into Bondhu values(10, 'Matuail Medical',20.1)");
            st.execute("insert into Bondhu values(11, 'Shonir AKhra',21.7)");
            st.execute("insert into Bondhu values(12, 'Kajla',22.9)");
            st.execute("insert into Bondhu values(13, 'Jatra Bari',24.1)");
            st.execute("insert into Bondhu values(14, 'Sayedabad',25.3)");
      
        } catch (Exception e) {
            System.out.println(""+e.getMessage());
        }
        try{
            st.execute("insert into BusList values (2.9,'JuboKollan')"); 
            st.execute("insert into BusList values (3.4,'Bondhu')");
        }catch (Exception e) {
            System.out.println(""+e.getMessage());
        }
        con.close();
        st.close();
    }
    public static void createTableOfStoppageList(){
        Connection con;
        Statement st;
        try {
            con =JDBC.getConnection();
            st = con.createStatement();
            st.execute("create table if not exists StoppagesList (name varchar(50) PRIMARY KEY)");    
            con.close();
            st.close();
        } catch (Exception e) {
            System.out.println(""+e.getMessage());
        }
    }
    public static void insertStoppages(){
        Connection con;
        Statement st;
        String []stop = {"Vulta Gawsia","Borpa", "Rupshi","Tarabo Bissho Road","Kachpur","Chittagong Road","Mouchak (Siddhirganj)","Sanarpar",
            "Sign Board","Matuail Medical","Shonir Akhra","Kajla","Jatra Bari","Sayedabad",""};
        try {
            con =JDBC.getConnection();
            st = con.createStatement();
            for(int i=0;i<stop.length;i++){
                st.execute("insert into StoppagesList values('"+stop[i]+"')"); 
                System.out.println(""+i);
            }
            con.close();
            st.close();
        } catch (Exception e) {
            System.out.println(""+e.getMessage());
        }
    }
    
}

//insert into JuboKollan values(1,"Vulta Gawsia",00);
//insert into JuboKollan values(2,"Borpa",4.8);
//insert into JuboKollan values(3,"Rupshi",7.2);
//insert into JuboKollan values(4,"Tarabo Bissho Road",9.4);
//insert into JuboKollan values(5,"Kachpur",13);
//insert into JuboKollan values(6,"Chittagong Road",14);
//insert into JuboKollan values(7,"Mouchak (Siddhirganj)",16.9);
//insert into JuboKollan values(8,"Sanarpar",17.8);
//insert into JuboKollan values(9,"Sign Board",18.9);
//insert into JuboKollan values(10,"Matuail Medical",20.1);
//insert into JuboKollan values(11,"Shonir AKhra",21.7); 
//insert into JuboKollan values(12,"Kajla",22.9);
//insert into JuboKollan values(13,"Jatra Bari",24.1);
//insert into JuboKollan values(14,"Sayedabad",25.3);



//| serial | StationName           | Distance |
//+--------+-----------------------+----------+
//|      1 | Gulistan              |        0 |
//|      2 | Kajla                 |      4.1 |
//|      3 | Shonir AKhra          |      5.3 |
//|      4 | Matuail Medical       |      6.9 |
//|      5 | Sign Board            |      8.1 |
//|      6 | Sanarpar              |      9.2 |
//|      7 | Mouchak (Siddhirganj) |     10.1 |
//|      8 | Chittagong Road       |       13 |
//|      9 | Kachpur               |       14 |
//|     10 | Tarabo Bissho Road    |     17.6 |
//|     11 | Rupshi                |     19.8 |
//|     12 | Borpa                 |     22.2 |
//|     13 | Vulta Gawsia          |       27 |

//+---------------+----------+------------+-------------------+
//| Name          | Password | Cell       | Email             |
//+---------------+----------+------------+-------------------+
//| Sajid         | 123456   | 1234567891 | sajid@gmail.com   |
//| S             | 1234     | 1412451251 | sdf@gmail.com     |
//| Md Noyon      | abcd1234 | 1719767459 | mdnoyon@gmail.com |
//| Rahim         | msdf1234 | 1916528946 | rahim@gmail.com   |
//| Sahadat Sayem | 123456   | 1916528951 | sayem12@gmail.com |
//| Apurbo        | ok1234   | 1998654926 | apurbo@gmail.com  |
//+---------------+----------+------------+-------------------+

//insert into BusList values (3.4,”Meghla”); 
//insert into BusList values (2.9,”jubokollan”);


//MySql cmd lines
//Select user();
//select @@port;
// \\create database
//create database BusApp;
//show databases;
//use busapp
//show tables;
//\\create table
//create table test (id int(3), name varchar(50), phone int(10), email varchar(100));
//ALTER TABLE test add primary key(id);
//show tables;
//desc test;
//\\Insert
//String queryToInsert = "insert into accounts values ('"+name+"', '"+pass+"',"+cell+",'"+email+"')";
//                                st.execute(queryToInsert);
//\\READ
//select * from test;
//\\UPDATE
//update test set email = "mdnoyon@gmail.com" where id =1;
//\\DELETE
//delete from test where id = 2;

