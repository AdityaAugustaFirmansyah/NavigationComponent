package com.aditya.navigationcomponent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;

import android.net.Uri;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements Running.OnFragmentInteractionListener, end.OnFragmentInteractionListener, Start.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
