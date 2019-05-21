package com.example.conversordeunidades;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CelKel extends AppCompatActivity {
    Button ckres;
    EditText ck, ckreset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cel_kel);

        ckres = findViewById(R.id.btnck);
        ck = findViewById(R.id.etck);
        ckreset = findViewById(R.id.etresck);

        ckres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double a = Double.parseDouble(ck.getText().toString());
                    double re = a + 275.15;
                    String tot = re + " K";
                    ckreset.setText(tot);
                }
                catch(Exception e){
                    Toast.makeText(CelKel.this, "Error", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
