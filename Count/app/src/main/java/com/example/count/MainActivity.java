package com.example.count;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView a;
    Button b;
    Button c;
    Button d;
    Button e;

    int f;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=findViewById(R.id.add);
        c=findViewById(R.id.sub);
        d=findViewById(R.id.reset);
        e=findViewById(R.id.toast);

        a=findViewById(R.id.textcount);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                f++;
                a.setText(""+f);
            }
        });

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                f--;
                a.setText(""+f);
            }
        });

        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                f=0;
                a.setText(""+f);
            }
        });
        if(savedInstanceState!=null) {
            String g = savedInstanceState.getString("rishitha");
            a.setText(g);
        }

    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("rishitha",a.getText().toString());
    }

    public void display(View view) {
        Toast.makeText(this, "Your count is:"+f, Toast.LENGTH_SHORT).show();
    }
}
