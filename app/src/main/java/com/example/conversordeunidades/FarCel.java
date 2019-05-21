package com.example.conversordeunidades;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FarCel extends AppCompatActivity {

    EditText fc,res;
    Button calc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_far_cel);
        calc = findViewById(R.id.btnresfc);
        fc = findViewById(R.id.etfc);
        res = findViewById(R.id.etresfc);
        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double a = Double.parseDouble(fc.getText().toString());
                    double tot = (a - 32) / 1.8;
                    String fin = tot + " C";
                    res.setText(fin);
                }
                catch(Exception e){
                    Toast.makeText(FarCel.this, "Error", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
