package com.example.biyongyao.safeapp.chapter01;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.widget.TextView;

import com.example.biyongyao.safeapp.HomeActivity;
import com.example.biyongyao.safeapp.R;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by biyongyao on 07/09/2017.
 */

public class SplashActivity  extends Activity {
    private TextView mVersionTv;

    private String mVersion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.active_splash);
//        mVersion=MyUtils.getVersion(getApplicationContext());
//        initView();
//        final VersionUpdateUtils updateUtils =new VersionUpdateUtils(mVersion,SplashActivity.this);
//        new Thread(){
//            public void run(){
//                updateUtils.getCloundVersion();
//            };
//        }.start();

        final Intent localIntent=new Intent(SplashActivity.this,HomeActivity.class);
        Timer timer=new Timer();
        TimerTask task=new TimerTask(){
            @Override
            public void run(){
                startActivity(localIntent);
            }
        };
        timer.schedule(task,3000);
    }

    private void initView(){
        mVersionTv=(TextView)findViewById(R.id.tv_splash_version);
        mVersionTv.setText("version"+ mVersion);
    }
}
