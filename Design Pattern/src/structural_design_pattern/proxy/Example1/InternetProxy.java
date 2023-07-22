package structural_design_pattern.proxy.Example1;

import java.util.Arrays;
import java.util.List;

public class InternetProxy implements Internet{
    
    private RealInternet realInternet;
    private static final List<String> blockedWebsites = Arrays.asList("facebook.com", "twitter.com", "instagram.com");

    @Override
    public void connectTo(String website) {
        if (blockedWebsites.contains(website.toLowerCase())) {
            System.out.println("Access to " + website + " is blocked.");
        } else {
            if (realInternet == null) {
                realInternet = new RealInternet();
            }
            realInternet.connectTo(website);
        }
    }
    
}
