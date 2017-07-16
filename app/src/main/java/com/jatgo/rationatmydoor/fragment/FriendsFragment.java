package com.jatgo.rationatmydoor.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jatgo.rationatmydoor.R;
import com.jatgo.rationatmydoor.adapter.AndroidImageAdapter;
import com.jatgo.rationatmydoor.adapter.FriendAdapter;
import com.jatgo.rationatmydoor.entities.FriendObject;

import java.util.ArrayList;
import java.util.List;

public class FriendsFragment extends Fragment {

    public FriendsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_friend, container, false);

        getActivity().setTitle("Settle All");
        RecyclerView songRecyclerView = (RecyclerView)view.findViewById(R.id.song_list);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        songRecyclerView.setLayoutManager(linearLayoutManager);
        songRecyclerView.setHasFixedSize(true);

        ViewPager mViewPager = (ViewPager)view.findViewById(R.id.viewPageAndroid);
        AndroidImageAdapter adapterView = new AndroidImageAdapter(this.getContext());
        mViewPager.setAdapter(adapterView);

        FriendAdapter mAdapter = new FriendAdapter(getActivity(), getTestData());
        songRecyclerView.setAdapter(mAdapter);
        return view;
    }

    public List<FriendObject> getTestData() {
        List<FriendObject> recentSongs = new ArrayList<FriendObject>();
        recentSongs.add(new FriendObject("Adele", "Someone Like You", ""));
        recentSongs.add(new FriendObject("Adele", "Someone Like You", ""));
        recentSongs.add(new FriendObject("Adele", "Someone Like You", ""));
        recentSongs.add(new FriendObject("Adele", "Someone Like You", ""));
        recentSongs.add(new FriendObject("Adele", "Someone Like You", ""));
        recentSongs.add(new FriendObject("Adele", "Someone Like You", ""));
        return recentSongs;
    }
}
