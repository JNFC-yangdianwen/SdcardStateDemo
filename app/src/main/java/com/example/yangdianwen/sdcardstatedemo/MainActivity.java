package com.example.yangdianwen.sdcardstatedemo;

import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private SdcardRecevier sdcardRecevier;
    private IntentFilter filter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sdcardRecevier = new SdcardRecevier();
        filter = new IntentFilter();
        filter.addAction("android.intent.action.MEDIA_MOUNTED");
        filter.addAction("android.intent.action.MEDIA_UNMOUNTED");
        filter.addDataScheme("file");
        findViewById(R.id.btn_regist).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                registerReceiver(sdcardRecevier, filter);
            }
        });
        findViewById(R.id.btn_unregist).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                unregisterReceiver(sdcardRecevier);
            }
        });

    }
}
