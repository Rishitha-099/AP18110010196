package com.example.score;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView a;
    TextView b;
    Button c;
    Button d;
    Button e;
    Button f;
    Button g;
    Button h;
    Button reset;
    int m;
    int n;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c=findViewById(R.id.c);
        d=findViewById(R.id.d);
        e=findViewById(R.id.e);
        f=findViewById(R.id.f);
        g=findViewById(R.id.g);
        h=findViewById(R.id.h);
        reset=findViewById(R.id.RESET);

        a=findViewById(R.id.A_COUNT);
        b=findViewById(R.id.B_COUNT);
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m++;
                a.setText(""+m);
            }
        });

        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m+=2;
                a.setText(""+m);
            }
        });

        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m+=3;
                a.setText(""+m);
            }
        });
        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n++;
                b.setText(""+n);
            }
        });

        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n+=2;
                b.setText(""+n);
            }
        });

        h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n+=3;
                b.setText(""+n);
            }
        });
        reset.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                n=0;
                b.setText(""+n);
                m=0;
                a.setText(""+m);
            }
        });

    }
}





