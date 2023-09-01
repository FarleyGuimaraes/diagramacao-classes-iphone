package src.iphone.model;

import src.iphone.interfaces.MultiMedia;

public class Video implements MultiMedia{
    
    private String title;

    public Video(String title){
        this.title = title;
    }

    @Override
    public String toString() {
        return String.format("%s", title);
    }

}
