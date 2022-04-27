package Network;

import java.net.*;

public class URLInfo1 {
    public static void main(String[] args) {
        try {
            URL url = new URL(
                    "https://www.msn.com/en-in/health/nutrition/covid-19-govt-panel-recommends-corbevax-use-among-kids-aged-5-12-years/ar-AAWrKTu?li=AAggbRN");

            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Host Name: " + url.getHost());
            System.out.println("Port Number: " + url.getPort());
            System.out.println("Default Port Number: " + url.getDefaultPort());
            System.out.println("Query String: " + url.getQuery());
            System.out.println("Path: " + url.getPath());
            System.out.println("File: " + url.getFile());

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
