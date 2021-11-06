package com.example.servicetest;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;


public class MyService extends Service {

    public boolean isRand = false;
    public MyService() {
    }

    public void setRand(boolean mm) {
//        if (isRand == false) isRand = true;
//        else isRand = mm;
        isRand = mm;
        return;
    }

    public boolean isRad() {
        return isRand;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.e("AAA Start","service");
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}