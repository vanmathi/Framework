package Testrunner;

import base.basemethods;
import base.driverIssue;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class chatgptApp extends basemethods {
//public class chatgptApp extends driverIssue {

    @Test
    public void test1(){
      System.out.println("test1") ;
    }

    @Test(priority = 1)
    public void test2(){
        System.out.println("test2");
    }

    @Test(priority=2)
    public void openApp(){
         startApp("https://chatgpt.com/");
         System.out.println("url opened");
    }
    @AfterMethod
    public void tearDown() {
        quit(); // both threads calling quit() on shared driver
    }

}
