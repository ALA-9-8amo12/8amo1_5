package com.example.project_amazigh;

import androidx.appcompat.app.AppCompatActivity;
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

public class SpelenActivity extends Fragment {
    private static final String ARG_COUNT = "param1";
    //hiermee houd je bij hoeveel fragments je hebt
    private Integer counter;
//    private int[] COLOR_MAP = {
//            R.color.red_100, R.color.red_300, R.color.red_500, R.color.red_700, R.color.blue_100,
//            R.color.blue_300, R.color.blue_500, R.color.blue_700, R.color.green_100, R.color.green_300,
//            R.color.green_500, R.color.green_700
//    };
    public SpelenActivity() {
        // Required empty public constructor
    }
    public static SpelenActivity newInstance(Integer counter) {
        SpelenActivity fragment = new SpelenActivity();
        Bundle args = new Bundle();
        args.putInt(ARG_COUNT, counter);
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            //counter wordt opgehaald
            counter = getArguments().getInt(ARG_COUNT);
        }
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_card, container, false);
    }
    @Override public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
//        view.setBackgroundColor(ContextCompat.getColor(getContext(), COLOR_MAP[counter]));

        // variables toegevoegd voor de layout
        TextView tvDier = view.findViewById(R.id.tv_dier);
        ImageView ivDier = view.findViewById(R.id.iv_dier);


        switch(counter) {
            case 0:
                Glide.with(this).load(R.mipmap.dieren01_ezel).into(ivDier);
                tvDier.setText("Domme ezel");
                break;
            case 1:
                Glide.with(this).load(R.mipmap.dieren01_geit).into(ivDier);
                tvDier.setText("Geitebreier");
                break;
            case 2:
                Glide.with(this).load(R.mipmap.dieren01_hond).into(ivDier);
                tvDier.setText("Vuile hond");
                break;
            case 3:
                Glide.with(this).load(R.mipmap.dieren01_kat).into(ivDier);
                tvDier.setText("Kattekop");
                break;
            case 4:
                Glide.with(this).load(R.mipmap.dieren01_kikker).into(ivDier);
                tvDier.setText("Kikkerbil");
                break;
        }



    }
}