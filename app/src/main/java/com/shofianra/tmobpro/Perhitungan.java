package com.shofianra.tmobpro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Perhitungan extends AppCompatActivity {
    private EditText edtnamamkn, edtnamamnm, edtjumlahbel, edtjumlahbelim, edtharga, edthargam;
    private Button btnbayar;
    private Button btnselesai;
    private TextView txtnamamkn, txtnamamnm;
    private TextView txtjumlahbel, txtjumlahbelim;
    private TextView txtharga, txthargam;
    private TextView txttotalbelanja;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtnamamkn = (EditText) findViewById(R.id.namamakan);
        edtjumlahbel = (EditText) findViewById(R.id.jumlahbeli);
        edtharga = (EditText) findViewById(R.id.harga);
        edtnamamnm = (EditText) findViewById(R.id.namaminum);
        edtjumlahbelim = (EditText) findViewById(R.id.jumlahbelim);
        edthargam = (EditText) findViewById(R.id.hargam);

        btnbayar = (Button) findViewById(R.id.tombol1);
        btnselesai = (Button) findViewById(R.id.selesai);

        txtnamamkn = (TextView) findViewById(R.id.namamakan);
        txtjumlahbel = (TextView) findViewById(R.id.jumlahbeli);
        txtharga = (TextView) findViewById(R.id.harga);
        txtnamamnm = (TextView) findViewById(R.id.namaminum);
        txtjumlahbelim = (TextView) findViewById(R.id.jumlahbelim);
        txthargam = (TextView) findViewById(R.id.hargam);

        txttotalbelanja = (TextView) findViewById(R.id.totalbelanja);

        //memberikan action pada tombol proses

        btnbayar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String namamakan = edtnamamkn.getText().toString().trim();
                String namaminum = edtnamamnm.getText().toString().trim();
                String jumlahbeli = edtjumlahbel.getText().toString().trim();
                String jumlahbelim = edtjumlahbelim.getText().toString().trim();
                String harga = edtharga.getText().toString().trim();
                String hargam = edthargam.getText().toString().trim();

                double jb = Double.parseDouble(jumlahbeli);
                double h = Double.parseDouble(harga);
                double jbm = Double.parseDouble(jumlahbelim);
                double hm = Double.parseDouble(hargam);
                double total = ((jb * h) + (jbm * hm));
                txttotalbelanja.setText("Total : Rp " + total);

            }
        });


    }

    public void btnselesai(View view) {
        Intent intent = new Intent(Perhitungan.this, Terimakasih.class);
        startActivity(intent);
    }

}