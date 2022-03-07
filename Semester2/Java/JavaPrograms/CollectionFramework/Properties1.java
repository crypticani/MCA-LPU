package CollectionFramework;

import java.util.*;
import java.io.*;

public class Properties1 {
    public static void main(String[] args) throws Exception {
        FileReader reader = new FileReader("db.properties");

        Properties p = new Properties();
        p.load(reader);

        System.out.println(p.getProperty("user"));
        System.out.println(p.getProperty("password"));
    }
}
