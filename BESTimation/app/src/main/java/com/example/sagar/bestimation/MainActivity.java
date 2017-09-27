package com.example.sagar.bestimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView tv = (TextView)findViewById(R.id.result);
        final String[] quotes = {
                "Your Bus will arrive in 7 minutes"
        };
        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                int random = Random.nextInt(quotes.length);
                //Random r = new Random();
                //int random = r.nextInt((quotes.length-1) - 0);

                tv.setText(quotes[0]);
            }
        });
    }
}
