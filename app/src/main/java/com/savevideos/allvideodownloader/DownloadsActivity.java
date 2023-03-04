package com.savevideos.allvideodownloader;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class DownloadsActivity extends AppCompatActivity {


    LinearLayout show_linear_downloads, show_grid_downloads, download_options_dialog, download_delete_dialog;
    CardView downloads_delete;
    RelativeLayout download_delete_cancel_dialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_downloads);



        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);



        show_linear_downloads = findViewById(R.id.show_linear_downloads);
        show_grid_downloads = findViewById(R.id.show_grid_downloads);


        show_linear_downloads.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                show_linear_downloads.setVisibility(View.GONE);
                show_grid_downloads.setVisibility(View.VISIBLE);

            }
        });

        show_grid_downloads.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                show_grid_downloads.setVisibility(View.GONE);
                show_linear_downloads.setVisibility(View.VISIBLE);


            }
        });

        download_options_dialog = findViewById(R.id.download_options_dialog);
        download_delete_dialog = findViewById(R.id.download_delete_dialog);
        downloads_delete = findViewById(R.id.downloads_delete);
        download_delete_cancel_dialog = findViewById(R.id.download_delete_cancel_dialog);



        downloads_delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                download_options_dialog.setVisibility(View.GONE);
                download_delete_dialog.setVisibility(View.VISIBLE);

            }
        });

        download_delete_cancel_dialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                download_options_dialog.setVisibility(View.VISIBLE);
                download_delete_dialog.setVisibility(View.GONE);

            }
        });
    }
}

