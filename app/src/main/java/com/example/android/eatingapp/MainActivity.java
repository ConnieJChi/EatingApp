package com.example.android.eatingapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Called when the cookie should be eaten.
     */
    public void clicked (View view) {
        ImageView image = (ImageView) findViewById(R.id.EatingPicture);
        image.setImageResource(R.drawable.after_cookie);

        TextView text = (TextView) findViewById(R.id.Full);
        text.setText("I ate the cookie!");
    }
}
