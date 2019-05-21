package com.example.conversordeunidades;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.celfar);
        btn2 = findViewById(R.id.farcel);
        btn3 = findViewById(R.id.celkel);
        btn4 = findViewById(R.id.kelcel);
        btn5 = findViewById(R.id.metcen);
        btn6 = findViewById(R.id.cenmet);
        btn7 = findViewById(R.id.cenpul);
        btn8 = findViewById(R.id.pulcen);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), CelsiusFahren.class);
                startActivityForResult(intent, 0);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), FarCel.class);
                startActivityForResult(intent, 0);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), CelKel.class);
                startActivityForResult(intent, 0);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), KelCel.class);
                startActivityForResult(intent, 0);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), MetCen.class);
                startActivityForResult(intent, 0);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), CenMet.class);
                startActivityForResult(intent, 0);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), CenPul.class);
                startActivityForResult(intent, 0);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), PulCen.class);
                startActivityForResult(intent, 0);
            }
        });


    }
}
