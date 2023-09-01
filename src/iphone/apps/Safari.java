package src.iphone.apps;

import src.iphone.interfaces.WebBrowser;

public class Safari implements WebBrowser{

    
    @Override
    public void displayPage(String website) {
        System.out.println("Displaying website " + website);
    }
    
    @Override
    public void addNewTab() {
        System.out.println("New tab added.");
    }
    

    @Override
    public void refreshPage() {
        System.out.println("Page updated.");
        
    }
 
}
