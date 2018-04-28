package vn.manroid.scanner.view;

import android.Manifest;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Handler;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import vn.manroid.scanner.R;

public class StartActivity extends AppCompatActivity {

    TextView txtTitle;
    TextView txtDes;
    TextView txt_policy;
    Button btnStart;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        txt_policy = findViewById(R.id.txt_policy);
        txtDes = findViewById(R.id.txt_des);
        txtTitle = findViewById(R.id.txt_title);
        btnStart = findViewById(R.id.btn_start);

        Animation anim1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_in);
        txtTitle.startAnimation(anim1);
        txtTitle.setVisibility(View.VISIBLE);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Animation anim2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_in);
                txtDes.startAnimation(anim2);
                txtDes.setVisibility(View.VISIBLE);
            }
        }, 1000);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Animation anim3 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_in);
                txt_policy.startAnimation(anim3);
                txt_policy.setVisibility(View.VISIBLE);

            }
        }, 2000);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Animation anim4 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_in);
                btnStart.startAnimation(anim4);
                btnStart.setVisibility(View.VISIBLE);
            }
        }, 3000);


        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StartActivity.this, ScanActivity.class));
            }
        });
    }

}