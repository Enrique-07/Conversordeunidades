package com.example.conversordeunidades;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EdgeEffect;
import android.widget.EditText;
import android.widget.Toast;

public class KelCel extends AppCompatActivity {

    Button btnkc;
    EditText etkc, etkcres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kel_cel);
        btnkc = findViewById(R.id.btnkc);
        etkc = findViewById(R.id.etkc);
        etkcres = findViewById(R.id.etreskc);
        btnkc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double a = Double.parseDouble(etkc.getText().toString());
                    double res = a - 273.15;
                    String tot = res + " C";
                    etkcres.setText(tot);
                }
                catch(Exception e){
                    Toast.makeText(KelCel.this, "Error", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
