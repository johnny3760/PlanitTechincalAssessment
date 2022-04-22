package com.planit.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    //#1-  created the properties object
    private static Properties properties = new Properties();

    static {
        //2-  get the path and pass it into FileInputStream, to open the file
        try {
            FileInputStream file = new FileInputStream("configuration.properties");
            //3-  load the opened file into properties object
            properties.load(file);

            file.close();

        } catch (IOException e) {
            System.out.println("Properties file not found");
        }


    }

    //4-  read from file

    public static String getProperty(String keyWord){
        return properties.getProperty(keyWord);
    }
    //5- close the file

}
