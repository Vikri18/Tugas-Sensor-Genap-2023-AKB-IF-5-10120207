package com.thisvyx.mapsandrecomendation_10120207.ViewPager;
/**
 *  NIM : 10120207
 *  NAMA : VIKRI FREDIANSYAH
 *  KELAS : IF-5
 */
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.thisvyx.mapsandrecomendation_10120207.MainActivity;
import com.thisvyx.mapsandrecomendation_10120207.R;

public class ViewpagerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ViewPager viewPager;
        ViewpagerAdapter viewpagerAdapter;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewpager);

        viewPager = findViewById(R.id.view_pager);
        viewpagerAdapter = new ViewpagerAdapter(this);

        viewPager.setAdapter(viewpagerAdapter);
    }

    public void onClick(View view){
        Intent intent = new Intent(ViewpagerActivity.this, MainActivity.class);
        startActivity(intent);
    }


}