package com.savevideos.allvideodownloader;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.rd.PageIndicatorView;

public class HomeSceenActivity extends FragmentActivity {

    PageIndicatorView pageIndicatorView;
    ViewPager pager;
    LinearLayout setting_menu_1, download_menu_1;

    CardView dashboard_options_3;
    RelativeLayout permission_dialog_home, cancel_storage_permissions;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_sceen);


        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        pager = findViewById(R.id.viewpager);
        pageIndicatorView = findViewById(R.id.pageIndicatorView);
        pager.setAdapter(new MyPagerAdapter(getSupportFragmentManager()));

        MyPagerAdapter adapter = new MyPagerAdapter(getSupportFragmentManager());
        pager.setAdapter(adapter);


        setting_menu_1 = findViewById(R.id.setting_menu_1);
        setting_menu_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(HomeSceenActivity.this, ShowhistoryActivity.class);
                startActivity(intent);

            }
        });

        dashboard_options_3 = findViewById(R.id.dashboard_options_3);
        permission_dialog_home = findViewById(R.id.permission_dialog_home);
        cancel_storage_permissions = findViewById(R.id.cancel_storage_permissions);

        cancel_storage_permissions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                dashboard_options_3.setVisibility(View.VISIBLE);
                permission_dialog_home.setVisibility(View.GONE);





                
            }
        });


        download_menu_1 = findViewById(R.id.download_menu_1);
        download_menu_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(HomeSceenActivity.this, DownloadsActivity.class);
                startActivity(intent);






            }
        });
    }


    public class MyPagerAdapter extends FragmentPagerAdapter {


        public MyPagerAdapter(@NonNull FragmentManager fm) {
            super(fm);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {

            if (position == 0) {
                return new FirstFragment();
            }else if (position == 1)
                return new SecondFragment();
            return new FirstFragment();

        }

        @Override
        public int getCount() {
            return 2;
        }

    }



//    private class MyPagerAdapter extends FragmentPagerAdapter {
//
//        public MyPagerAdapter(FragmentManager fm) {
//            super(fm);
//        }
//
//        @Override
//        public Fragment getItem(int pos) {
//
//            if(pos == 0)
//                return new FirstFragment();
//            else
//                return new SecondFragment();
//        }
//
//        @Override
//        public int getCount() {
//            return 2;
//        }
//    }
}









































