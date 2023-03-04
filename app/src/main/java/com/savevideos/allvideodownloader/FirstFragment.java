package com.savevideos.allvideodownloader;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class FirstFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.first_frag, container, false);

        TextView tv = (TextView) v.findViewById(R.id.tvFragFirst);
        LinearLayout wa_buttons = v.findViewById(R.id.wa_buttons);
        LinearLayout fb_buttons = v.findViewById(R.id.fb_buttons);
        LinearLayout insta_buttons = v.findViewById(R.id.insta_buttons);
        LinearLayout vime_buttons = v.findViewById(R.id.vime_buttons);
        LinearLayout pintrst_buttons = v.findViewById(R.id.pintrst_buttons);
        LinearLayout twitr_buttons = v.findViewById(R.id.twitr_buttons);
        LinearLayout reddt_buttons = v.findViewById(R.id.reddt_buttons);
        LinearLayout like_buttons = v.findViewById(R.id.like_buttons);



        wa_buttons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getContext(), WhatsappActivity.class);
                startActivity(intent);
            }
        });

        fb_buttons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Toast.makeText(getContext(), "Facebook selected ", Toast.LENGTH_SHORT).show();
            }
        });


        insta_buttons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getContext(), "Instagram selected ", Toast.LENGTH_SHORT).show();
            }
        });

        vime_buttons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Toast.makeText(getContext(), "Vime selected ", Toast.LENGTH_SHORT).show();
            }
        });

        pintrst_buttons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getContext(), "Pinterest selected ", Toast.LENGTH_SHORT).show();
            }
        });

        twitr_buttons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Toast.makeText(getContext(), "Twitter selected ", Toast.LENGTH_SHORT).show();
            }
        });

        reddt_buttons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getContext(), "Reddit selected ", Toast.LENGTH_SHORT).show();
            }
        });

        like_buttons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Toast.makeText(getContext(), "Likee seleected ", Toast.LENGTH_SHORT).show();
            }
        });

        return v;
    }

//    public static FirstFragment newInstance(String text) {
//
//        FirstFragment f = new FirstFragment();
//        Bundle b = new Bundle();
//        b.putString("msg", text);
//
//        f.setArguments(b);
//
//        return f;
//    }
}