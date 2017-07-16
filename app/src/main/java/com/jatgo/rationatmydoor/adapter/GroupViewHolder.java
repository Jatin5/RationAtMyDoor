package com.jatgo.rationatmydoor.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.jatgo.rationatmydoor.R;

public class GroupViewHolder extends RecyclerView.ViewHolder{

    public TextView playlistTitle;
    public TextView playlistTracks;
    public ImageView playlistCover;

    public GroupViewHolder(View itemView) {
        super(itemView);

        playlistTitle = (TextView)itemView.findViewById(R.id.play_list_name);
        playlistTracks = (TextView)itemView.findViewById(R.id.number_of_tracks);
        playlistCover = (ImageView)itemView.findViewById(R.id.play_list_cover);
    }
}
