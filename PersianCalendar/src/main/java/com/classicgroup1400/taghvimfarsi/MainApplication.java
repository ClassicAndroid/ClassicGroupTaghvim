package com.classicgroup1400.taghvimfarsi;

import android.app.Application;

import com.classicgroup1400.taghvimfarsi.util.Utils;
import com.google.firebase.FirebaseApp;


public class MainApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Utils.initUtils(getApplicationContext());
        FirebaseApp.initializeApp(this);

    }
}
