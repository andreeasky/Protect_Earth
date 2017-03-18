package com.example.android.mycard;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    Button button;
    TextView tv1;
    Button button1;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();

        tv1 = (TextView) findViewById(R.id.ProtectEarth);
        button1 = (Button) findViewById(R.id.button1);
        Typeface face = Typeface.createFromAsset(getAssets(),"font/Bentham-Regular.ttf");
        tv1.setTypeface(face); button1.setTypeface(face);

    }
    public void addListenerOnButton() {

        final Context context = this;

        button = (Button) findViewById(R.id.button1);

        button.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, MainActivity2.class);
                startActivity(intent);

            }

        });

    }

}

