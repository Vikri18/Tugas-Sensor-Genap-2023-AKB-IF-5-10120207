package com.thisvyx.mapsandrecomendation_10120207;
/**
 *  NIM : 10120207
 *  NAMA : VIKRI FREDIANSYAH
 *  KELAS : IF-5
 */
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.thisvyx.mapsandrecomendation_10120207.Navigation.LocationFragment;
import com.thisvyx.mapsandrecomendation_10120207.Navigation.ProfilFragment;
import com.thisvyx.mapsandrecomendation_10120207.Navigation.RestoFragment;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.botnav);
        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout,
                new ProfilFragment()).commit();

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment selectedFragment = null;

                switch (item.getItemId()) {
                    case R.id.profile:
                        selectedFragment = new ProfilFragment();
                        break;
                    case R.id.restoran:
                        selectedFragment = new RestoFragment();
                        break;

                    case R.id.location:
                        selectedFragment = new LocationFragment();
                        break;



                }

                getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout,
                        selectedFragment).commit();

                return true;
            }
        });

    }
}