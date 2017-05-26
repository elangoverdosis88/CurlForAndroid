package io.github.lizhangqu.curl.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import io.github.lizhangqu.curl.Curl;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Curl.dump("https://vap.gw.weidian.com/com.vdian.sword/appconf/getConfig/1.1");
            }
        });

    }
}
