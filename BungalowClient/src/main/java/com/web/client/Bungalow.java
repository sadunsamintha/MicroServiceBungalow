package com.web.client;






import java.io.Serializable;
public class Bungalow implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	String name;
	String regionId;
	String regionName;
	String bungalowCode;
	String bungalowRate;
	String address;
	String contactNumber;
	String bungalowImageURL;
	String maximumOccupancy;
	AdditionalDetails additionalDetails;
	


	public Bungalow() {	}

	public Bungalow(String name, String regionId, String bungalowCode, String bungalowRate, String address, String contactNumber, String bungalowImageURL, String maximumOccupancy, AdditionalDetails additionalDetails) {
		this.name = name;
		this.regionId = regionId;
		this.bungalowCode = bungalowCode;
		this.bungalowRate = bungalowRate;
		this.address = address;
		this.contactNumber = contactNumber;
		this.bungalowImageURL = bungalowImageURL;
		this.maximumOccupancy = maximumOccupancy;
		this.additionalDetails = additionalDetails;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRegionId() {
		return regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public String getBungalowCode() {
		return bungalowCode;
	}

	public void setBungalowCode(String bungalowCode) {
		this.bungalowCode = bungalowCode;
	}

	public String getBungalowRate() {
		return bungalowRate;
	}

	public void setBungalowRate(String bungalowRate) {
		this.bungalowRate = bungalowRate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContactNumber() {
		return contactNumber;
	}
	

	public String getRegionName() {
		return regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getBungalowImageURL() {
		return bungalowImageURL;
	}

	public void setBungalowImageURL(String bungalowImageURL) {
		this.bungalowImageURL = bungalowImageURL;
	}

	public String getMaximumOccupancy() {
		return maximumOccupancy;
	}

	public void setMaximumOccupancy(String maximumOccupancy) {
		this.maximumOccupancy = maximumOccupancy;
	}

	public AdditionalDetails getAdditionalDetails() {
		return additionalDetails;
	}

	public void setAdditionalDetails(AdditionalDetails additionalDetails) {
		this.additionalDetails = additionalDetails;
	}
	
}
