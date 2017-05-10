package com.example.android.quakereport;

import android.app.Activity;
import android.content.Context;
import android.support.v4.content.ContextCompat;

import static android.R.attr.entryValues;
import static android.R.attr.value;

/**
 * Created by tito rat on 5/10/2017.
 */

final public class MagColor {

     static public  int getMagColor(double mag , Context context) {

         if (mag < 2)
             return ContextCompat.getColor(context, R.color.magnitude1);

         if (mag < 3)
             return ContextCompat.getColor(context, R.color.magnitude2);

         if (mag < 4)
             return ContextCompat.getColor(context, R.color.magnitude3);

         if (mag < 5)
             return ContextCompat.getColor(context, R.color.magnitude4);

         if (mag < 6)
             return ContextCompat.getColor(context, R.color.magnitude5);

         if (mag < 7)
             return ContextCompat.getColor(context, R.color.magnitude6);

         if (mag < 8)
             return ContextCompat.getColor(context, R.color.magnitude7);

         if (mag < 9)
             return ContextCompat.getColor(context, R.color.magnitude8);


         if (mag < 10)
             return ContextCompat.getColor(context, R.color.magnitude9);

        return 0;

     }


}
