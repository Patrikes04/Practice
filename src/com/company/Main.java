package com.company;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // write your code here
        System.setProperty("webdriver.chrome.driver", "C:\\chromeDriver\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.qaclickacademy.com/practice.php");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        System.out.println(new java.util.Date() + " Starting Radio Button Example");
        RadioButtonExample.exe(wait);
        Printer.Success();
        System.out.println(new java.util.Date() + " Starting Suggestion Class Example");
        SugesstionClassExample.exe(driver,wait);
        Printer.Success();
        System.out.println(new java.util.Date() + " Starting Dropdown Example");
        DropdownExample.exe(driver);
        Printer.Success();
        System.out.println(new java.util.Date() + " Starting Checkbox Example");
        CheckboxExample.exe(driver);
        Printer.Success();
        System.out.println(new java.util.Date() + " Starting Switch Window Example");
        SwitchWindowExample.exe(driver, wait);
        System.out.println(new java.util.Date() + " Starting Switch Tab Example");
        SwitchTabExample.exe(driver, wait);
        System.out.println(new java.util.Date() + " Starting Switch to Alert Example");
        SwitchToAlertExample.exe(driver, wait);
        Printer.Success();
        System.out.println(new java.util.Date() + " Starting Web Table Example");
        WebTableExample.exe(driver, wait, 20);
        Printer.Success();
        System.out.println(new java.util.Date() + " Starting Element Displayed Example");
        ElementDisplayedExample.exe(driver,wait);
        Printer.Success();
        System.out.println(new java.util.Date() + " Starting Mouse Hover Example");
        MouseHoverExample.exe(driver,wait);
        Printer.Success();
        System.out.println(new java.util.Date() + " Starting iFrame Example");
        iFrameExample.exe(driver,wait);
        Printer.Success();
        driver.quit();
    }
}
