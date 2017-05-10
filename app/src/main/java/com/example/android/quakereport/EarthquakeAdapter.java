package com.example.android.quakereport;

import android.app.Activity;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by tito rat on 5/7/2017.
 */

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    public EarthquakeAdapter (Activity context , ArrayList<Earthquake> data){
        super(context,0,data);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView==null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }

        Earthquake currentObject = getItem(position);

        TextView mMagnitude = (TextView) listItemView.findViewById(R.id.magnitude_text);
        mMagnitude.setText(String.valueOf( currentObject.getMagnitude()));

        TextView mPosition = (TextView) listItemView.findViewById(R.id.position_text);
        mPosition.setText(currentObject.getPositon());

        TextView mPlace = (TextView) listItemView.findViewById(R.id.place_text);
        mPlace.setText(currentObject.getPlace());

        TextView mDate = (TextView) listItemView.findViewById(R.id.date_text);
        mDate.setText(currentObject.getDate());

        TextView mTime = (TextView) listItemView.findViewById(R.id.time_text);
        mTime.setText(currentObject.getTime());


        GradientDrawable magCircle = (GradientDrawable)mMagnitude.getBackground();

        int magColor = MagColor.getMagColor(currentObject.getMagnitude(),getContext());

        magCircle.setColor(magColor);



        return listItemView;
    }
}
