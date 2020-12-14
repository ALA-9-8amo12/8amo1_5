package com.example.project_amazigh;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class OefenCardFragment extends Fragment {
    private static final String ARG_COUNT = "param1";
    private Integer counter;
    private static DataSnapshot data;

    public OefenCardFragment() {
        // Required empty public constructor
    }

    public static OefenCardFragment newInstance(Integer counter, DataSnapshot data) {
        OefenCardFragment.data = data;
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

    @Override
    public void onViewCreated(@NonNull final View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        TextView tvAmazigh = view.findViewById(R.id.tv_amazigh);
        TextView tvNederlands = view.findViewById(R.id.tv_nederlands);
        final MediaPlayer mediaPlayer = new MediaPlayer();
        final ImageView ivDier = view.findViewById(R.id.iv_dier);
        FirebaseStorage firebaseStorage = FirebaseStorage.getInstance();
        StorageReference storageReference;
        final Button geluid = view.findViewById(R.id.btn_geluid);


        switch(counter) {
            case 0:
                //load image
                storageReference = firebaseStorage.getReferenceFromUrl(data.child("1").child("plaatje").getValue().toString());
                load_image(storageReference, view, ivDier);

                // load audio
                storageReference = firebaseStorage.getReferenceFromUrl(data.child("1").child("geluid").getValue().toString());
                play_audio(storageReference, mediaPlayer, geluid);

                tvAmazigh.setText(data.child("1").child("Amazigh").getValue().toString());
                tvNederlands.setText(data.child("1").child("Nederlands").getValue().toString());
                break;
            case 1:
                // load image
                storageReference = firebaseStorage.getReferenceFromUrl(data.child("2").child("plaatje").getValue().toString());
                load_image(storageReference, view, ivDier);

                // load audio
                storageReference = firebaseStorage.getReferenceFromUrl(data.child("2").child("geluid").getValue().toString());
                play_audio(storageReference, mediaPlayer, geluid);

                tvAmazigh.setText(data.child("2").child("Amazigh").getValue().toString());
                tvNederlands.setText(data.child("2").child("Nederlands").getValue().toString());
                break;
            case 2:
                //load image
                storageReference = firebaseStorage.getReferenceFromUrl(data.child("3").child("plaatje").getValue().toString());
                load_image(storageReference, view, ivDier);

                // load audio
                storageReference = firebaseStorage.getReferenceFromUrl(data.child("3").child("geluid").getValue().toString());
                play_audio(storageReference, mediaPlayer, geluid);

                tvAmazigh.setText(data.child("3").child("Amazigh").getValue().toString());
                tvNederlands.setText(data.child("3").child("Nederlands").getValue().toString());
                break;
            case 3:
                //load image
                storageReference = firebaseStorage.getReferenceFromUrl(data.child("4").child("plaatje").getValue().toString());
                load_image(storageReference, view, ivDier);

                // load audio
                storageReference = firebaseStorage.getReferenceFromUrl(data.child("4").child("geluid").getValue().toString());
                play_audio(storageReference, mediaPlayer, geluid);

                tvAmazigh.setText(data.child("4").child("Amazigh").getValue().toString());
                tvNederlands.setText(data.child("4").child("Nederlands").getValue().toString());
                break;
            case 4:
                //load image
                storageReference = firebaseStorage.getReferenceFromUrl(data.child("5").child("plaatje").getValue().toString());
                load_image(storageReference, view, ivDier);

                // load audio
                storageReference = firebaseStorage.getReferenceFromUrl(data.child("5").child("geluid").getValue().toString());
                play_audio(storageReference, mediaPlayer, geluid);

                tvAmazigh.setText(data.child("5").child("Amazigh").getValue().toString());
                tvNederlands.setText(data.child("5").child("Nederlands").getValue().toString());
                break;
            case 5:
                //load image
                storageReference = firebaseStorage.getReferenceFromUrl(data.child("6").child("plaatje").getValue().toString());
                load_image(storageReference, view, ivDier);

                // load audio
                storageReference = firebaseStorage.getReferenceFromUrl(data.child("6").child("geluid").getValue().toString());
                play_audio(storageReference, mediaPlayer, geluid);

                tvAmazigh.setText(data.child("6").child("Amazigh").getValue().toString());
                tvNederlands.setText(data.child("6").child("Nederlands").getValue().toString());
                break;
            case 6:
                //load image
                storageReference = firebaseStorage.getReferenceFromUrl(data.child("7").child("plaatje").getValue().toString());
                load_image(storageReference, view, ivDier);

                // load audio
                storageReference = firebaseStorage.getReferenceFromUrl(data.child("7").child("geluid").getValue().toString());
                play_audio(storageReference, mediaPlayer, geluid);

                tvAmazigh.setText(data.child("7").child("Amazigh").getValue().toString());
                tvNederlands.setText(data.child("7").child("Nederlands").getValue().toString());
                break;
            case 7:
                //load image
                storageReference = firebaseStorage.getReferenceFromUrl(data.child("8").child("plaatje").getValue().toString());
                load_image(storageReference, view, ivDier);

                // load audio
                storageReference = firebaseStorage.getReferenceFromUrl(data.child("8").child("geluid").getValue().toString());
                play_audio(storageReference, mediaPlayer, geluid);

                tvAmazigh.setText(data.child("8").child("Amazigh").getValue().toString());
                tvNederlands.setText(data.child("8").child("Nederlands").getValue().toString());
                break;
            case 8:
                //load image
                storageReference = firebaseStorage.getReferenceFromUrl(data.child("9").child("plaatje").getValue().toString());
                load_image(storageReference, view, ivDier);

                // load audio
                storageReference = firebaseStorage.getReferenceFromUrl(data.child("9").child("geluid").getValue().toString());
                play_audio(storageReference, mediaPlayer, geluid);

                tvAmazigh.setText(data.child("9").child("Amazigh").getValue().toString());
                tvNederlands.setText(data.child("9").child("Nederlands").getValue().toString());
                break;
            case 9:
                //load image
                storageReference = firebaseStorage.getReferenceFromUrl(data.child("10").child("plaatje").getValue().toString());
                load_image(storageReference, view, ivDier);

                // load audio
                storageReference = firebaseStorage.getReferenceFromUrl(data.child("10").child("geluid").getValue().toString());
                play_audio(storageReference, mediaPlayer, geluid);

                tvAmazigh.setText(data.child("10").child("Amazigh").getValue().toString());
                tvNederlands.setText(data.child("10").child("Nederlands").getValue().toString());
                break;
            case 10:
                //load image
                storageReference = firebaseStorage.getReferenceFromUrl(data.child("11").child("plaatje").getValue().toString());
                load_image(storageReference, view, ivDier);

                // load audio
                storageReference = firebaseStorage.getReferenceFromUrl(data.child("11").child("geluid").getValue().toString());
                play_audio(storageReference, mediaPlayer, geluid);

                tvAmazigh.setText(data.child("11").child("Amazigh").getValue().toString());
                tvNederlands.setText(data.child("11").child("Nederlands").getValue().toString());
                break;
            case 11:
                //load image
                storageReference = firebaseStorage.getReferenceFromUrl(data.child("12").child("plaatje").getValue().toString());
                load_image(storageReference, view, ivDier);

                // load audio
                storageReference = firebaseStorage.getReferenceFromUrl(data.child("12").child("geluid").getValue().toString());
                play_audio(storageReference, mediaPlayer, geluid);

                tvAmazigh.setText(data.child("12").child("Amazigh").getValue().toString());
                tvNederlands.setText(data.child("12").child("Nederlands").getValue().toString());
                break;
            case 12:
                //load image
                storageReference = firebaseStorage.getReferenceFromUrl(data.child("13").child("plaatje").getValue().toString());
                load_image(storageReference, view, ivDier);

                // load audio
                storageReference = firebaseStorage.getReferenceFromUrl(data.child("13").child("geluid").getValue().toString());
                play_audio(storageReference, mediaPlayer, geluid);

                tvAmazigh.setText(data.child("13").child("Amazigh").getValue().toString());
                tvNederlands.setText(data.child("13").child("Nederlands").getValue().toString());
                break;
            case 13:
                //load image
                storageReference = firebaseStorage.getReferenceFromUrl(data.child("14").child("plaatje").getValue().toString());
                load_image(storageReference, view, ivDier);

                // load audio
                storageReference = firebaseStorage.getReferenceFromUrl(data.child("14").child("geluid").getValue().toString());
                play_audio(storageReference, mediaPlayer, geluid);

                tvAmazigh.setText(data.child("14").child("Amazigh").getValue().toString());
                tvNederlands.setText(data.child("14").child("Nederlands").getValue().toString());
                break;
            case 14:
                storageReference = firebaseStorage.getReferenceFromUrl(data.child("15").child("plaatje").getValue().toString());
                load_image(storageReference, view, ivDier);

                // load audio
                storageReference = firebaseStorage.getReferenceFromUrl(data.child("15").child("geluid").getValue().toString());
                play_audio(storageReference, mediaPlayer, geluid);

                tvAmazigh.setText(data.child("15").child("Amazigh").getValue().toString());
                tvNederlands.setText(data.child("15").child("Nederlands").getValue().toString());
                break;
        }
    }

    public void load_image(StorageReference storageReference, final View view, final ImageView image) {
        storageReference.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                Glide.with(view).load(uri.toString()).into(image);
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception exception) {
            }
        });
    }

    public void play_audio(StorageReference storageReference, final MediaPlayer mediaPlayer, final Button button) {
        storageReference.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(final Uri uri) {
                button.setOnClickListener(new View.OnClickListener() {
                    boolean check = true;
                    @Override
                    public void onClick(View v) {
                        try {
                            if(check) {
                                check = false;
                                mediaPlayer.setDataSource(uri.toString());
                                mediaPlayer.prepare();
                                mediaPlayer.start();
                                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        mediaPlayer.reset();
                                        check = true;
                                    }
                                });
                            }
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                });
            }
        });
    }
}




