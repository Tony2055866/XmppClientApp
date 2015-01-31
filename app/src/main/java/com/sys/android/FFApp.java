package com.sys.android;

import android.app.Application;
import android.util.Log;

/**
 * Created by Administrator on 2015/1/21.
 */
public class FFApp extends Application{
    @Override
    public void onTerminate() {
        Log.i("tong test", "FFApp onTerminate");
    }
}
