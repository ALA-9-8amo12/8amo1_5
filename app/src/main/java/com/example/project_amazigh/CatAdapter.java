package com.example.project_amazigh;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;


public class CatAdapter extends FirebaseRecyclerAdapter<
        Category, CatAdapter.CatViewholder> {

    public CatAdapter(
            @NonNull FirebaseRecyclerOptions<Category> options)
    {
        super(options);
    }


    @Override
    protected void onBindViewHolder(@NonNull CatViewholder holder,
                                    int position, @NonNull Category model)
    {

        holder.Nederlands.setText(model.getNederlands());
//        holder.City.setText(model.getCity());
//        holder.Country.setText(model.getCountry());

\
//        Glide.with(holder.itemView.getContext())
//                .load(model.getUrl())
//                .into(holder.Image);
    }


    @NonNull
    @Override
    public CatViewholder onCreateViewHolder(@NonNull ViewGroup parent,
                                             int viewType)
    {
        View view
                = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.category, parent, false);
        return new CatAdapter.CatViewholder(view);
    }



    static class CatViewholder
            extends RecyclerView.ViewHolder {
        TextView Nederlands;
//        ImageView Image;
        public CatViewholder(@NonNull View itemView)
        {
            super(itemView);
            Nederlands = itemView.findViewById(R.id.tvNederlands);
//            Country = itemView.findViewById(R.id.tvCountry);
//            City = itemView.findViewById(R.id.tvCity);
//            Image = itemView.findViewById(R.id.ivImage);
        }
    }

}
