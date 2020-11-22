package com.example.project_amazigh;


import android.content.Intent;
import android.os.Bundle;

public class Splashscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent =  new Intent(this, Splashscreen.class);
        startActivity(Intent);
        finish(Intent);
    }
}
