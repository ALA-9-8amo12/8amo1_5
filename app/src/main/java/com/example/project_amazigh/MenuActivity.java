package com.example.project_amazigh;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MenuActivity extends AppCompatActivity
        implements View.OnClickListener {
    private Button btnOK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        btnOK=(Button) findViewById(R.id.buttonScore);
        btnOK.setOnClickListener(this);
        btnOK=(Button) findViewById(R.id.buttonOefenen);
        btnOK.setOnClickListener(this);
        btnOK=(Button) findViewById(R.id.buttonOver);
        btnOK.setOnClickListener(this);
        btnOK=(Button) findViewById(R.id.buttonSpelen);
        btnOK.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent score = new Intent(this, ScoreActivity.class);
        Intent over = new Intent(this, OverActivity.class);
        Intent oefenen = new Intent(this, SpelenActivity.class);
        Intent spelen = new Intent(this, OefenenActivity.class);

        switch(v.getId()) {
            case R.id.buttonOefenen:
                startActivity(oefenen);
                break;
            case R.id.buttonOver:
                startActivity(over);
                break;
            case R.id.buttonScore:
                startActivity(score);
                break;
            case R.id.buttonSpelen:
                startActivity(spelen);
                break;
        }
    }
}
