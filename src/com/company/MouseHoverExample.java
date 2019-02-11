package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseHoverExample {
    public static void exe(WebDriver driver, WebDriverWait wait){
        Actions actions=new Actions(driver);
        actions.moveToElement(driver.findElement(By.id("mousehover"))).build().perform();
        driver.findElement(By.xpath("//div[@class='mouse-hover-content']/a[2]")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("mousehover")));
        actions.moveToElement(driver.findElement(By.id("mousehover"))).build().perform();
        driver.findElement(By.xpath("//div[@class='mouse-hover-content']/a[2]")).click();
    }
}
