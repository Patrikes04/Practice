package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class iFrameExample {
    public static void exe(WebDriver driver, WebDriverWait wait){
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//a[@href='videos.php']")).click();
    }
}
