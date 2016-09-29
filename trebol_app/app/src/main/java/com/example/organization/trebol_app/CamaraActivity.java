package com.example.organization.trebol_app;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import android.graphics.Bitmap;
import android.hardware.Camera;
import android.hardware.Camera.PictureCallback;
import android.hardware.Camera.ShutterCallback;

/**
 * Created by origami-idea on 29-Sep-16.
 */
public class CamaraActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.camera_main);

    }
}
