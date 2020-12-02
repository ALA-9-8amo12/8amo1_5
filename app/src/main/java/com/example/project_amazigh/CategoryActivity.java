package com.example.project_amazigh;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


Imageview = imageview;

public class CategoryActivity extends AppCompatActivity
        implements View.OnClickListener {
//    public String imageurl;
    private Button btnOK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        btnOK=(Button) findViewById(R.id.Imagebutton1);
        btnOK.setOnClickListener(this);
        btnOK=(Button) findViewById(R.id.Imagebutton2);
        btnOK.setOnClickListener(this);
        btnOK=(Button) findViewById(R.id.Imagebutton3);
        btnOK.setOnClickListener(this);
        btnOK=(Button) findViewById(R.id.Imagebutton4);
        btnOK.setOnClickListener(this);
        btnOK=(Button) findViewById(R.id.Imagebutton5);
        btnOK.setOnClickListener(this);
        btnOK=(Button) findViewById(R.id.Imagebutton6);
        btnOK.setOnClickListener(this);
        btnOK=(Button) findViewById(R.id.Imagebutton7);
        btnOK.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent oefenen = new Intent(this, SpelenActivity.class);
        Intent spelen = new Intent(this, OefenenActivity.class);

        switch(v.getId()) {
            case R.id.Imagebutton1:
                if (getIntent().getStringExtra("type") == "oefenen") {
                    oefenen.putExtra("test", "1");
                    startActivity(oefenen);
                } else {
                    spelen.putExtra("test", "1");
                    startActivity(spelen);
                }
                break;
            case R.id.Imagebutton2:
                if (getIntent().getStringExtra("type") == "oefenen") {
                    oefenen.putExtra("test", "2");
                    startActivity(oefenen);
                } else {
                    spelen.putExtra("test", "2");
                    startActivity(spelen);
                }
                break;
            case R.id.Imagebutton3:
                if (getIntent().getStringExtra("type") == "oefenen") {
                    oefenen.putExtra("test", "3");
                    startActivity(oefenen);
                } else {
                    spelen.putExtra("test", "3");
                    startActivity(spelen);
                }
                break;
            case R.id.Imagebutton4:
                if (getIntent().getStringExtra("type") == "oefenen") {
                    oefenen.putExtra("test", "4");
                    startActivity(oefenen);
                } else {
                    spelen.putExtra("test", "4");
                    startActivity(spelen);
                }
                break;
            case R.id.Imagebutton5:
                if (getIntent().getStringExtra("type") == "oefenen") {
                    oefenen.putExtra("test", "5");
                    startActivity(oefenen);
                } else {
                    spelen.putExtra("test", "5");
                    startActivity(spelen);
                }
                break;
            case R.id.Imagebutton6:
                if (getIntent().getStringExtra("type") == "oefenen") {
                    oefenen.putExtra("test", "6");
                    startActivity(oefenen);
                } else {
                    spelen.putExtra("test", "6");
                    startActivity(spelen);
                }
                break;
            case R.id.Imagebutton7:
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
