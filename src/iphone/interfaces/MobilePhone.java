package src.iphone.interfaces;

import src.iphone.model.Contact;

public interface MobilePhone{
    
    public void call(String phoneNumber);
    
    public void call(Contact contact);
    
    public void answer();

}