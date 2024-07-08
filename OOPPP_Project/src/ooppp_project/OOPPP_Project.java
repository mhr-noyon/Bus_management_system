
package ooppp_project;
import java.sql.*;
public class OOPPP_Project {
  public static void main(String []args) throws SQLException{
       JDBC.createTableAccounts();
       JDBC.createTableOfBusList();
       DummyBusPath.createTableOfStoppageList();
       DummyBusPath.dummyBus();
       JDBC.createTableHistory();
       JDBC.dummyHistory();
       DummyBusPath.insertStoppages();
       
       
        WelcomePage mainMenu=new WelcomePage();
        mainMenu.setVisible(true);
        mainMenu.pack();
        mainMenu.setLocationRelativeTo(null);
        
    }
}