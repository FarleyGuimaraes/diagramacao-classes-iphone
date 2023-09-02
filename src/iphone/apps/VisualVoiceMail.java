package src.iphone.apps;

import java.util.ArrayList;
import java.util.List;

import src.iphone.model.VoiceMailMessage;

public class VisualVoiceMail {
    
    private List<VoiceMailMessage> voiceMailMessageList;

    public VisualVoiceMail(){
        this.voiceMailMessageList = new ArrayList<>();
    }

    public void addVoiceMail(VoiceMailMessage voiceMailMessage){
        this.voiceMailMessageList.add(voiceMailMessage);
    }

    public void addVoiceMailList(List<VoiceMailMessage> voiceMailList){
        this.voiceMailMessageList.addAll(voiceMailList);
    }

    public void getAllVoiceMails() {
        System.out.println("List of voicemail messages: " + voiceMailMessageList);
    }

    public void startVoiceMail(VoiceMailMessage voiceMailMessage) {
        System.out.println("Listening to " + voiceMailMessage.getFrom() + "'s audio message");
    }

    public void deleteVoiceMail(VoiceMailMessage voiceMailMessage){
        this.voiceMailMessageList.remove(voiceMailMessage);
        System.out.println(voiceMailMessage + " deleted from VoiceMail");
    }
 

}
