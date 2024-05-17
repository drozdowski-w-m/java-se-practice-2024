package pl.globallogic.exercises.ex49;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Album {

    public static class SongList{
        private ArrayList<Song> songs;

        public SongList(){
            this.songs = new ArrayList<>();
        }

        private boolean add(Song song){
            if (songs.contains(song))
                return false;
            this.songs.add(song);
            return true;
        }

        private Song findSong(String title){
            for (Song checkedSong : this.songs){
                if (checkedSong.getTitle().equals(title))
                    return checkedSong;
            }
            return null;
        }

        private Song findSong(int trackNumber){
            int index = trackNumber - 1;
            if (index >= 0 && index < this.songs.size()){
                return this.songs.get(index);
            }
            return null;
        }
    }

    private String name, artist;
    //private ArrayList<Song> songs;
    private SongList songList;

    public Album(String name, String artist){
        this.name = name;
        this.artist = artist;
        this.songList = new SongList();
    }

    public Song findSong(String title){
        return this.songList.findSong(title);
    }
    public Song findSong(int trackNumber){
        return this.songList.findSong(trackNumber);
    }

    public boolean addSong(String title, double duration){
        if ( findSong(title) == null ){
            this.songList.add(new Song(title, duration));
            return true;
        } else {
            System.out.println("Song already on playlist");
            return false;
        }
    }
    public List<Song> getSongs(){
        return this.songList.songs;
    }

    public boolean addToPlaylist(int trackNumber, List<Song> playList){
        Song checkedSong = this.findSong(trackNumber);
        if (checkedSong != null){
            playList.add(checkedSong);
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlaylist(String title, List<Song> playList){
        Song checkedSong = findSong(title);
        if (checkedSong != null){
            playList.add(checkedSong);
            return true;
        }
        System.out.println("The song "+title+ " is not on this album");
        return false;
    }


}
