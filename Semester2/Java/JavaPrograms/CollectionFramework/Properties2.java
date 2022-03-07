package CollectionFramework;

import java.util.*;
import java.io.*;

public class Properties2 {
    public static void main(String[] args) throws Exception {

        Properties p = new Properties();
        p.setProperty("name", "Aniket Kumar");
        p.setProperty("email", "aniket.kumar@hotmail.com");

        p.store(new FileWriter("info.properties"), "Java Properties Example");

    }
}