package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;

public class SwitchWindowExample {
    public static void exe(WebDriver driver, WebDriverWait wait){
        driver.findElement(By.id("openwindow")).click();
        ArrayList<String> tabs= new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='navbar navbar-default navbar-static-top']//a[@href='courses-description.php']"))).click();
        if(!driver.getCurrentUrl().equals("http://www.qaclickacademy.com/courses-description.php")){
            System.out.println("Current URL is not valid");
        }else{
            Printer.Success();
        }
        driver.close();
        driver.switchTo().window(tabs.get(0));
    }
}
