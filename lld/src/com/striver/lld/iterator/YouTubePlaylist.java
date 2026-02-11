package com.striver.lld.iterator;

import java.util.ArrayList;
import java.util.List;

public class YouTubePlaylist implements Playlist{

    private List<Video> videos = new ArrayList<>();

    // Method to add a video to the playlist
    public void addVideo(Video video) {
        videos.add(video);
    }

    // Instead of exposing the list, return an iterator
    @Override
    public PlaylistIterator createIterator() {
        return new YouTubePlaylistIterator(videos);
    }
}
