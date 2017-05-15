package com.example.rajeshrana.service_musicinbackground;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn_start;
    private Button btn_stop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        onCLickButtonListener();
    }


    public void onCLickButtonListener(){


        btn_start = (Button)findViewById(R.id.button);
        btn_stop = (Button)findViewById(R.id.button2);

            btn_start.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startService(new Intent(MainActivity.this, MyService.class));
                }
            });


        btn_stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    stopService(new Intent(MainActivity.this, MyService.class));
            }
        });




    }
}
