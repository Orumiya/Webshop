package com.triptech.webshop;

import android.app.Activity;
import android.util.DisplayMetrics;

/**
 * Created by user on 2018. 08. 26..
 */

public class DeviceSupport {

    private Integer width;
    private Integer height;

    public Integer getWidth() {
        return width;
    }

    public Integer getHeight() {
        return height;
    }

    public DeviceSupport(Activity homeActivity) {
        DisplayMetrics dm=new DisplayMetrics();
        homeActivity.getWindowManager().getDefaultDisplay().getMetrics(dm);

        width=dm.widthPixels;
        height=dm.heightPixels;
    }


}
