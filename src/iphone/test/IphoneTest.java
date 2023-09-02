package src.iphone.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import src.iphone.devices.Iphone;
import src.iphone.interfaces.MultiMedia;
import src.iphone.model.AudioMessage;
import src.iphone.model.Contact;
import src.iphone.model.Music;
import src.iphone.model.Video;
import src.iphone.model.VoiceMailMessage;

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
        iphone.safari().showPage("www.google.com");
        iphone.safari().addNewTab();
        iphone.safari().refreshPage();


        System.out.println("\n--------------- app PHONE ----------\n");
        iphone.phone().call("11958654859");
        iphone.phone().answer();

        Contact contact = new Contact("John Wick", "11978787878");
        iphone.phone().call(contact);
        
        
        
        VoiceMailMessage voiceMailMessage = new VoiceMailMessage("Ana", new AudioMessage("Message from Ana"));
        iphone.phone().visualVoiceMail().addVoiceMail(voiceMailMessage);
        iphone.phone().startVoiceMail(voiceMailMessage);
        iphone.phone().visualVoiceMail().getAllVoiceMails();

        System.out.println("");
        List<VoiceMailMessage> voiceMailMessagesList = new ArrayList<>();
        Collections.addAll(voiceMailMessagesList, 
            new VoiceMailMessage("Pedro", new AudioMessage("Message from Pedro")),
            new VoiceMailMessage("Richard", new AudioMessage("Message from Richard")),
            new VoiceMailMessage("Lucas", new AudioMessage("Message from Lucas")),
            new VoiceMailMessage("Jacó", new AudioMessage("Message from Jacó")),
            new VoiceMailMessage("Thiago", new AudioMessage("Message from Thiago")),
            new VoiceMailMessage("Neymar", new AudioMessage("Message from Neymar"))
        );
        iphone.phone().visualVoiceMail().addVoiceMailList(voiceMailMessagesList);
        iphone.phone().visualVoiceMail().getAllVoiceMails();
        
        System.out.println("");
        VoiceMailMessage voiceMailMsg = new VoiceMailMessage("Jacó", new AudioMessage("Message from Jacó"));
        iphone.phone().visualVoiceMail().deleteVoiceMail(voiceMailMsg);
        iphone.phone().visualVoiceMail().getAllVoiceMails();
        
        
        
    }
}
