package com.ismail.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText a, t;
    private TextView hasil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        a = (EditText) findViewById(R.id.txt_alas);
        t= (EditText) findViewById(R.id.txt_tinggi);

        hasil = (TextView)findViewById(R.id.txt_hasil);
        findViewById(R.id.button).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String isialas = a.getText().toString();
        String isitinggi = t.getText().toString();
        double a = Double.parseDouble(isialas);
        double t = Double.parseDouble(isitinggi);
        double luas = (a*t)/2;
        String output = String.valueOf(luas);
        hasil.setText("Luas = " + output.toString());
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
