package src.iphone.apps;

import java.util.ArrayList;
import java.util.List;

public class VisualVoiceMail {
    
    private List<String> messagesVoiceMail;

    public VisualVoiceMail(){
        this.messagesVoiceMail = new ArrayList<>();
    }

    public void addVoiceMailList(List<String> voiceMailList){
        this.messagesVoiceMail = voiceMailList;
    }

    public void getAllVoiceMails() {
        System.out.println("Message List: " + messagesVoiceMail);
    }

    public void startVoiceMail(String message) {
        System.out.println("Playing the " + message);
    }

    public void deleteVoiceMail(String message){
        messagesVoiceMail.remove(message);
        System.out.println(message + " deleted from VoiceMail");
    }
 

}
