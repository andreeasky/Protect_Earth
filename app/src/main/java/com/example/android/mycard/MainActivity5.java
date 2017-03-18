package com.example.android.mycard;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity5 extends Activity implements View.OnClickListener {

    TextView tv5;
    TextView tv6;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        getActionBar().setHomeButtonEnabled(true);
        getActionBar().setDisplayHomeAsUpEnabled(true);

        tv5 = (TextView) findViewById(R.id.TogetherWeCan);
        tv6 = (TextView) findViewById(R.id.SaveTheEarth);
        Typeface face = Typeface.createFromAsset(getAssets(), "font/Bentham-Regular.ttf");
        tv5.setTypeface(face);
        tv6.setTypeface(face);
    }

    @Override
    public void onClick(View v) {

        final TextView tv6 = (TextView) findViewById(R.id.SaveTheEarth);
        tv6.setOnClickListener(this);

        if ("SAVE the EARTH".equals(tv6.getText().toString()))
            tv6.setText("MAKE a BETTER WORLD");
        else if ("MAKE a BETTER WORLD".equals(tv6.getText().toString()))
            tv6.setText("GIVE and SHARE");
        else if ("GIVE and SHARE".equals(tv6.getText().toString()))
            tv6.setText("SAVE the EARTH");
    }
}






