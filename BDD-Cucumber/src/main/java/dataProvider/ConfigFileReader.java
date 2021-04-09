package dataProvider;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {
	public Properties prop;

	 

    /**
     * This method is used to load the properties from config.properties file
     * @return it returns Properties prop object
     */
    public Properties init_prop() {

 

        prop = new Properties();
        try {
            FileInputStream ip = new FileInputStream("config\\config.properties");
            prop.load(ip);

 

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

 

        return prop;

 

    }
}
	
	