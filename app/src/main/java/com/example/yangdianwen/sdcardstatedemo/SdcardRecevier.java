package com.example.yangdianwen.sdcardstatedemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by yangdianwen on 16-7-3.
 */
public class SdcardRecevier extends BroadcastReceiver {
    private static final String TAG = "SdcardRecevier";
    @Override
    public void onReceive(Context context, Intent intent) {
//        String action = intent.getAction();
//        if ("android.intent.action.MEDIA_MOUNTED".equals(action)){
//            Log.d(TAG, "onReceive:  sdcard被挂载了");
//        }
        String action = intent.getAction();
        if ("android.intent.action.MEDIA_MOUNTED".equals(action)){
        Toast.makeText(context, "SD卡被挂载", Toast.LENGTH_SHORT).show();
        }else if ("android.intent.action.MEDIA_UNMOUNTED".equals(action)){
            Toast.makeText(context, "SD卡被卸载", Toast.LENGTH_SHORT).show();
        }
    }
}
