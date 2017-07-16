package com.jatgo.rationatmydoor.adapter;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jatgo.rationatmydoor.R;
import com.jatgo.rationatmydoor.entities.GroupObject;

import java.util.List;

public class GroupAdapter extends RecyclerView.Adapter<GroupViewHolder>{

    private static final String TAG = GroupAdapter.class.getSimpleName();

    private Context context;
    private List<GroupObject> playlists;

    public GroupAdapter(Context context, List<GroupObject> playlists) {
        this.context = context;
        this.playlists = playlists;
    }

    @Override
    public GroupViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.play_list_layout, parent, false);
        return new GroupViewHolder(view);
    }

    @Override
    public void onBindViewHolder(GroupViewHolder holder, int position) {
        GroupObject groupObject = playlists.get(position);
        holder.playlistTitle.setText(groupObject.getPlaylistTitle());
        holder.playlistTracks.setText(groupObject.getPlaylistTracks());

    }

    @Override
    public int getItemCount() {
        return playlists.size();
    }
}
