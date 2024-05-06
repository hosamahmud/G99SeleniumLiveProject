package commonUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Util {
    private static final String CREDENTIALS_FILE_PATH = "src/test/resources/credentials.properties";
    private static final Properties properties = new Properties();

    static {
        try {
            FileInputStream inputStream = new FileInputStream(CREDENTIALS_FILE_PATH);
            properties.load(inputStream);
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getUsername() {
        return properties.getProperty("username");
    }

    public static String getPassword() {
        return properties.getProperty("password");
    }
    public static String getInvalidUsername() {
        return properties.getProperty("invalidusername");
    }

    public static String getInvalidPassword() {
        return properties.getProperty("invalidpassword");
    }

    public static String getNewCustomerPassword() {
        return properties.getProperty("newCustomerPass");
    }
}

