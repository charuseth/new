package com.example.gchaset.map;


import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TabHost;

/**
 * Created by gchaset on 6/26/2015.
 */



public class MainActivity extends TabActivity implements TabHost.OnTabChangeListener, View.OnClickListener {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Resources resources = getResources();
        TabHost tabHost = getTabHost();

        Intent intentlist= new Intent().setClass(this, ListActivity.class);
        TabHost.TabSpec tablist = tabHost
                .newTabSpec("list")
                //.setIndicator("", resources.getDrawable(R.mipmap.list))
                .setContent(intentlist);


        Intent intentmap= new Intent().setClass(this,MapsActivity.class);
        TabHost.TabSpec tabmap = tabHost
                .newTabSpec("activity_maps")
                //.setIndicator("", resources.getDrawable(R.mipmap.image))
                .setContent(intentmap);


        tabHost.addTab(tablist);
        tabHost.addTab(tabmap);

        tabHost.setOnClickListener(this);
        tabHost.setOnTabChangedListener(this);

        tabHost.setCurrentTab(0);
    }

    @Override
    public void onClick(View v) {
        Log.i("Onclick", "onclick");
    }

    @Override
    public void onTabChanged(String tabId) {
        Log.i("OnTabChanged", "onclick");
    }
}