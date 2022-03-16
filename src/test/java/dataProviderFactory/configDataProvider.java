package dataProviderFactory;
 
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
 
public class configDataProvider {
 
   Properties pro;
 
   public configDataProvider() throws FileNotFoundException, IOException {
       // Initializing the properties object so we can use property features
       pro = new Properties();
       pro.load(new FileInputStream(new File(System.getProperty("user.dir") + "/configs/config.properties")));
 
       // line 16 is basically like the following lines:
       /*
        * File srcf = new File("src/environment.properties"); FileInputStream srcIS =
        * new FileInputStream(srcf);
        *
        * pro.load(srcIS);
        */
 
   }
 
   public String getStagingURL() {
       // returns the StagingURL from the config.properties file
       return pro.getProperty("stagingURL");
   }
 
   public String getBrowser() {
       // returns the Browser from the config.properties file
       return pro.getProperty("browser");
   }
 
}
