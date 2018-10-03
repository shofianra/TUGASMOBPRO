package com.shofianra.tmobpro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Terimakasih extends AppCompatActivity {
    private Button btnexit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terimakasih);

        btnexit =(Button) findViewById(R.id.exit);

        btnexit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                moveTaskToBack(true);

            }
        });
    }
}