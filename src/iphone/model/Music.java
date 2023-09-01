package src.iphone.model;

import src.iphone.interfaces.MultiMedia;

public class Music implements MultiMedia{

    private String title;
    private String artist;

    public Music(String title, String artist){
        this.title = title;
        this.artist = artist;
    }

    @Override
    public String toString() {
        return String.format("%s - %s", title, artist);
    }

}
