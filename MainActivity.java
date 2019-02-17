package com.example.vineetha.cardview1;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.provider.MediaStore;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toolbar;

import static android.media.MediaRecorder.VideoSource.CAMERA;

public class MainActivity extends Activity {
    TextView tx1,tx2,tx3,tx4,tx5,tx6;
    private static final int CAMERA_REQUEST = 1888;
    private static final int MY_CAMERA_PERMISSION_CODE = 100;
    ImageView img1,cam1;
    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tx1=(TextView) findViewById(R.id.tx1);
        tx2=(TextView) findViewById(R.id.tx2);
        tx3=(TextView) findViewById(R.id.tx3);
        tx4=(TextView) findViewById(R.id.tx4);
        tx5=(TextView) findViewById(R.id.tx5);
        tx6=(TextView) findViewById(R.id.tx6);
        img1=(ImageView)findViewById(R.id.img1);
        cam1=(ImageView)findViewById(R.id.cam1);

        tx1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,SecondActivity.class);
                startActivity(i);
            }
        });
        tx2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,ThirdActivity.class);
                startActivity(i);
            }
        });
        tx3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,FourthActivity.class);
                startActivity(i);
            }
        });
        tx4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,FifthActivity.class);
                startActivity(i);
            }
        });
        tx5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,SixthActivity.class);
                startActivity(i);
            }
        });
        tx6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,SeventhActivity.class);
                startActivity(i);
            }
        });
        img1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,NinthActivity.class);
                startActivity(i);
            }
        });
        cam1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent Intent3=new   Intent(MediaStore.INTENT_ACTION_STILL_IMAGE_CAMERA);
                startActivity(Intent3);
            } });

    }
}
