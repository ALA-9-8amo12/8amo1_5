package com.example.project_amazigh;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.google.firebase.database.DataSnapshot;

public class ViewPagerAdapter extends FragmentStateAdapter {
    private static final int CARD_ITEM_SIZE = 15;
    private DataSnapshot data;

    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity, DataSnapshot data) {
        super(fragmentActivity);
        this.data = data;
    }

    @NonNull @Override public Fragment createFragment(int position) {
        return OefenCardFragment.newInstance(position, data);
    }

    @Override public int getItemCount() {
        return CARD_ITEM_SIZE;
    }
}
