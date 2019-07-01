package com.tts.BlackInfiniti;

import javax.persistence.*;

@Entity
public class Vehicle {

	@SequenceGenerator(name = "VEHICLE_SEQ", sequenceName = "vehicle_sequence")

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "VEHICLE_SEQ")
	private Long stockNumber;

	private int wholesaleCost; // Declares Dealer Wholesale price as integer (represents US Dollars)
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

	public Vehicle() {
	}

	Vehicle(int wholesaleCost, int retailPrice, int modelYear, String make, String model, String color, String vin,
			String vehicleType, boolean isLeasable, int leaseTerm, int maxMilesPerYear) {
		this.setWholesaleCost(wholesaleCost);
		this.setRetailPrice(retailPrice);
		this.setModelYear(modelYear);
		this.setMake(make);
		this.setModel(model);
		this.setColor(color);
		this.setVin(vin);
		this.setVehicleType(vehicleType);
		this.isActive = false;
		this.setLeasable(isLeasable);
		this.setLeaseTerm(leaseTerm);
		this.setMaxMilesPerYear(maxMilesPerYear);
	}

	public Long getStockNumber() {
		return stockNumber;
	}

	public void setStockNumber(Long stockNumber) {
		this.stockNumber = stockNumber;
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

	public int getWholesaleCost() {
		return wholesaleCost;
	}

	public void setWholesaleCost(int wholesaleCost) {
		this.wholesaleCost = wholesaleCost;
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

	public boolean getIsActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public boolean getIsLeasable() {
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