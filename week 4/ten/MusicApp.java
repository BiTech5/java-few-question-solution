/*
10. Music Player App

Instructions:

    Class Song: fields title, artist, and method play()
    Subclasses: PopSong, RockSong, JazzSong override play() with unique print messages
    Demonstrate polymorphic behavior using a playlist of Song[]
    File: MusicApp.java.

 */
class Song{
    String title;
    String artist;
    public Song(String title,String artist){
        this.title=title;
        this.artist=artist;
    }
    public void play(){
        System.out.println("Playing song: " + title + " by " + artist);
    }
}
class PopSong extends Song {
    public PopSong(String title, String artist) {
        super(title, artist);
    }

    @Override
    public void play() {
        System.out.println("Pop song Playing: '" + title + "' by " + artist);
    }
}

class RockSong extends Song {
    public RockSong(String title, String artist) {
        super(title, artist);
    }

    @Override
    public void play() {
        System.out.println("Rock song Playing: '" + title + "' by " + artist);
    }
}

class JazzSong extends Song {
    public JazzSong(String title, String artist) {
        super(title, artist);
    }

    @Override
    public void play() {
        System.out.println("Jazz Song Playing: '" + title + "' by " + artist);
    }
}


public class MusicApp {
    public static void main(String[] args) {
        Song[] playlist = new Song[3];
        playlist[0] = new PopSong("Maaya", "Purna");
        playlist[1] = new RockSong("Wolf Fang", "The Huu");
        playlist[2] = new JazzSong("Haraye", "Elements");
        System.out.println("Now Playing Playlist:");
        for (Song song : playlist) {
            song.play();
        }
    }
}