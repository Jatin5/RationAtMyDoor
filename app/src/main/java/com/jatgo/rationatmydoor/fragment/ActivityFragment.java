package com.jatgo.rationatmydoor.fragment;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jatgo.rationatmydoor.R;

public class ActivityFragment extends Fragment {

    public ActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_activity, container, false);

        getActivity().setTitle("Settle All");
//        RecyclerView songRecyclerView = (RecyclerView)view.findViewById(R.id.song_list);
//        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
//        songRecyclerView.setLayoutManager(linearLayoutManager);
//        songRecyclerView.setHasFixedSize(true);

        return view;
    }
}