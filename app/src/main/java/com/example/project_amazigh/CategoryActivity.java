package com.example.project_amazigh;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class CategoryActivity extends AppCompatActivity{
//    private Button btnOK;
    private RecyclerView recyclerView;
    CatAdapter  adapter;
    DatabaseReference mBase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
//        btnOK=(Button) findViewById(R.id.Imagebutton1);
//        btnOK.setOnClickListener(this);
//        btnOK=(Button) findViewById(R.id.Imagebutton2);
//        btnOK.setOnClickListener(this);
//        btnOK=(Button) findViewById(R.id.Imagebutton3);
//        btnOK.setOnClickListener(this);
//        btnOK=(Button) findViewById(R.id.Imagebutton4);
//        btnOK.setOnClickListener(this);
//        btnOK=(Button) findViewById(R.id.Imagebutton5);
//        btnOK.setOnClickListener(this);
//        btnOK=(Button) findViewById(R.id.Imagebutton6);
//        btnOK.setOnClickListener(this);
//        btnOK=(Button) findViewById(R.id.Imagebutton7);
//        btnOK.setOnClickListener(this);

        // Database verwijzing maken
        mBase = FirebaseDatabase.getInstance().getReference();

        recyclerView = findViewById(R.id.recycler1);

        // Om de lineare weergave te krijgen
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Hulpklasse om de adapter van de juiste data te voorzien
        FirebaseRecyclerOptions<Category> options
                = new FirebaseRecyclerOptions.Builder<Category>()
                .setQuery(mBase, Category.class)
                .build();

        // Het aanmaken van de datadapter
        adapter = new CatAdapter(options);

        // Connecting Adapter class with the Recycler view
        recyclerView.setAdapter(adapter);
    }

//    @Override
//    public void onClick(View v) {
//        Intent oefenen = new Intent(this, SpelenActivity.class);
//        Intent spelen = new Intent(this, OefenenActivity.class);
//
//        switch(v.getId()) {
//            case R.id.Imagebutton1:
//                if (getIntent().getStringExtra("type") == "oefenen") {
//                    oefenen.putExtra("test", "1");
//                    startActivity(oefenen);
//                } else {
//                    spelen.putExtra("test", "1");
//                    startActivity(spelen);
//                }
//                break;
//            case R.id.Imagebutton2:
//                if (getIntent().getStringExtra("type") == "oefenen") {
//                    oefenen.putExtra("test", "2");
//                    startActivity(oefenen);
//                } else {
//                    spelen.putExtra("test", "2");
//                    startActivity(spelen);
//                }
//                break;
//            case R.id.Imagebutton3:
//                if (getIntent().getStringExtra("type") == "oefenen") {
//                    oefenen.putExtra("test", "3");
//                    startActivity(oefenen);
//                } else {
//                    spelen.putExtra("test", "3");
//                    startActivity(spelen);
//                }
//                break;
//            case R.id.Imagebutton4:
//                if (getIntent().getStringExtra("type") == "oefenen") {
//                    oefenen.putExtra("test", "4");
//                    startActivity(oefenen);
//                } else {
//                    spelen.putExtra("test", "4");
//                    startActivity(spelen);
//                }
//                break;
//            case R.id.Imagebutton5:
//                if (getIntent().getStringExtra("type") == "oefenen") {
//                    oefenen.putExtra("test", "5");
//                    startActivity(oefenen);
//                } else {
//                    spelen.putExtra("test", "5");
//                    startActivity(spelen);
//                }
//                break;
//            case R.id.Imagebutton6:
//                if (getIntent().getStringExtra("type") == "oefenen") {
//                    oefenen.putExtra("test", "6");
//                    startActivity(oefenen);
//                } else {
//                    spelen.putExtra("test", "6");
//                    startActivity(spelen);
//                }
//                break;
//            case R.id.Imagebutton7:
//                if (getIntent().getStringExtra("type") == "oefenen") {
//                    oefenen.putExtra("test", "7");
//                    startActivity(oefenen);
//                } else {
//                    spelen.putExtra("test", "7");
//                    startActivity(spelen);
//                }
//                break;
//        }
//    }


        // Starten en stoppen van de adapter
        @Override protected void onStart()
        {
            super.onStart();
            adapter.startListening();
        }

        @Override protected void onStop()
        {
            super.onStop();
            adapter.stopListening();
        }

    }

