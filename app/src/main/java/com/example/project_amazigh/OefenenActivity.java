package com.example.project_amazigh;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.util.Log;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class OefenenActivity extends AppCompatActivity {
    ViewPager2 viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oefenen);

        DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference(getIntent().getStringExtra("Categorie"));
        databaseReference.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                viewPager = findViewById(R.id.view_pager);
                viewPager.setAdapter(createCardAdapter(snapshot));
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
            }
        });
    }

    private ViewPagerAdapter createCardAdapter(DataSnapshot data) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(this, data);
        return adapter;
    }
}
