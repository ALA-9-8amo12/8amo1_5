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



public class CardFragment extends Fragment {
    private static final String ARG_COUNT = "param1";
    //hiermee houd je bij hoeveel fragments je hebt
    private Integer counter;

    public CardFragment() {
        // Required empty public constructor
    }

    public static CardFragment newInstance(Integer counter) {
        CardFragment fragment = new CardFragment();
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
                Glide.with(this).load(R.mipmap.leeuw).into(ivDier);
                tvDier.setText("Domme ezel");
                break;
            case 1:
                Glide.with(this).load(R.mipmap.zebra).into(ivDier);
                tvDier.setText("Geitebreier");
                break;
            case 2:
                Glide.with(this).load(R.mipmap.konijn).into(ivDier);
                tvDier.setText("Vuile hond");
                break;
        }



    }
}