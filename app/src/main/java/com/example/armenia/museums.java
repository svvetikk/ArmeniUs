package com.example.armenia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class museums extends AppCompatActivity implements View.OnClickListener{

    Button gotohamo, gotokoxb, gotomher, gotoyexeg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_museums);

        gotohamo = findViewById(R.id.hamo);
        gotokoxb = findViewById(R.id.koxb);
        gotomher = findViewById(R.id.mher);
        gotoyexeg = findViewById(R.id.yexeg);



        gotohamo.setOnClickListener(this);
        gotokoxb.setOnClickListener(this);
        gotomher.setOnClickListener(this);
        gotoyexeg.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        Intent intent;

        switch (view.getId()) {
            case R.id.hamo:
                intent = new Intent(this, hamoInfo.class);
                startActivity(intent);
                break;
            case R.id.koxb:
                intent = new Intent(this, koxbInfo.class);
                startActivity(intent);
                break;
            case R.id.mher:
                intent = new Intent(this, mherInfo.class);
                startActivity(intent);
                break;
            case R.id.yexeg:
                intent = new Intent(this, yexegInfo.class);
                startActivity(intent);
                break;

        }
    }
}