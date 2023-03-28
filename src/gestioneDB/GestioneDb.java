package gestioneDB;

import java.sql.SQLException;
import java.util.ArrayList;

import UserPack.User;
import connector.DBConnection;

public class GestioneDb {

	public static void main(String[] args) {
		try {
			DBConnection db = new DBConnection();
			// Aggiunge un utente nel DB
//			 User utente = new User("Giorgio", "Bianchi", 22, "g.bianchi@gmail.com");
//			 db.createUser(utente);
			
			// Leggo un utente nel database
//			 	User utenteLetto = db.findUser(1);
//			 	System.out.println(utenteLetto);
			
			// Modifico un utente nel database
			// utenteLetto.setAnni(44);
			// db.updateUser(utenteLetto);
			
			// Elimino un utente nel database
//			 db.deleteUser(utenteLetto);
			
			// Ritorno una lista con tutti gli utenti
			 ArrayList<User> userList = db.findAllUsers();
			 userList.forEach(u -> System.out.println(u));
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
