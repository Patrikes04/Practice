package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;

public class SwitchTabExample {
    public static void exe(WebDriver driver, WebDriverWait wait) {
        driver.findElement(By.id("opentab")).click();
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[href='videos.php'"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("videoplay")));
        if (!driver.getCurrentUrl().equals("http://www.qaclickacademy.com/videos.php")) {
            System.out.println("Current URL is not valid");
        } else {
            Printer.Success();
        }
        driver.close();
        driver.switchTo().window(tabs.get(0));
    }
}
