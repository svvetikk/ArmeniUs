package com.example.armenia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class churches extends AppCompatActivity implements View.OnClickListener {

    ImageView gotogarni, gotosevan, gotoxorvirap, gotomashtoc, gotogexard;
    Button gotoBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_churches);



        gotogarni = findViewById(R.id.garni);
        gotosevan = findViewById(R.id.sevanavanq);
        gotoxorvirap = findViewById(R.id.xorvirap);
        gotomashtoc = findViewById(R.id.mashtoc);
        gotogexard = findViewById(R.id.gexard);
        gotoBack = findViewById(R.id.back);

        gotogarni.setOnClickListener(this);
        gotosevan.setOnClickListener(this);
        gotoxorvirap.setOnClickListener(this);
        gotomashtoc.setOnClickListener(this);
        gotogexard.setOnClickListener(this);
        gotoBack.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        Intent intent;

        switch (view.getId()) {
            case R.id.garni:
                intent = new Intent(this, garniInfo.class);
                startActivity(intent);
                break;
            case R.id.sevanavanq:
                intent = new Intent(this, sevanInfo.class);
                startActivity(intent);
                break;
            case R.id.xorvirap:
                intent = new Intent(this, xorvirapInfo.class);
                startActivity(intent);
                break;
            case R.id.mashtoc:
                intent = new Intent(this, mashtocInfo.class);
                startActivity(intent);
                break;
            case R.id.gexard:
                intent = new Intent(this, gexardInfo.class);
                startActivity(intent);
                break;
            case R.id.back:
                intent = new Intent(this, Activity_2.class);
                startActivity(intent);
                break;
        }
    }
}




