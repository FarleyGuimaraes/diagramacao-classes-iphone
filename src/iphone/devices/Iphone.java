package src.iphone.devices;

import src.iphone.apps.Ipod;
import src.iphone.apps.Phone;
import src.iphone.apps.Safari;

public class Iphone{
    
    private Phone phone;
    private Safari safari;
    private Ipod ipod;

    public Iphone(){
        this.phone = new Phone();
        this.safari = new Safari();
        this.ipod = new Ipod();
    }

    public Phone phone() {
        return phone;
    }

    public Safari safari() {
        return safari;
    }

    public Ipod ipod() {
        return ipod;
    }
    
    
   
}