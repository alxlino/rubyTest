package tests;

import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class iOSTest {
 
	public static AppiumServer appiumServer;
	
	public static WebDriver driver;
	
	private String nomeDevice = "Iphone_inmstelo";
	private String plataformaVersao = "10.3.2";
	private String plataformaNome = "iOS";
    private String udID = "f2c33d7745857c30d2bbd841725dad921a5ae986";
	
	
  @BeforeTest
  public void setUp() throws MalformedURLException {
	  
	File appDir = new File("/Users/alexandrelino/Documents/POC_Meu_Alelo_IOS");
	File app = new File(appDir, "Hml Alelo.ipa");	
	
	DesiredCapabilities capabilities = new DesiredCapabilities();
	
	appiumServer.startServer();

	//Atribuindo as capabilities
	capabilities.setCapability("deviceName", nomeDevice);
	capabilities.setCapability("platformVersion", plataformaVersao);
	capabilities.setCapability("platformName", plataformaNome);
	capabilities.setCapability("udid", udID);
	capabilities.setCapability("app",app.getAbsolutePath());
	//capabilities.setCapability("bundleId", "com.ciandt.enterprise.alelo-meualelo-hml");
	  
	//driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	driver = new RemoteWebDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
	
  }	
	
  @Test
  public void iOSTeste() {
	  
	  System.out.println("teste de iOS...");
	  
  }
  

  
  @AfterTest
  public void endTest() {
	  
	  driver.close();
	  driver.quit();
	  appiumServer.stopServer();
	  
  }

}
