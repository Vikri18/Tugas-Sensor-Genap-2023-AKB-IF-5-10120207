package com.thisvyx.mapsandrecomendation_10120207.Navigation;
/**
 *  NIM : 10120207
 *  NAMA : VIKRI FREDIANSYAH
 *  KELAS : IF-5
 */
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.thisvyx.mapsandrecomendation_10120207.R;


public class RestoFragment extends Fragment {


    private OnMapReadyCallback callback = new OnMapReadyCallback() {

        /**
         * Manipulates the map once available.
         * This callback is triggered when the map is ready to be used.
         * This is where we can add markers or lines, add listeners or move the camera.
         * In this case, we just add a marker near Sydney, Australia.
         * If Google Play services is not installed on the device, the user will be prompted to
         * install it inside the SupportMapFragment. This method will only be triggered once the
         * user has installed Google Play services and returned to the app.
         */
        @Override
        public void onMapReady(GoogleMap googleMap) {

            // LOKASI 1
            LatLng mcd = new LatLng(-6.885166,107.613572);
            googleMap.addMarker(new MarkerOptions().position(mcd).title("Lokasi 1: McDonalds"));

            // LOKASI 2
            LatLng reveuse = new LatLng(-6.885124,107.618905);
            googleMap.addMarker(new MarkerOptions().position(reveuse).title("Lokasi 2: Reveuse Resto"));

            // LOKASI 3
            LatLng richeeseFactory = new LatLng(-6.887729,107.615214);
            googleMap.addMarker(new MarkerOptions().position(richeeseFactory).title("Lokasi 3: Richeese Factory"));

            // LOKASI 4
            LatLng forklik = new LatLng(-6.887217,107.615083);
            googleMap.addMarker(new MarkerOptions().position(forklik).title("Lokasi 4: Forklik"));

            // LOKASI 5
            LatLng nasiSpg = new LatLng(-6.886609,107.615013);
            googleMap.addMarker(new MarkerOptions().position(nasiSpg).title("Lokasi 5: Warung Nasi SPG"));

            // Zoom
            googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(nasiSpg, 16));
        }
    };

    public RestoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_resto, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        SupportMapFragment mapFragment =
                (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.map);
        if (mapFragment != null) {
            mapFragment.getMapAsync(callback);
        }
    }
}