
package config;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    Connection con;
    public Conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://becd9utqigidfuaqihsh-mysql.services.clever-cloud.com/becd9utqigidfuaqihsh","uaw0kaoedxhjyi09","ZufROiukm9GQ5TyMwpdH");
        } catch (Exception e) {
            System.err.println("Error:"+e);
        }        
    }
    public Connection getConnection(){
        return con;
    }
  }
