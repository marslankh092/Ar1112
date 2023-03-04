package com.savevideos.allvideodownloader;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;

public class BookyourflightActivity extends AppCompatActivity {

    TextView one_way_buttons, round_trip_buttons, one_way_enable_buttons, round_trip_enable_buttons;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bookyourflight);



        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);



        one_way_buttons = findViewById(R.id.one_way_buttons);
        round_trip_buttons = findViewById(R.id.round_trip_buttons);
        one_way_enable_buttons = findViewById(R.id.one_way_enable_buttons);
        round_trip_enable_buttons = findViewById(R.id.round_trip_enable_buttons);

        round_trip_buttons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                one_way_enable_buttons.setVisibility(View.GONE);
                round_trip_enable_buttons.setVisibility(View.VISIBLE);

                Toast.makeText(BookyourflightActivity.this, "Round trip selected ", Toast.LENGTH_SHORT).show();
            }
        });



        one_way_buttons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                one_way_enable_buttons.setVisibility(View.VISIBLE);
                round_trip_enable_buttons.setVisibility(View.GONE);

                Toast.makeText(BookyourflightActivity.this, "One way selected ", Toast.LENGTH_SHORT).show();
            }
        });

    }
}

