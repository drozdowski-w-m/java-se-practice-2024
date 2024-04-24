package pl.globallogic.exercises.ex45;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name, artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist){
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    public Song findSong(String title){
        for (Song song : songs){
            if ( song.getTitle().equals(title) )
                return song;
        }
        return null;
    }

    public boolean addSong(String title, double duration){
        if ( findSong(title) == null ){
            songs.add(new Song(title, duration));
            return true;
        } else {
            System.out.println("Song already on playlist");
            return false;
        }
    }

    public boolean addToPlaylist(int trackNumber, LinkedList<Song> playList){
        if ( trackNumber > 0 && trackNumber <= songs.size() ){
            playList.add(songs.get(trackNumber-1));
            return true;
        }
        return false;
    }

    public boolean addToPlaylist(String title, LinkedList<Song> playList){
        Song song = findSong(title);
        if (song != null){
            playList.add(song);
            return true;
        }
        return false;
    }


}
