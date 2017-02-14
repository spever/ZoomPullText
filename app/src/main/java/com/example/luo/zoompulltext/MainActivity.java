package com.example.luo.zoompulltext;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.luo.zoompulltext.util.TinkerManager;
import com.example.luo.zoompulltext.util.Utils;
import com.tencent.tinker.lib.service.TinkerPatchService;
import com.tencent.tinker.lib.tinker.TinkerInstaller;
import com.tencent.tinker.lib.util.TinkerServiceInternals;

public class MainActivity extends AppCompatActivity {

    private TextView tvTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvTextView = (TextView) findViewById(R.id.tv_text);
        tvTextView.setText("我是patch");
        tvTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TinkerInstaller.onReceiveUpgradePatch(getApplicationContext(), Environment.getExternalStorageDirectory().getAbsolutePath() + "/patch_signed_7zip.apk");
            }
        });
    }

}
