package de.bkwitten.projekt.susautomarkt.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import de.bkwitten.projekt.susautomarkt.entities.Car;
import de.bkwitten.projekt.susautomarkt.entities.User;

public class DBQuerys {

	private ResultSet result;
	private static Connection con;
	private static Statement state;

	public DBQuerys(String url, String username, String password) {
		try {
			con = DriverManager.getConnection(url, username, password);
			state = con.createStatement();
		} catch (SQLException e) {
			System.out.println("Error connecting to databse: " + e);
		}
	}

	public void getDataFromColumn(String table, String column) {
		try {
			String query = "SELECT * FROM " + table;
			result = state.executeQuery(query);
			while (result.next()) {
				String value = result.getString(column);

				System.out.println(column + ": " + value);
			}

		} catch (Exception ex) {
			System.out.println("Error: " + ex);
		}
	}

	public void updateOwner(String currentOwner, String newOwner, String table, String column, String selector) {
		try {
			PreparedStatement updateEXP = con.prepareStatement("UPDATE " + table + " SET " + column + "='" + newOwner + "' WHERE " + selector + "='" + currentOwner + "'");
			int affectedRows = updateEXP.executeUpdate();
			System.out.println("Changed value owner in row: " + affectedRows);

		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}

	// TODO add missing attributes
	public void addCar(String table, Car car) {
		try {
			PreparedStatement updateEXP = con.prepareStatement("INSERT INTO `" + table + "` (`make`, `price`, `owner`, `id`) VALUES ('" + car.getMark() + "', '" + car.getPrice()
					+ "', '" + car.getCurrentOwner() + "'. '" + car.getCurrentOwner() + "')");
			int affectedRows = updateEXP.executeUpdate();
			System.out.println("Changed value owner in row: " + affectedRows);

		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}

	// TODO
	public void changeCar() {

	}

	public void deleteCar(String table, String selector, int id) {
		try {
			PreparedStatement updateEXP = con.prepareStatement("DELETE FROM " + table + " WHERE " + selector + "='" + id + "'");
			int affectedRows = updateEXP.executeUpdate();
			System.out.println("Changed value owner in row: " + affectedRows);

		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}

	// TODO add missing attributes
	public void addUser(String table, User user) {
		try {
                    //ID muss beim adden autogeneriert werden und kommt nicht aus dem Objekt
			PreparedStatement updateEXP = con.prepareStatement("INSERT INTO `" + table + "` (`name`, `last name`, `password`, `email`, `id`) VALUES ('" + user.getName() + "', '"
					+ user.getLastName() + "', '" + user.getPassword() + "', '" + user.getEmail() + "', '" + user.getId() + "')");
			int affectedRows = updateEXP.executeUpdate();
			System.out.println("Changed value owner in row: " + affectedRows);
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}

	// TODO
	public void changeUser() {

	}

	public void deleteUser(String table, String selector, int id) {
		try {
			PreparedStatement updateEXP = con.prepareStatement("DELETE FROM " + table + " WHERE " + selector + "='" + id + "'");
			int affectedRows = updateEXP.executeUpdate();
			System.out.println("Changed value owner in row: " + affectedRows);

		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}

	// TODO
	public void addInterior() {

	}

	public void changeInterior() {

	}

	public void deleteInterior() {

	}
}
