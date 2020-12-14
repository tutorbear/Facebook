package com.example.facebook;

import android.app.Application;

import com.parse.Parse;
import com.parse.facebook.ParseFacebookUtils;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId(getString(R.string.back4app_app_id))
                // if defined
                .enableLocalDataStore()
                .clientKey(getString(R.string.back4app_client_key))
                .server(getString(R.string.back4app_server_url))
                .build()
        );
        ParseFacebookUtils.initialize(this);

    }
}
