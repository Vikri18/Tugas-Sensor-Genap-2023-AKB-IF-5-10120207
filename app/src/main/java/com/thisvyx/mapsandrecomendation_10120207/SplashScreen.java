package com.thisvyx.mapsandrecomendation_10120207;
/**
 *  NIM : 10120207
 *  NAMA : VIKRI FREDIANSYAH
 *  KELAS : IF-5
 */
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import com.thisvyx.mapsandrecomendation_10120207.ViewPager.ViewpagerActivity;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashScreen.this, ViewpagerActivity.class));
                finish();
            }
        }, 3000);
    }
}