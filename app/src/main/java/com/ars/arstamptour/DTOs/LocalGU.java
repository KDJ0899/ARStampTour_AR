package com.ars.arstamptour.DTOs;

public class LocalGU {
    private int GU_Id;
    private String Name;
    private Double Latitude;
    private Double Longitude;
    private String Image;
    private int LocalSI;


    public int getGU_Id() {
        return GU_Id;
    }

    public void setGU_Id(int GU_Id) {
        this.GU_Id = GU_Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
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

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }

    public int getLocalSI() {
        return LocalSI;
    }

    public void setLocalSI(int localSI) {
        LocalSI = localSI;
    }
}
