package com.jatgo.rationatmydoor.entities;

public class FriendObject {

    private String songCover;
    private String songTitle;
    private String songAuthor;

    public FriendObject(String songTitle, String songAuthor, String songCover) {
        this.songCover = songCover;
        this.songAuthor = songAuthor;
        this.songTitle = songTitle;
    }

    public String getSongCover() {
        return songCover;
    }

    public String getSongAuthor() {
        return songAuthor;
    }

    public String getSongTitle() {
        return songTitle;
    }
}
