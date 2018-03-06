package com.example.hello.yigexindejingdong.application;


import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Process;

/**
 * Created by 韦作铭 on 2018/2/23.
 */

public class DashApplication extends Application {

    private static int myTid;
    private static Handler handler;
    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();

        myTid = Process.myTid();
        handler = new Handler();
        context = getApplicationContext();

    }

    //获取主线程的id
    public static int getMainThreadId() {

        return myTid;
    }

    //获取handler
    public static Handler getAppHanler() {
        return handler;
    }

    public static Context getAppContext() {
        return context;
    }
}
