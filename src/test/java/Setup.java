import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Setup {
    AndroidDriver driver;

    @BeforeTest
    public AndroidDriver setup() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName","android");
        caps.setCapability("platformVersion","9");
        caps.setCapability("udid","2JN7N18C28001618");
        caps.setCapability("automationName","UiAutomator2");
        caps.setCapability("app","C://Users//Hp//Downloads//Calculator_8.4.1 (520193683)_Apkpure.apk");
        caps.setCapability("appPackage","com.google.android.calculator");

        URL url = new URL("http://127.0.0.1:4723/");
        driver = new AndroidDriver(url,caps);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        return driver;

    }

    @AfterTest
    public void closeApp(){
        driver.quit();
    }
}
