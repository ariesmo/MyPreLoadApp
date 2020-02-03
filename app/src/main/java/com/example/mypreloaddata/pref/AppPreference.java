package com.example.mypreloaddata.pref;

import android.content.Context;
import android.content.SharedPreferences;

public class AppPreference {

//    Menyimpan Data

    private static final String PREFS_NAME = "MahasiswaPref";
    private static final String APP_FIRST_RUN = "app_first_name";
    private SharedPreferences prefs;

    public AppPreference(Context context) {
        prefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
    }

    public void setFirstRun(Boolean input){
        SharedPreferences.Editor editor = prefs.edit();
        editor.putBoolean(APP_FIRST_RUN, input);
        editor.apply();
    }

    public boolean getFirstRun(){
        return prefs.getBoolean(APP_FIRST_RUN, true);
    }
}
