package com.kp.objectboxsample;

import android.app.Application;

public class MyApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        DBManager.INSTANCE.initBox(this);
    }
}
