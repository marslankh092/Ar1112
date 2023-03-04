package com.savevideos.allvideodownloader;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class SecondFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.second_frag, container, false);

        TextView tv = (TextView) v.findViewById(R.id.tvFragSecond);
//        tv.setText(getArguments().getString("msg"));


        LinearLayout daily_buttons = v.findViewById(R.id.daily_buttons);

        daily_buttons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getContext(), "Dailymotion selected ", Toast.LENGTH_SHORT).show();
            }
        });

        LinearLayout tiktk_buttons = v.findViewById(R.id.tiktk_buttons);

        tiktk_buttons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getContext(), "TikTok selected ", Toast.LENGTH_SHORT).show();
            }
        });


        LinearLayout linked_buttons = v.findViewById(R.id.linked_buttons);

        linked_buttons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getContext(), "LinkedIn selected ", Toast.LENGTH_SHORT).show();
            }
        });

        LinearLayout fandms_buttons = v.findViewById(R.id.fandms_buttons);

        fandms_buttons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getContext(), "Fandom selected ", Toast.LENGTH_SHORT).show();
            }
        });

        LinearLayout gg9_buttons = v.findViewById(R.id.gg9_buttons);

        gg9_buttons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getContext(), "GG9 selected ", Toast.LENGTH_SHORT).show();
            }
        });

        LinearLayout tedds_buttons = v.findViewById(R.id.tedds_buttons);

        tedds_buttons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getContext(), "Tedd selected ", Toast.LENGTH_SHORT).show();
            }
        });

        LinearLayout imb_buttons = v.findViewById(R.id.imb_buttons);

        imb_buttons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getContext(), "IMDB selected ", Toast.LENGTH_SHORT).show();
            }
        });

        LinearLayout suggestns_buttons = v.findViewById(R.id.suggestns_buttons);

        suggestns_buttons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getContext(), "Suggestions selected ", Toast.LENGTH_SHORT).show();
            }
        });

        return v;
    }

//    public static SecondFragment newInstance(String text) {
//
//        SecondFragment f = new SecondFragment();
//        Bundle b = new Bundle();
//        b.putString("msg", text);
//
//        f.setArguments(b);
//
//        return f;
//    }
}