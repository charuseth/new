package com.example.gchaset.map;
import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import android.widget.TextView;

public class ListActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

      //  TextView textview = new TextView(this);

        setContentView(R.layout.list);
    }


}

