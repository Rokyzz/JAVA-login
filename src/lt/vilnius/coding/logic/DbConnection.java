/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.vilnius.coding.logic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import lt.vilnius.coding.persons.PersonalData;

/**
 *
 * @author Rokas
 */
public class DbConnection {

    public Connection connectTODB() throws ClassNotFoundException, SQLException {
      Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/tablelog?user=root&password=");
      Statement stmt = conn.createStatement();
      return conn;
}

public Statement getConnection() throws SQLException, ClassNotFoundException {
        Connection conn = connectTODB();
        Statement stmt = conn.createStatement();
        String sql = "CREATE TABLE IF NOT EXISTS Login (id INT NOT NULL AUTO_INCREMENT, userName VARCHAR(100), Password VARCHAR (50), secondName VARCHAR(100), Address VARCHAR(50), Number INT(15), State VARCHAR(20), AnimalName VARCHAR(50), Birthday int(50), FavoriteCarModel VARCHAR(50), BankName VARCHAR (50), BankAccNumber VARCHAR (50), MobileSimPinCode INT(4), FavoriteColor VARCHAR (50), Email VARCHAR (50), PRIMARY KEY (id, userName))";
        stmt.executeUpdate(sql);
         
    
  // sql = "INSERT INTO LOGIN(firstName, secondName, Addres)" + " VALUES(jTextField1.getText(),jTextField2.getText(),jTextField3.getText())";
  // stmt.executeUpdate(sql);
    
   return stmt; 
  
}

}
        


