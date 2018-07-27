package com.example.xyzreader.remote;

import android.util.Log;

import java.net.MalformedURLException;
import java.net.URL;

public class Config {
    public static final URL BASE_URL;
    private static String TAG = Config.class.toString();

    static {
        URL url = null;
        try {
            //url = new URL("https://go.udacity.com/xyz-reader-json" );
            url = new URL("https://raw.githubusercontent.com/SuperAwesomeness/XYZReader/master/data.json" );
        } catch (MalformedURLException e)  {
            // T ODO: throw a real error
            throw new Error("Please check your internet connection.", e);
        }

        BASE_URL = url;
    }
}
