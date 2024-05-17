package pl.globallogic.exercises.ex49;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;


public class PlaylistInnerClass {

    private List<Song> playlist;

    public PlaylistInnerClass(){
        this.playlist = new LinkedList<>();
    }

    public void addSongToPlaylist(Song song){
        this.playlist.add(song);
    }

    public void addSongToPlaylist(Album album, String songTitle){
        Song song = album.findSong(songTitle);
        if(song != null)
            addSongToPlaylist(song);
        else
            System.out.println("Song "+songTitle+" not found in album");
    }

    public void addSongToPlaylist(Album album, int trackNumber){
        Song song = album.findSong(trackNumber);
        if(song != null)
            addSongToPlaylist(song);
        else
            System.out.println("Track number  "+trackNumber+" not found in album");
    }

    public void play(){
        ListIterator<Song> iterator = this.playlist.listIterator();
        if (this.playlist.isEmpty()){
            System.out.println("This playlist is empty");
        } else {
            System.out.println("Now playing "+ iterator.next().toString());
        }
    }

    public static void main(String[] args) {
        Album album = new Album("Stormbringer", "Deep Purple");
        album.addSong("Stormbringer", 4.6);
        album.addSong("Love don't mean a thing", 4.22);
        album.addSong("Holy man", 4.3);
        album.addSong("Hold on", 5.6);
        album.addSong("Lady double dealer", 3.21);
        album.addSong("You can't do it right", 6.23);
        album.addSong("High ball shooter", 4.27);
        album.addSong("The gypsy", 4.2);
        album.addSong("Soldier of fortune", 3.13);


        Album album2 = new Album("For those about to rock", "AC/DC");
        album2.addSong("For those about to rock", 5.44);
        album2.addSong("I put the finger on you", 3.25);
        album2.addSong("Lets go", 3.45);
        album2.addSong("Inject the venom", 3.33);
        album2.addSong("Snowballed", 4.51);
        album2.addSong("Evil walks", 3.45);
        album2.addSong("C.O.D.", 5.25);
        album2.addSong("Breaking the rules", 5.32);
        album2.addSong("Night of the long knives", 5.12);

        PlaylistInnerClass playList = new PlaylistInnerClass();
        playList.addSongToPlaylist(album, "Stormbringer");
        playList.addSongToPlaylist(album, "Holy man");
        playList.addSongToPlaylist(album, "Speed king"); // Does not exist
        playList.addSongToPlaylist(album, 9);

        playList.addSongToPlaylist(album2, 8);
        playList.addSongToPlaylist(album2, 3);
        playList.addSongToPlaylist(album2, 2);
        playList.addSongToPlaylist(album2, 24); // Does not exist

        playList.play();

    }
}
