package src.iphone.apps;

import src.iphone.interfaces.MobilePhone;
import src.iphone.model.Contact;
import src.iphone.model.VoiceMailMessage;

public class Phone implements MobilePhone{

    private VisualVoiceMail visualVoiceMail;

    public Phone(){
        this.visualVoiceMail = new VisualVoiceMail();
    }

    
    @Override
    public void call(String phoneNumber) {
        System.out.println("Calling "+ phoneNumber);
    }
    
    @Override
    public void call(Contact contact) {
        System.out.println("Calling "+ contact.getName());
    }


    @Override
    public void answer() {
        System.out.println("Call answered");
        
    }

    public VisualVoiceMail visualVoiceMail() {
        return visualVoiceMail;
    }

    public void startVoiceMail(VoiceMailMessage voiceMailMessage){
        visualVoiceMail.startVoiceMail(voiceMailMessage);
    }

}
