package com.ars.arstamptour;

import com.ars.arstamptour.DTOs.Attraction;
import com.google.android.gms.maps.model.LatLng;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CalculateDistance extends Thread {

    private  List<Attraction> Attractions;
    private LatLng currentPosition;

    public CalculateDistance(List<Attraction> Attractions){
        this.Attractions = Attractions;
    }

    @Override
    public void run() {
        super.run();
        try{
            for(Attraction obj : Attractions){
                obj.setDistance((int) LocationDistance.distance(obj.getLatitude(),obj.getLongitude(),currentPosition.latitude,currentPosition.longitude));
            }

            Collections.sort(Attractions, new Comparator<Attraction>() {
                @Override
                public int compare(Attraction o1, Attraction o2) {
                    return o2.getDistance()-o1.getDistance();
                }
            });
            Thread.sleep(10000);
        }
        catch (Exception e){

        }
    }
}
