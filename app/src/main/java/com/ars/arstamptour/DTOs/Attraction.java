package com.ars.arstamptour.DTOs;

public class Attraction {
    int Att_Id;
    String name;
    String Info;
    String Address;
    String Image;
    Double Latitude;
    Double Longitude;
    int Local_GU;

    int distance;

    public int getAtt_Id() {
        return Att_Id;
    }

    public void setAtt_Id(int att_Id) {
        Att_Id = att_Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return Info;
    }

    public void setInfo(String info) {
        Info = info;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }

    public Double getLatitude() {
        return Latitude;
    }

    public void setLatitude(Double latitude) {
        Latitude = latitude;
    }

    public Double getLongitude() {
        return Longitude;
    }

    public void setLongitude(Double longitude) {
        Longitude = longitude;
    }

    public int getLocal_GU() {
        return Local_GU;
    }

    public void setLocal_GU(int local_GU) {
        Local_GU = local_GU;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
}
