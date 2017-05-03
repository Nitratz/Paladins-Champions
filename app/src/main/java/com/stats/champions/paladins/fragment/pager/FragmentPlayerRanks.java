package com.stats.champions.paladins.fragment.pager;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.stats.champions.paladins.R;

public class FragmentPlayerRanks extends Fragment {

    public static FragmentPlayerRanks newInstance(String name) {
        Bundle args = new Bundle();

        args.putString("player_name", name);
        FragmentPlayerRanks fragment = new FragmentPlayerRanks();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_search_player, container, false);

        return v;
    }
}