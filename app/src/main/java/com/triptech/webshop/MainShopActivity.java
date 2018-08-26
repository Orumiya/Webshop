package com.triptech.webshop;

import android.content.res.Configuration;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class MainShopActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_shop);

        DeviceSupport deviceSupport=new DeviceSupport(this);

        LinearLayout layout = findViewById(R.id.mainShopPromotions);
        ViewGroup.LayoutParams params = layout.getLayoutParams();
        params.height = (int)(deviceSupport.getHeight()*0.9);
        params.width = (int)(deviceSupport.getWidth());
        layout.setLayoutParams(params);
        Log.v("height: ", ""+params.height);




    }
}
