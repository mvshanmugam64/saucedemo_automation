package Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileReader {
	
	private static Properties properties = new Properties();

    static {
        try {
            FileInputStream fis = new FileInputStream("Properties/config.properties");
            properties.load(fis);
        } catch (IOException e) {
            throw new RuntimeException("Failed to load config.properties file", e);
        }
    }

    public static String get(String key) {
        return properties.getProperty(key);
    }

}
