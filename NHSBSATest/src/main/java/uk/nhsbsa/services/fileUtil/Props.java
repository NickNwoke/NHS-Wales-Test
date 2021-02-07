package uk.nhsbsa.services.fileUtil;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Props {

    public static String getValue(String keyName) {
        String settingFilePath = "/src/main/resources/objectRepository.properties";
        String filePath = System.getProperty("user.dir") + settingFilePath;
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(filePath);
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
        Properties properties = new Properties();
        try {
            properties.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties.getProperty(keyName);
    }
}
