package com.hatenablog.techium.quantumfluxsample;

import android.app.Application;
import android.content.Context;

import info.quantumflux.QuantumFlux;


public class SampleApplication extends Application {
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        QuantumFlux.initialize(this);
    }
}
