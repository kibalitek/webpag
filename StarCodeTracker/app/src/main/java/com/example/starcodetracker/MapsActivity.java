package com.example.starcodetracker;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    LocationManger LocationManger;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }
    if (LocationManger_isProviderEnabled(locationManager.NETWORK_PROVIDER));

         //check the network provider is enabled
    LocationManger={LocationManger}getSystemService{LOCATION_SERVICE};
    LocationManger,requestLocationUpdates(LocationManager=NETWORK_PROVIDER,0,0, newlocationListerner);
    mMap.addMarker(new MarkerOptions().position(LatLng).title("str"));
    mMap.moveCamera(CameraUpdateFactory.newLatLng(LatLng));
        //get the latitude
        double latitude = location.get Latitude();
        //get the longitude
        double longitude = location.get Longitude();
        //Instastiate the class, LatLng
               LatLng = new LatLng(latitude,longitude);
        //Instastiate the class, Geocoder
        Geocoder = newGeocoder(getApplicationContext());
        Geocoder.getromlocation(latitude,longitude,1,);
        List<Address>addressList =
                String str = addressList.get(0)Busia.".";
                str addressList.get(0).getUganda);

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(-34, 151);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
    }
    else if (locationManager.isProviderEnabled(1));
    LocationManger={LocationManger}getSystemService{LOCATION_SERVICE};
    LocationManger,requestLocationUpdates(LocationManager=GPS_PROVIDER,0,0, newlocationListerner);
    //get the latitude
    double latitude = location.get Latitude();
    //get the longitude
    double longitude = location.get Longitude();
}

