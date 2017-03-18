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

public class MainActivity3 extends Activity {

    Button button;
    TextView tv3;
    Button button3;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        getActionBar().setHomeButtonEnabled(true);
        getActionBar().setDisplayHomeAsUpEnabled(true);
        addListenerOnButton();

        tv3 = (TextView) findViewById(R.id.You);
        button3 = (Button) findViewById(R.id.button3);
        Typeface face = Typeface.createFromAsset(getAssets(),"font/Bentham-Regular.ttf");
        tv3.setTypeface(face); button3.setTypeface(face);

    }

    public void addListenerOnButton() {

        final Context context = this;

        button = (Button) findViewById(R.id.button3);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, MainActivity4.class);
                startActivity(intent);

            }

        });

    }

}


