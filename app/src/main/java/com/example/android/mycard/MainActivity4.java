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

public class MainActivity4 extends Activity {

    Button button;
    TextView tv4;
    Button button4;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        getActionBar().setHomeButtonEnabled(true);
        getActionBar().setDisplayHomeAsUpEnabled(true);
        addListenerOnButton();

        tv4 = (TextView) findViewById(R.id.We);
        button4 = (Button) findViewById(R.id.button4);
        Typeface face = Typeface.createFromAsset(getAssets(),"font/Bentham-Regular.ttf");
        tv4.setTypeface(face); button4.setTypeface(face);

    }

    public void addListenerOnButton() {

        final Context context = this;

        button = (Button) findViewById(R.id.button4);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, MainActivity5.class);
                startActivity(intent);

            }

        });

    }

}



