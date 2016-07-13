/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.vilnius.coding.main;

import java.sql.Connection;
import java.sql.DriverManager;
import static java.sql.DriverManager.getConnection;
import static java.sql.DriverManager.getConnection;
import static java.sql.DriverManager.getConnection;
import java.sql.SQLException;
import java.sql.Statement;
import lt.vilnius.coding.gui.Login;
import lt.vilnius.coding.logic.DbConnection;

/**
 *
 * @author Rokas
 */
public class PersonalDataPanel {

    /**
     * @param args the command line arguments
     * @throws java.lang.ClassNotFoundException
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // TODO code application logic here
   new Login().setVisible(true);  
  new DbConnection().getConnection();
    
  // PersonalDataPanel gameAcc = new PersonalDataPanel();
  // gameAcc.run();
}
    
    
  /*  public void run() throws ClassNotFoundException, SQLException {
      try { 
        Login l = new Login(\));
        l.setSize(300, 300);
        l.setLocation(700, 350);
        l.setVisible(true);
    //new Login().setVisible(true);
      } catch (Exception ex) {
      //    Logger.getLogger(gameAcc.classNme())
      }
    }*/
   

}


