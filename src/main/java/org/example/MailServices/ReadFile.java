package org.example.MailServices;

import java.io.*;

public class ReadFile {
    public static String get(String path){
        String sap=File.separator;
        String compPath="";
        //  for(String i:path.split("'\'");
        File file = new File(path);
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        String st;
        StringBuilder pass=new StringBuilder();
        try {
            while ((st = br.readLine()) != null)

                // Print the string
                pass.append(st);
        }catch (Exception e){
            System.out.println(e);
        }
        return pass.toString();

    }
}
