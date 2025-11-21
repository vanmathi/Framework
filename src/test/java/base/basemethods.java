package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class basemethods {

    private static ThreadLocal<WebDriver> wd=new ThreadLocal<WebDriver>();
    public WebDriver getDriver(){
        return wd.get();
    }
    public void setDriver(WebDriver driver) {
        wd.set(driver);
    }
    public void startApp(String url){
        WebDriverManager.chromedriver().setup();

        setDriver(new ChromeDriver());
        getDriver().get(url);

    }
    public void quit(){
        getDriver().quit();
    }
}
