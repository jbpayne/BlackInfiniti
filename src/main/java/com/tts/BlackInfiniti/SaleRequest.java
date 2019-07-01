package com.tts.BlackInfiniti;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class SaleRequest {
	
	@SequenceGenerator(name = "SR_SEQ", sequenceName = "sr_sequence")

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SR_SEQ")
	private Long ticketID;
	private Long id;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String email;
	private String address;
	private String typeOfSale;
	private Long stockNumber;
	private int wholeSaleCost; // Declares Dealer Wholesale price as integer (represents US Dollars)
	private int retailPrice; // Declares Dealer Retail price as integer (represents US Dollars)
	private int modelYear; // Declares vehicle model year as integer (Takes 4 digit integer)
	private String make; // Declares vehicle make as String
	private String model; // Declares vehicle model as String
	private String color; // Declares vehicle color as String
	private String vin; // Declares vehicle vin as String
	private String vehicleType; // Placeholder until functionality added (Using enum)
	private boolean isActive; // True when added to a Sale Request
	private boolean isLeasable; // Declares isLeasable variable as boolean
	private int leaseTerm; // Declares leaseTerm as integer in months
	private int maxMilesPerYear; // Declares Max Miles Per Year as integer
	
	SaleRequest() {
		
	}
	
	SaleRequest(Long id, String firstName, String lastName, String phoneNumber, String email, String address, String typeOfSale, Long stockNumber, int wholeSaleCost, int retailPrice, int modelYear, String make, String model, String color, String vin, String vehicleType, boolean isActive, boolean isLeasable, int leaseTerm, int maxMilesPerYear) {
		this.setId(id);
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setPhoneNumber(phoneNumber);
		this.setEmail(email);
		this.setAddress(address);
		this.setTypeOfSale(typeOfSale);
		this.setStockNumber(stockNumber);
		this.setWholeSaleCost(wholeSaleCost);
		this.setRetailPrice(retailPrice);
		this.setModelYear(modelYear);
		this.setMake(make);
		this.setModel(model);
		this.setColor(color);
		this.setVin(vin);
		this.setVehicleType(vehicleType);
		this.setActive(isActive);
		this.setLeasable(isLeasable);
		this.setLeaseTerm(leaseTerm);
		this.setMaxMilesPerYear(maxMilesPerYear);
	}

	public Long getTicketID() {
		return ticketID;
	}
	
	public void setTicketID(Long ticketID) {
		this.ticketID = ticketID;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTypeOfSale() {
		return typeOfSale;
	}

	public void setTypeOfSale(String typeOfSale) {
		this.typeOfSale = typeOfSale;
	}

	public Long getStockNumber() {
		return stockNumber;
	}

	public void setStockNumber(Long stockNumber) {
		this.stockNumber = stockNumber;
	}

	public int getWholeSaleCost() {
		return wholeSaleCost;
	}

	public void setWholeSaleCost(int wholeSaleCost) {
		this.wholeSaleCost = wholeSaleCost;
	}

	public int getRetailPrice() {
		return retailPrice;
	}

	public void setRetailPrice(int retailPrice) {
		this.retailPrice = retailPrice;
	}

	public int getModelYear() {
		return modelYear;
	}

	public void setModelYear(int modelYear) {
		this.modelYear = modelYear;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public boolean isLeasable() {
		return isLeasable;
	}

	public void setLeasable(boolean isLeasable) {
		this.isLeasable = isLeasable;
	}

	public int getLeaseTerm() {
		return leaseTerm;
	}

	public void setLeaseTerm(int leaseTerm) {
		this.leaseTerm = leaseTerm;
	}

	public int getMaxMilesPerYear() {
		return maxMilesPerYear;
	}

	public void setMaxMilesPerYear(int maxMilesPerYear) {
		this.maxMilesPerYear = maxMilesPerYear;
	}

}
