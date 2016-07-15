package com.geekniu.sdk.gntestspeed;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.geekniu.sdk.gnspeed.GNSpeed;
import com.geekniu.sdk.gnspeed.downLoadListener;
import com.geekniu.sdk.gnspeed.upLoadListener;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity  {

    @Bind(R.id.download_progress_bar)
    ProgressBar downloadProgressBar;
    @Bind(R.id.speed)
    TextView speed;
    @Bind(R.id.textView)
    TextView textView;
    @Bind(R.id.upload_progress_bar)
    ProgressBar uploadProgressBar;
    @Bind(R.id.upload_speed)
    TextView uploadSpeed;
    @Bind(R.id.test)
    Button test;
    private GNSpeed gnSpeed = GNSpeed.getInstance();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_speed);
        ButterKnife.bind(this);
        gnSpeed.init(this);
        gnSpeed.setDownLoadListener(new downLoadListener() {
            @Override
            public void downLoadSpeed(int progress, String s) {
                downloadProgressBar.setProgress(progress);
                speed.setText(s);
            }

            @Override
            public void downLoadComplete(int progress, String s) {
                downloadProgressBar.setProgress(progress);
                speed.setText(s);
            }
        });

        gnSpeed.setUpLoadListener(new upLoadListener() {
            @Override
            public void upLoadSpeed(int progress, String speed) {
                uploadProgressBar.setProgress(progress);
                uploadSpeed.setText(speed);
            }

            @Override
            public void upLoadComplete(int progress, String speed) {
                uploadProgressBar.setProgress(progress);
                uploadSpeed.setText(speed);
            }
        });

    }

    @OnClick(R.id.test)
    public void onClick() {
        gnSpeed.start();

    }
}
