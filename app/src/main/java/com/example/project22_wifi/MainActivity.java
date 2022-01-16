package com.example.project22_wifi;

import androidx.appcompat.app.AppCompatActivity;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv = findViewById(R.id.textview);
        ConnectivityManager conManager = (ConnectivityManager) getSystemService(CONNECTIVITY_SERVICE);//先取得此service
        NetworkInfo networInfo = conManager.getActiveNetworkInfo();       //在取得相關資訊
        switch (networInfo.getType()) {
            case ConnectivityManager.TYPE_WIFI:
                // connected to wifi
                tv.setText("wifi");
                break;
            case ConnectivityManager.TYPE_MOBILE:
                // connected to mobile data
                tv.setText("mobile data");
                break;
            default:
                break;
        }
    }

}