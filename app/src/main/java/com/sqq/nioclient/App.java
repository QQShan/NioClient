package com.sqq.nioclient;

import android.app.Application;
import android.content.Intent;
import android.util.Log;

/**
 * Created by sqq on 2016/7/30.
 */
public class App extends Application {


    @Override
    public void onCreate() {
        super.onCreate();

        Intent intent = new Intent(App.this,TcpService.class);
        startService(intent);

    }

}
