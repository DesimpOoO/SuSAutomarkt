package de.bkwitten.projekt.susautomarkt.entities;

public class Car {

	private int id = 0;
	private String currentOwner;
	private String mark;
	private String model;
	private String registrationDate;
	private double price;
	private byte[] image;
	private int mileage;
	private int preOwners;

	// horse power
	private int power;

	// car color and other color related specifications
	private String color;

	// number of doors
	private int doors;

	// number of seats
	private int seats;

	// consumtion per 100km
	private double consum;

	// Emisison class
	private String emission;

	// fine dust badget

	private int badget;

	// hubraum
	private double engine;

	public Car(String mark, String model, String registrationDate, double price, byte[] image, int mileage, int preOwners, int power, int doors, int seats, double consum,
			String emission, int badget, double engine) {

		setMark(mark);
		setRegistrationDate(registrationDate);
		setPrice(price);
		setImage(image);
		setMileage(mileage);
		setPreOwners(preOwners);
		setPower(power);
		setDoors(doors);
		setSeats(seats);
		setConsum(consum);
		setEmission(emission);
		setBadget(badget);
		setEngine(engine);

	}

	public int getId() {
		return id;
	}

	public String getCurrentOwner() {
		return currentOwner;
	}

	public void setCurrentOwner(String currentOwner) {
		this.currentOwner = currentOwner;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMark() {
		return mark;
	}

	public String getModel() {
		return model;
	}

	public String getRegistrationDate() {
		return registrationDate;
	}

	public double getPrice() {
		return price;
	}

	public byte[] getImage() {
		return image;
	}

	public int getMileage() {
		return mileage;
	}

	public int getPreOwners() {
		return preOwners;
	}

	public int getPower() {
		return power;
	}

	public String getColor() {
		return color;
	}

	public int getDoors() {
		return doors;
	}

	public int getSeats() {
		return seats;
	}

	public double getConsum() {
		return consum;
	}

	public String getEmission() {
		return emission;
	}

	public int getBadget() {
		return badget;
	}

	public double isEngine() {
		return engine;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setRegistrationDate(String registrationDate) {
		this.registrationDate = registrationDate;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	public void setPreOwners(int preOwners) {
		this.preOwners = preOwners;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public void setConsum(double consum) {
		this.consum = consum;
	}

	public void setEmission(String emission) {
		this.emission = emission;
	}

	public void setBadget(int badget) {
		this.badget = badget;
	}

	public void setEngine(double engine) {
		this.engine = engine;
	}

}
