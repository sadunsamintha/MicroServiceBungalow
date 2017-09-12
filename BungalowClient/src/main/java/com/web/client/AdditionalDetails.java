package com.web.client;



/**
 * Created by sadun on 9/11/17.
 */
public class AdditionalDetails {

   private String numberOfACRooms;
    private String numberOfNonACRooms;

    public AdditionalDetails() {
    }

    public AdditionalDetails(String numberOfACRooms, String numberOfNonACRooms) {
        this.numberOfACRooms = numberOfACRooms;
        this.numberOfNonACRooms = numberOfNonACRooms;
    }

    public String getNumberOfACRooms() {
        return numberOfACRooms;
    }

    public void setNumberOfACRooms(String numberOfACRooms) {
        this.numberOfACRooms = numberOfACRooms;
    }

    public String getNumberOfNonACRooms() {
        return numberOfNonACRooms;
    }

    public void setNumberOfNonACRooms(String numberOfNonACRooms) {
        this.numberOfNonACRooms = numberOfNonACRooms;
    }
}
