package com.jatgo.rationatmydoor.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jatgo.rationatmydoor.R;
import com.jatgo.rationatmydoor.entities.FriendObject;

import java.util.List;

public class FriendAdapter extends RecyclerView.Adapter<FriendViewHolder>{

    private Context context;
    private List<FriendObject> allSongs;

    public FriendAdapter(Context context, List<FriendObject> allSongs) {
        this.context = context;
        this.allSongs = allSongs;
    }

    @Override
    public FriendViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.song_list_layout, parent, false);
        return new FriendViewHolder(view);
    }

    @Override
    public void onBindViewHolder(FriendViewHolder holder, int position) {
        FriendObject songs = allSongs.get(position);
        holder.songTitle.setText(songs.getSongTitle());
        holder.songAuthor.setText(songs.getSongAuthor());
    }

    @Override
    public int getItemCount() {
        return allSongs.size();
    }

}
