package com.victorai60.x5;

import android.app.Application;

import com.tencent.smtt.sdk.QbSdk;

public class X5Application extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        QbSdk.initX5Environment(getApplicationContext(), null);
    }
}
