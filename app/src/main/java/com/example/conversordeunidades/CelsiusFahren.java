package com.example.conversordeunidades;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CelsiusFahren extends AppCompatActivity {
    EditText etcf;
    EditText fin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_celsius_fahren);
        Button res = findViewById(R.id.res);
        etcf = findViewById(R.id.etcf);
        fin = findViewById(R.id.cfres);
        res.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double a = Double.parseDouble(etcf.getText().toString());
                    double res = (a * 1.8) + 32;
                    String tot = res + " F";
                    fin.setText(tot);
                }
                catch(Exception e){
                    Toast.makeText(CelsiusFahren.this, "Error", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
