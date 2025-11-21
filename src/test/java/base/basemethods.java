package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
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
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--headless=new");    // for Chrome v109+
        options.addArguments("--disable-gpu");
        options.addArguments("--window-size=1920,1080");
        setDriver(new ChromeDriver(options));
        getDriver().get(url);

    }
    public void quit(){
        getDriver().quit();
    }
}
