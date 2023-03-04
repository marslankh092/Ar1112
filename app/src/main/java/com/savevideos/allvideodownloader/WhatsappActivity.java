package com.savevideos.allvideodownloader;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;
import com.polyak.iconswitch.IconSwitch;

public class WhatsappActivity extends AppCompatActivity {

    private IconSwitch iconSwitch;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    private int[] tabIcons = {
            R.drawable.imagestatus,
            R.drawable.videostatus,
            R.drawable.downloadstatus
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whatsapp);


        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        iconSwitch = findViewById(R.id.iconSwitch);


        iconSwitch.setCheckedChangeListener(new IconSwitch.CheckedChangeListener() {@Override
        public void onCheckChanged(IconSwitch.Checked current) {
            switch (current) {

                case LEFT:
                    Toast.makeText(WhatsappActivity.this, "WhatsApp Status Showing ", Toast.LENGTH_SHORT).show();
                    break;

                case RIGHT:
                    Toast.makeText(WhatsappActivity.this, "WhatsApp Business Status Showing ", Toast.LENGTH_SHORT).show();
                    break;
            }
        }
        });


        tabLayout = findViewById(R.id.w_status_tablayout);
        viewPager = findViewById(R.id.w_status_viewpager);
        setupViewPager(viewPager);
        tabLayout.setupWithViewPager(viewPager);
        setupTabIcons();


    }


    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new WImageStatusFragment(), "Image");
        adapter.addFragment(new WVideoStatusFragment(), "Videos");
        adapter.addFragment(new WDownloadStatusFragment(), "Download");
        viewPager.setAdapter(adapter);
    }

    private void setupTabIcons() {
        tabLayout.getTabAt(0).setIcon(tabIcons[0]);
        tabLayout.getTabAt(1).setIcon(tabIcons[1]);
        tabLayout.getTabAt(2).setIcon(tabIcons[2]);
    }

}




