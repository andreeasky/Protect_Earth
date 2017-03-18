package com.example.android.mycard;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by User on 3/4/2017.
 */

public class MainActivity2 extends Activity {

    Button button;
    TextView tv2;
    Button button2;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getActionBar().setHomeButtonEnabled(true);
        getActionBar().setDisplayHomeAsUpEnabled(true);
        addListenerOnButton();

        tv2 = (TextView) findViewById(R.id.Me);
        button2 = (Button) findViewById(R.id.button2);
        Typeface face = Typeface.createFromAsset(getAssets(), "font/Bentham-Regular.ttf");
        tv2.setTypeface(face);
        button2.setTypeface(face);

    }

    public void addListenerOnButton() {

        final Context context = this;

        button = (Button) findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, MainActivity3.class);
                startActivity(intent);

            }

        });

    }

}

