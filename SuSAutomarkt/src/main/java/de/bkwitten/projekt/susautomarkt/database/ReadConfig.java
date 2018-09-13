package de.bkwitten.projekt.susautomarkt.database;

import java.io.FileReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ReadConfig {

	private static String username;
	private static String password;

	@SuppressWarnings("unchecked")
	public static String readConfig() {
		JSONParser parser = new JSONParser();

		try {
			Object obj = parser.parse(new FileReader("./config.json"));

			JSONObject jsonObject = (JSONObject) obj;
			JSONObject location = (JSONObject) jsonObject.get("location");
			String ip = location.getOrDefault("ip", "localhost").toString();
			String port = location.getOrDefault("port", "3306").toString();

			JSONObject db = (JSONObject) jsonObject.get("database");
			String database = db.get("name").toString();
			boolean useUnicode = (Boolean) db.getOrDefault("unicode", true);

			JSONObject zone = (JSONObject) jsonObject.get("timezone");
			boolean useJDBCCompliantTimezoneShift = (Boolean) zone.getOrDefault("useJDBCCompliantTimezoneShift", true);
			boolean useLegacyDatetimeCode = (Boolean) zone.getOrDefault("useLegacyDatetimeCode", false);
			String timezone = zone.getOrDefault("serverTimezone", "UTC").toString();

			JSONObject credentials = (JSONObject) jsonObject.get("credentials");
			username = credentials.get("username").toString();
			password = credentials.get("password").toString();

			return urlBuilder(ip, port, database, useUnicode, useJDBCCompliantTimezoneShift, useLegacyDatetimeCode, timezone);

		} catch (Exception e) {
			System.out.println("Error: " + e);

			return null;
		}
	}

	public static String urlBuilder(String ip, String port, String database, boolean useUnicode, boolean useJDBCCompliantTimezoneShift, boolean useLegacyDatetimeCode,
			String timezone) {
		String url = "jdbc:mysql://" + ip + ":" + port + "/" + database + "?useUnicode=" + useUnicode + "&useJDBCCompliantTimezoneShift=" + useJDBCCompliantTimezoneShift
				+ "&useLegacyDatetimeCode=" + useLegacyDatetimeCode + "&serverTimezone=" + timezone;
		return url;
	}
}
