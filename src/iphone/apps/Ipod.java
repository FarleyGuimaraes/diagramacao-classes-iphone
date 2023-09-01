package src.iphone.apps;

import src.iphone.interfaces.MediaPlayer;
import src.iphone.interfaces.MultiMedia;
import src.iphone.model.Music;

public class Ipod implements MediaPlayer{

    private String multiMedia;

    @Override
    public void play(MultiMedia multiMedia) {
        
        if(multiMedia instanceof Music){
            this.multiMedia = "Music";
            System.out.printf("Playing the song \"%s\"\n", multiMedia);
        } else {
            this.multiMedia = "Video";
            System.out.printf("Playing the video \"%s\"\n", multiMedia);
        }
    
    }

    @Override
    public void pause() {
        System.out.println(multiMedia +" Paused.");
    }

    @Override
    public void selectMedia() {
        System.out.println(multiMedia + " Selected.");
    }

}
