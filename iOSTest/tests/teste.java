package poc.ios.alelo;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;

public class test {
  
	private WebDriver driver;
	private String nomeAparelho = "Iphone_inmstelo";
	//private String nomeAparelho = "iPhone X";
	private String versao = "10.3.2";
	//private String versao = "11.0.1";
	private String nome = "iOS";
    private String udID = "f2c33d7745857c30d2bbd841725dad921a5ae986";
	//private String udID = "26F0DCD3-BEF8-4388-83EC-DECB1FCB6257";
	
  @BeforeMethod
  public void setUp() throws Exception {
	  
	  //File appDir = new File("/var/folders/47/t6zc48nx6zd74fg60mxzpsjc0000gn/T/2017920-33895-1agwec0.exka/Payload");
	 // File app = new File(appDir, "Hml Alelo.app");
	  
	  ///var/folders/47/t6zc48nx6zd74fg60mxzpsjc0000gn/T/2017920-33895-1agwec0.exka/Payload
	  //Hml Alelo.app
	  
	  //var/folders/47/t6zc48nx6zd74fg60mxzpsjc0000gn/T/2017920-33895-1agwec0.exka/Payload
	  //Hml Alelo.app
	  
	  //Users/alexandrelino/Downloads/iPhoneCoreDataRecipes/build/Release-iphonesimulator
	  //Recipes.app
	  
	  DesiredCapabilities capabilities = new DesiredCapabilities();
	 
	  //capabilities.setCapability("appiumVersion", "1.7.1");
	  capabilities.setCapability("deviceName", nomeAparelho);
	  capabilities.setCapability("platformVersion", versao);
	  capabilities.setCapability("platformName", nome);
	  capabilities.setCapability("udid", udID);
	  //capabilities.setCapability("bundleId", "net.whatsapp.WhatsApp");
	  capabilities.setCapability("app", "/Users/alexandrelino/Documents/POC_Meu_Alelo_IOS/Hml Alelo.ipa");
	  //capabilities.setCapability("app",app.getAbsolutePath());
	  //capabilities.setCapability("app", aplicativo.getAbsolutePath());
	  //capabilities.setCapability("autoLaunch", true);
	  
	  
	  //driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	  driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	  
  }	

	
  @Test
  public void testiOS() {
	  
	  System.out.println("teste de iOS...");
	  
  }
  

  @AfterMethod
  public void afterMethod() {
	  
	  driver.close();
	  driver.quit();
	  
  }

  

}
