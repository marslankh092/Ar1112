package com.savevideos.allvideodownloader;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ShowhistoryActivity extends AppCompatActivity {

    ImageView history_back, clear_history_image, search_history_image;

    TextView history_date;
    RecyclerView recyclerView;
    CardView clear_history_card;

    Button cancel_history_buttons;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showhistory);


        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);


        history_back = findViewById(R.id.history_back);
        history_date = findViewById(R.id.history_date);
        recyclerView = findViewById(R.id.show_history_recyclerview);
        clear_history_card = findViewById(R.id.clear_history_card);
        clear_history_image = findViewById(R.id.clear_history_image);
        search_history_image = findViewById(R.id.search_history_image);
        cancel_history_buttons = findViewById(R.id.cancel_history_buttons);

        history_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });



        clear_history_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                clear_history_card.setVisibility(View.VISIBLE);



            }
        });


        cancel_history_buttons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                clear_history_card.setVisibility(View.GONE);






            }
        });

        search_history_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });







    }
}


