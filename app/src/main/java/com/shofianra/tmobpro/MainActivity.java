package com.shofianra.tmobpro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void panggil(View view) {
        String nomor = "08561608498" ;
        Intent panggil = new Intent(Intent. ACTION_DIAL);
        panggil.setData(Uri. fromParts("tel",nomor,null));
        startActivity(panggil);
    }

    public void buka(View view) {
        Intent intent = new Intent(MainActivity.this, Perhitungan.class);
        startActivity(intent);
    }
}
