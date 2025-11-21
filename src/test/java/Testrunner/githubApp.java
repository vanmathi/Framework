package Testrunner;
import base.basemethods;
import base.driverIssue;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class githubApp extends basemethods{
//public class githubApp extends driverIssue {
    @Test
    public void openApp(){
        startApp("https://github.com/");
    }

    @AfterMethod
    public void flush()
    {
        quit();
    }
}
