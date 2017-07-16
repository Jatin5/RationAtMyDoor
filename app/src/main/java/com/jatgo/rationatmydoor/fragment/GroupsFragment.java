package com.jatgo.rationatmydoor.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jatgo.rationatmydoor.R;
import com.jatgo.rationatmydoor.adapter.GroupAdapter;
import com.jatgo.rationatmydoor.entities.GroupObject;

import java.util.ArrayList;
import java.util.List;

public class GroupsFragment extends Fragment {


    public GroupsFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_playlist, container, false);
        getActivity().setTitle("Settle All");
        RecyclerView playlisRecyclerView = (RecyclerView)view.findViewById(R.id.your_play_list);
        GridLayoutManager gridLayout = new GridLayoutManager(getActivity(), 2);
        playlisRecyclerView.setLayoutManager(gridLayout);
        playlisRecyclerView.setHasFixedSize(true);

        GroupAdapter mAdapter = new GroupAdapter(getActivity(), getTestData());
        playlisRecyclerView.setAdapter(mAdapter);

        return view;
    }

    public List<GroupObject> getTestData() {
        List<GroupObject> trackList = new ArrayList<GroupObject>();
        trackList.add(new GroupObject("Falling over", "12 tracks", ""));
        trackList.add(new GroupObject("Falling over", "12 tracks", ""));
        trackList.add(new GroupObject("Falling over", "12 tracks", ""));
        trackList.add(new GroupObject("Falling over", "12 tracks", ""));
        trackList.add(new GroupObject("Falling over", "12 tracks", ""));
        trackList.add(new GroupObject("Falling over", "12 tracks", ""));
        trackList.add(new GroupObject("Falling over", "12 tracks", ""));
        trackList.add(new GroupObject("Falling over", "12 tracks", ""));
        return trackList;
    }
}
