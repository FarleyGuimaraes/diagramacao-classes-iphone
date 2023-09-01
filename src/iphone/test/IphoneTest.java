package src.iphone.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import src.iphone.devices.Iphone;
import src.iphone.interfaces.MultiMedia;
import src.iphone.model.Contact;
import src.iphone.model.Music;
import src.iphone.model.Video;

public class IphoneTest {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        System.out.println("\n--------------- app IPOD ----------\n");
        MultiMedia music = new Music("House of the Rising Sun","The Animals");
        iphone.ipod().play(music);
        iphone.ipod().pause();
        iphone.ipod().selectMedia();
        
        System.out.println("");
        MultiMedia video = new Video("The Godfather");
        iphone.ipod().play(video);
        iphone.ipod().pause();
        iphone.ipod().selectMedia();

        
        System.out.println("\n--------------- app SAFARI ----------\n");
        iphone.safari().displayPage("www.google.com");
        iphone.safari().addNewTab();
        iphone.safari().refreshPage();


        System.out.println("\n--------------- app PHONE ----------\n");
        iphone.phone().call("11958654859");
        iphone.phone().answer();

        Contact contact = new Contact("John Wick", "11978787878");
        iphone.phone().call(contact);
        
        List<String> messageVoiceMailList = new ArrayList<>();
        Collections.addAll(messageVoiceMailList, "Message 1", "Message 2", "Message 3","Message 4","Message 5");
        iphone.phone().visualVoiceMail().addVoiceMailList(messageVoiceMailList);
        iphone.phone().visualVoiceMail().getAllVoiceMails();
        iphone.phone().visualVoiceMail().startVoiceMail("Message 2");
        iphone.phone().visualVoiceMail().deleteVoiceMail("Message 2");
        iphone.phone().visualVoiceMail().getAllVoiceMails();
        
        
        
    }
}
