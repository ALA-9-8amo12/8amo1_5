package com.example.project_amazigh;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

public class OefenCardFragment extends Fragment {
    private static final String ARG_COUNT = "param1";
    private Integer counter;

    public OefenCardFragment() {
        // Required empty public constructor
    }
    public static OefenCardFragment newInstance(Integer counter) {
        OefenCardFragment fragment = new OefenCardFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_COUNT, counter);
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            counter = getArguments().getInt(ARG_COUNT);
        }
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.oefen_card, container, false);
    }
    @Override public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        TextView tvDier = view.findViewById(R.id.tv_dier);
        ImageView ivDier = view.findViewById(R.id.iv_dier);


        switch(counter) {
            case 0:
                Glide.with(this).load("https://i.ytimg.com/vi/9FHoYIw8Ljk/mqdefault.jpg").into(ivDier);
                tvDier.setText("Domme ezel");
                break;
            case 1:
                Glide.with(this).load("https://i.ytimg.com/vi/9FHoYIw8Ljk/mqdefault.jpg").into(ivDier);
                tvDier.setText("Geitebreier");
                break;
            case 2:
                Glide.with(this).load("https://i.ytimg.com/vi/9FHoYIw8Ljk/mqdefault.jpg").into(ivDier);
                tvDier.setText("Vuile hond");
                break;
            case 3:
                Glide.with(this).load("https://i.ytimg.com/vi/9FHoYIw8Ljk/mqdefault.jpg").into(ivDier);
                tvDier.setText("Kattekop");
                break;
            case 4:
                Glide.with(this).load("https://i.ytimg.com/vi/9FHoYIw8Ljk/mqdefault.jpg").into(ivDier);
                tvDier.setText("Kikkerbil");
                break;
        }
    }
}

