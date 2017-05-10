package com.example.android.quakereport;

/**
 * Created by tito rat on 5/7/2017.
 */

public class Earthquake {

    double magnitude;
    String place;
    String date;
    String time;
    String positon;
    String url;

    Earthquake(double mag,String position,String place,String date , String time,String url){
        this.magnitude=mag;
        this.place=place;
        this.date=date;
        this.time=time;
        this.positon=position;
        this.url=url;

    }

    public double getMagnitude(){
        return magnitude;
    }
    public String getPlace(){
        return place;
    }
    public String getDate(){
        return date;
    }
    public String getTime(){return time;}
    public String getPositon(){return positon;}
    public String getUrl(){return url;}
}
