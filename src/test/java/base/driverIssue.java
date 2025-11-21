package base;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class driverIssue {
//If user use this class they will face multi thread issue so i have used threadlocal in basemethods class and resolved this issue

    public ChromeDriver driver;

    public void startApp(String url){
        driver=new ChromeDriver();
        driver.get(url);
    }

    @AfterMethod
    public void quit() {
        driver.quit();
    }
}
