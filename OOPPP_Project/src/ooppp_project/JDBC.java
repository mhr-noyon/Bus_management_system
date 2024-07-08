
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/
package ooppp_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;

/**
 *
 * @author User
 */
public class JDBC {
    static String dbURL = "jdbc:mysql://localhost:3306/";
    static String dbName = "busapp";
    static  String user = "root";
    static  String pass = "";
    public static Connection getConnection(){
        Connection connect = null;
        try{
            connect = DriverManager.getConnection(dbURL, user, pass);
            String queryToCreateDB = "CREATE DATABASE IF NOT EXISTS " + dbName;
            try (Statement st = connect.createStatement()) {
                st.executeUpdate(queryToCreateDB);
            } catch (Exception e) {
                System.out.println("Error while creating Database: " + e.getMessage());
            }
            connect.close(); // Close the initial connection

            // Connect to the newly created database
            connect = DriverManager.getConnection(dbURL + dbName, user, pass);
            
        }
        catch(Exception e){
            System.out.println("Error while connecting database.."+e.getMessage());
        }
        return connect;
    }
    
    
    
    public static void createTable(String busName){
        Connection conn;
        Statement st;
        String queryToCreateTable = "create table "+busName+" (serial int(3), StationName varchar(100), Distance float(3))";
        try {
            conn = JDBC.getConnection();
                st=conn.createStatement();
                st.execute(queryToCreateTable);
                System.out.println("Successfully created table named "+busName);
//                conn.close();
//                st.close();
        } catch (Exception e) {
            System.out.println("Error while creating table: "+e.getMessage());
        }
    }
    public static void insertTable(String busName,String serial, String stations, String distance){
        String queryToInsertPath = "insert into "+busName+" values ("+serial+",'"+stations+"',"+distance+")";
         Connection conn;
         Statement st;
        try {
            conn = JDBC.getConnection();
                st=conn.createStatement();
                st.execute(queryToInsertPath);
                System.out.println("Successfully data inserted into table named "+busName);
                conn.close();
                st.close();
        } catch (Exception e) {
            System.out.println("Error while inserting data to table: "+e.getMessage());
        }
    }
    
    
    //Bus List
    public static void createTableOfBusList(){
        Connection conn;
        Statement st;
        String queryToCreateTable = "create table if not exists BusList (Cost float(3), BusName varchar(100))";
        try {
            conn = JDBC.getConnection();
                st=conn.createStatement();
                st.execute(queryToCreateTable);
                System.out.println("Successfully created table named 'BusList'");
//                conn.close();
//                st.close();
        } catch (Exception e) {
            System.out.println("Error while creating table: "+e.getMessage());
        }
    }
    public static void insertStoppage(String station){
        String queryToInsertPath = "insert into stoppageslist values ('"+station+"')";
        Connection conn;
        Statement st;
        try {
            conn = JDBC.getConnection();
                st=conn.createStatement();
                st.execute(queryToInsertPath);
                System.out.println("Successfully bus name inserted into table named 'stoppageslist'");
                conn.close();
                st.close();
        } catch (Exception e) {
            System.out.println("Error while inserting bus name: "+e.getMessage());
        }
    }
    public static void insertBusName(String busName,String cost){

        String queryToInsertPath = "insert into BusList values ("+cost+",'"+busName+"')";
         Connection conn;
         Statement st;
        try {
            conn = JDBC.getConnection();
                st=conn.createStatement();
                st.execute(queryToInsertPath);
                System.out.println("Successfully bus name inserted into table named 'BusList'");
                conn.close();
                st.close();
        } catch (Exception e) {
            System.out.println("Error while inserting bus name: "+e.getMessage());
        }
    }
    
