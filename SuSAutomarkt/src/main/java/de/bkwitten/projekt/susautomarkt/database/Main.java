package de.bkwitten.projekt.susautomarkt.database;

import de.bkwitten.projekt.susautomarkt.entities.*;
import de.bkwitten.projekt.susautomarkt.entities.User.Role;

public class Main {

	private static String username;
	private static String password;

	public static void main(String[] args) {

		/*
		 * Neue Autos, Innenausstattungen und User sollten am besten als JSON
		 * kommen Ich geb den Kram aus der DB auch wiede als JSON zurück
		 */

		ReadConfig config = new ReadConfig();
		String url = ReadConfig.readConfig();

		DBQuerys connection = new DBQuerys(url, username, password);

		// dummy image
		byte[] image = null;
		Car car = new Car("mercedes", "amg", "12.09.2018", 98000, image, 20000, 2, 467, 5, 5, 9.7, "EURO 6", 5, 3982);
		connection.addCar("cars", car);

		User user = new User("Fionera", "Tim", "Windelschmidt", "DickLover", "12.09.2018", "Fionera@fionera.com", Role.USER);
		connection.addUser("users", user);
	}
}
