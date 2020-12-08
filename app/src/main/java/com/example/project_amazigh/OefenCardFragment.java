package com.example.project_amazigh;

import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
    @Override public void onViewCreated(@NonNull final View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        TextView tvAmazigh = view.findViewById(R.id.tv_amazigh);
        TextView tvNederlands = view.findViewById(R.id.tv_nederlands);
        final ImageView ivDier = view.findViewById(R.id.iv_dier);
        FirebaseStorage firebaseStorage = FirebaseStorage.getInstance();
        StorageReference storageReference;

        switch(counter) {
            case 0:
                storageReference = firebaseStorage.getReferenceFromUrl(data.child("1").child("plaatje").getValue().toString());
                storageReference.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                    @Override
                    public void onSuccess(Uri uri) {
                        Glide.with(view).load(uri.toString()).into(ivDier);
                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception exception) {
                    }
                });
                tvAmazigh.setText(data.child("1").child("Amazigh").getValue().toString());
                tvNederlands.setText(data.child("1").child("Nederlands").getValue().toString());
                break;
            case 1:
                storageReference = firebaseStorage.getReferenceFromUrl(data.child("2").child("plaatje").getValue().toString());
                storageReference.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                    @Override
                    public void onSuccess(Uri uri) {
                        Glide.with(view).load(uri.toString()).into(ivDier);
                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception exception) {
                    }
                });
                tvAmazigh.setText(data.child("2").child("Amazigh").getValue().toString());
                tvNederlands.setText(data.child("2").child("Nederlands").getValue().toString());
                break;
            case 2:
                storageReference = firebaseStorage.getReferenceFromUrl(data.child("3").child("plaatje").getValue().toString());
                storageReference.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                    @Override
                    public void onSuccess(Uri uri) {
                        Glide.with(view).load(uri.toString()).into(ivDier);
                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception exception) {
                    }
                });
                tvAmazigh.setText(data.child("3").child("Amazigh").getValue().toString());
                tvNederlands.setText(data.child("3").child("Nederlands").getValue().toString());
                break;
            case 3:
                storageReference = firebaseStorage.getReferenceFromUrl(data.child("4").child("plaatje").getValue().toString());
                storageReference.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                    @Override
                    public void onSuccess(Uri uri) {
                        Glide.with(view).load(uri.toString()).into(ivDier);
                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception exception) {
                    }
                });
                tvAmazigh.setText(data.child("4").child("Amazigh").getValue().toString());
                tvNederlands.setText(data.child("4").child("Nederlands").getValue().toString());
                break;
            case 4:
                storageReference = firebaseStorage.getReferenceFromUrl(data.child("5").child("plaatje").getValue().toString());
                storageReference.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                    @Override
                    public void onSuccess(Uri uri) {
                        Glide.with(view).load(uri.toString()).into(ivDier);
                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception exception) {
                    }
                });
                tvAmazigh.setText(data.child("5").child("Amazigh").getValue().toString());
                tvNederlands.setText(data.child("5").child("Nederlands").getValue().toString());
                break;
            case 5:
                storageReference = firebaseStorage.getReferenceFromUrl(data.child("6").child("plaatje").getValue().toString());
                storageReference.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                    @Override
                    public void onSuccess(Uri uri) {
                        Glide.with(view).load(uri.toString()).into(ivDier);
                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception exception) {
                    }
                });
                tvAmazigh.setText(data.child("6").child("Amazigh").getValue().toString());
                tvNederlands.setText(data.child("6").child("Nederlands").getValue().toString());
                break;
            case 6:
                storageReference = firebaseStorage.getReferenceFromUrl(data.child("7").child("plaatje").getValue().toString());
                storageReference.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                    @Override
                    public void onSuccess(Uri uri) {
                        Glide.with(view).load(uri.toString()).into(ivDier);
                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception exception) {
                    }
                });
                tvAmazigh.setText(data.child("7").child("Amazigh").getValue().toString());
                tvNederlands.setText(data.child("7").child("Nederlands").getValue().toString());
                break;
            case 7:
                storageReference = firebaseStorage.getReferenceFromUrl(data.child("8").child("plaatje").getValue().toString());
                storageReference.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                    @Override
                    public void onSuccess(Uri uri) {
                        Glide.with(view).load(uri.toString()).into(ivDier);
                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception exception) {
                    }
                });
                tvAmazigh.setText(data.child("8").child("Amazigh").getValue().toString());
                tvNederlands.setText(data.child("8").child("Nederlands").getValue().toString());
                break;
            case 8:
                storageReference = firebaseStorage.getReferenceFromUrl(data.child("9").child("plaatje").getValue().toString());
                storageReference.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                    @Override
                    public void onSuccess(Uri uri) {
                        Glide.with(view).load(uri.toString()).into(ivDier);
                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception exception) {
                    }
                });
                tvAmazigh.setText(data.child("9").child("Amazigh").getValue().toString());
                tvNederlands.setText(data.child("9").child("Nederlands").getValue().toString());
                break;
            case 9:
                storageReference = firebaseStorage.getReferenceFromUrl(data.child("10").child("plaatje").getValue().toString());
                storageReference.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                    @Override
                    public void onSuccess(Uri uri) {
                        Glide.with(view).load(uri.toString()).into(ivDier);
                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception exception) {
                    }
                });
                tvAmazigh.setText(data.child("10").child("Amazigh").getValue().toString());
                tvNederlands.setText(data.child("10").child("Nederlands").getValue().toString());
                break;
            case 10:
                storageReference = firebaseStorage.getReferenceFromUrl(data.child("11").child("plaatje").getValue().toString());
                storageReference.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                    @Override
                    public void onSuccess(Uri uri) {
                        Glide.with(view).load(uri.toString()).into(ivDier);
                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception exception) {
                    }
                });
                tvAmazigh.setText(data.child("11").child("Amazigh").getValue().toString());
                tvNederlands.setText(data.child("11").child("Nederlands").getValue().toString());
                break;
            case 11:
                storageReference = firebaseStorage.getReferenceFromUrl(data.child("12").child("plaatje").getValue().toString());
                storageReference.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                    @Override
                    public void onSuccess(Uri uri) {
                        Glide.with(view).load(uri.toString()).into(ivDier);
                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception exception) {
                    }
                });
                tvAmazigh.setText(data.child("12").child("Amazigh").getValue().toString());
                tvNederlands.setText(data.child("12").child("Nederlands").getValue().toString());
                break;
            case 12:
                storageReference = firebaseStorage.getReferenceFromUrl(data.child("13").child("plaatje").getValue().toString());
                storageReference.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                    @Override
                    public void onSuccess(Uri uri) {
                        Glide.with(view).load(uri.toString()).into(ivDier);
                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception exception) {
                    }
                });
                tvAmazigh.setText(data.child("13").child("Amazigh").getValue().toString());
                tvNederlands.setText(data.child("13").child("Nederlands").getValue().toString());
                break;
            case 13:
                storageReference = firebaseStorage.getReferenceFromUrl(data.child("14").child("plaatje").getValue().toString());
                storageReference.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                    @Override
                    public void onSuccess(Uri uri) {
                        Glide.with(view).load(uri.toString()).into(ivDier);
                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception exception) {
                    }
                });
                tvAmazigh.setText(data.child("14").child("Amazigh").getValue().toString());
                tvNederlands.setText(data.child("14").child("Nederlands").getValue().toString());
                break;
            case 14:
                storageReference = firebaseStorage.getReferenceFromUrl(data.child("15").child("plaatje").getValue().toString());
                storageReference.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                    @Override
                    public void onSuccess(Uri uri) {
                        Glide.with(view).load(uri.toString()).into(ivDier);
                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception exception) {
                    }
                });
                tvAmazigh.setText(data.child("15").child("Amazigh").getValue().toString());
                tvNederlands.setText(data.child("15").child("Nederlands").getValue().toString());
                break;
        }
    }
}