    public static HashMap busList(){
        HashMap<Float,String> busNames = new HashMap();
        String queryToRead = "select * from BusList";
         Connection conn;
         Statement st;
         ResultSet rs;
        try {
            conn = JDBC.getConnection();
                st=conn.createStatement();
                rs = st.executeQuery(queryToRead);
                System.out.println("Successfully bus name get from 'BusList'");
                while(rs.next()){
                    busNames.put(rs.getFloat("Cost"), rs.getString("BusName"));
                }
                conn.close();
                st.close();
        } catch (Exception e) {
            System.out.println("Error while inserting value to hashmap: "+e.getMessage());
        }
            System.out.println("Initial Mappings are: " + busNames);
             // Getting the value of Gawsia
            // System.out.println("The Value is: " + pathMeghla.get(key));
        
        return busNames;
    }
    
    
    //ticket history
    public static void createTableHistory(){
        Connection conn;
        Statement st;
        String queryToCreateTable = "create table if not exists ticketHistoy (\n" +
"	ticketNo int(6) Primary Key AUTO_INCREMENT, \n" +
"	busname varchar(50),\n" +
"	passenger varchar(50), \n" +
"	contact varchar(50), \n" +
"	fromP varchar(50),\n" +
"	toP varchar(50), \n" +
"	cost int(6)\n" +
")      ";
        try {
            conn = JDBC.getConnection();
                st=conn.createStatement();
                st.execute(queryToCreateTable);
                System.out.println("Successfully created table named ticketHistoy");
//                conn.close();
//                st.close();
        } catch (Exception e) {
            System.out.println("Error while creating table: "+e.getMessage());
        }
    }
    public static void createTableAccounts(){
        Connection conn;
        Statement st;
        String queryToCreateTable = "create table if not exists accounts(id int Primary Key AUTO_INCREMENT," +
        "name varchar(255) ," +
        "pass varchar(12) ," +
        "cell varchar(15) UNIQUE," +
        "email varchar(30) UNIQUE" +
        ")";
        try {
            conn = JDBC.getConnection();
                st=conn.createStatement();
                st.execute(queryToCreateTable);
                System.out.println("Successfully created table named account");
//                conn.close();
//                st.close();
        } catch (Exception e) {
            System.out.println("Error while creating table: "+e.getMessage());
        }
    }
    public static void insertTableHistory(int ticketNo,String busname, String passenger, String contact, String from, String to, int cost){
        String queryToInsert = "insert into ticketHistoy values ("+ticketNo+",'"+busname+"','"+passenger+"','"+contact+"','"+from+"','"+to+"',"+cost+")";
       // String queryToPrimary = "alter table ticketHistory add primar key(ticketno)";
        Connection conn;
         Statement st;
        try {
            conn = JDBC.getConnection();
                st=conn.createStatement();
                st.execute(queryToInsert);
                System.out.println("Successfully data inserted into table named ticketHistoy");
                conn.close();
                st.close();
        } catch (Exception e) {
            System.out.println("Error while inserting data to table: "+e.getMessage());
        }
    }
    public static void dummyHistory(){
        insertTableHistory(1000,"Meghla","Noyon","11238105","Gulistan","Kajlaa",12);        
        insertTableHistory(1001,"Meghla","Noyon","11238105","Gulistan","Kajlaa",12);
        insertTableHistory(1002,"Meghla","Noyon","11238105","Gulistan","Kajlaa",12);
        insertTableHistory(1003,"Meghla","Noyon","11238105","Gulistan","Kajlaa",12);
        insertTableHistory(1004,"Meghla","Noyon","11238105","Gulistan","Kajlaa",12);

    }
    
    public static int getTicketCount(){
        int max =0;
        String queryToRead = "select * from ticketHistoy";
         Connection conn;
         Statement st;
         ResultSet rs;
        try {
            conn = JDBC.getConnection();
                st=conn.createStatement();
                rs = st.executeQuery(queryToRead);
                while(rs.next()){
                    if(max<rs.getInt("ticketNo")){
                        max = rs.getInt("ticketNo");
                    }
                }
                conn.close();
                st.close();
        } catch (Exception e) {
            System.out.println("Error while inserting data to table: "+e.getMessage());
        }
        return max;
    }
}
