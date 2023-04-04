package SQL;
import java.util.List;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class data {
	
public static void ConnectionBD() {
	Connection connect=null;
	
	try {
		Class.forName("org.postgresql.Driver");
		connect=DriverManager.getConnection("jdbc:postgresql://databasetesteleve.cv0buosi4vqj.eu-north-1.rds.amazonaws.com:5432/", "postgres", "CyrilBDD2023");
		
		if(connect!=null) {
			System.out.println("ConnectionOk");
		}else {
			System.out.println("Connection Erreur");
		}
		
	}catch (Exception e) {
		System.out.println(e);
	}
	
	
}

/**
 * 
 * @return la liste des noms des élèves prséents dans la base 
 */
public static ArrayList<String> NomsEleve() {
	   Connection connect = null;
	   java.sql.Statement stmt = null;
	   ResultSet rs = null;
   try {
	         // Charger le pilote JDBC
	         Class.forName("org.postgresql.Driver");

	         // Établir une connexion à la base de données
	         connect=DriverManager.getConnection("jdbc:postgresql://databasetesteleve.cv0buosi4vqj.eu-north-1.rds.amazonaws.com:5432/", "postgres", "CyrilBDD2023");
	 		
	         
	         // Créer une requête SQL
	         String sql = "SELECT NOM FROM infosEleveTEST";
	         
	         //liste qui va contenir l'ensemble des noms
	         ArrayList<String> lstNoms = new ArrayList<>();
	       

	         // Exécuter la requête
	         stmt = connect.createStatement();
	         rs = stmt.executeQuery(sql);
	         
	         // Afficher les résultats
	         while (rs.next()) {
	        	lstNoms.add(rs.getString(1));
	         }
	         
	         //return de la methode
	         return lstNoms;

   } catch (SQLException ex) {
	         ex.printStackTrace();
	      } catch (ClassNotFoundException ex) {
	         ex.printStackTrace();
	      } finally {
	         try {
	            if (rs != null) {
	               rs.close();
	            }
	            if (stmt != null) {
	               stmt.close();
	            }
	            if (connect != null) {
	               connect.close();
	            }
	         } catch (SQLException ex) {
	            ex.printStackTrace();
	         }
	      }
   return null;
   

		

   
	   }
	
	
	
	
}
	