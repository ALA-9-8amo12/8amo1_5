package com.example.project_amazigh;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class CategoryActivity extends AppCompatActivity
        implements View.OnClickListener {
    private Button btnOK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        btnOK=(Button) findViewById(R.id.button);
        btnOK.setOnClickListener(this);
        btnOK=(Button) findViewById(R.id.button2);
        btnOK.setOnClickListener(this);
        btnOK=(Button) findViewById(R.id.button3);
        btnOK.setOnClickListener(this);
        btnOK=(Button) findViewById(R.id.button4);
        btnOK.setOnClickListener(this);
        btnOK=(Button) findViewById(R.id.button5);
        btnOK.setOnClickListener(this);
        btnOK=(Button) findViewById(R.id.button6);
        btnOK.setOnClickListener(this);
        btnOK=(Button) findViewById(R.id.button7);
        btnOK.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent oefenen = new Intent(this, SpelenActivity.class);
        Intent spelen = new Intent(this, OefenenActivity.class);

        switch(v.getId()) {
            case R.id.button:
                if (getIntent().getStringExtra("type") == "oefenen") {
                    oefenen.putExtra("test", "1");
                    startActivity(oefenen);
                } else {
                    spelen.putExtra("test", "1");
                    startActivity(spelen);
                }
                break;
            case R.id.button2:
                if (getIntent().getStringExtra("type") == "oefenen") {
                    oefenen.putExtra("test", "2");
                    startActivity(oefenen);
                } else {
                    spelen.putExtra("test", "2");
                    startActivity(spelen);
                }
                break;
            case R.id.button3:
                if (getIntent().getStringExtra("type") == "oefenen") {
                    oefenen.putExtra("test", "3");
                    startActivity(oefenen);
                } else {
                    spelen.putExtra("test", "3");
                    startActivity(spelen);
                }
                break;
            case R.id.button4:
                if (getIntent().getStringExtra("type") == "oefenen") {
                    oefenen.putExtra("test", "4");
                    startActivity(oefenen);
                } else {
                    spelen.putExtra("test", "4");
                    startActivity(spelen);
                }
                break;
            case R.id.button5:
                if (getIntent().getStringExtra("type") == "oefenen") {
                    oefenen.putExtra("test", "5");
                    startActivity(oefenen);
                } else {
                    spelen.putExtra("test", "5");
                    startActivity(spelen);
                }
                break;
            case R.id.button6:
                if (getIntent().getStringExtra("type") == "oefenen") {
                    oefenen.putExtra("test", "6");
                    startActivity(oefenen);
                } else {
                    spelen.putExtra("test", "6");
                    startActivity(spelen);
                }
                break;
            case R.id.button7:
                if (getIntent().getStringExtra("type") == "oefenen") {
                    oefenen.putExtra("test", "7");
                    startActivity(oefenen);
                } else {
                    spelen.putExtra("test", "7");
                    startActivity(spelen);
                }
                break;
        }
    }
}
