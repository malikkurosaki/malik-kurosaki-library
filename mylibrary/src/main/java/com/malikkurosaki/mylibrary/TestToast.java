package com.malikkurosaki.mylibrary;

import android.app.Activity;
import android.widget.Toast;

public class TestToast {

    public static void toast(Activity activity){
        Toast.makeText(activity.getApplicationContext(),"halo test",Toast.LENGTH_LONG).show();
        //halo
    }
}
