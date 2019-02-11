package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementDisplayedExample {
    public static void exe(WebDriver driver, WebDriverWait wait){
        WebElement displayedText=driver.findElement(By.id("displayed-text"));
        if(displayedText.isDisplayed()){
            displayedText.sendKeys("zxcvbnm");
            driver.findElement(By.id("hide-textbox")).click();
        }
        if(!displayedText.isDisplayed()){
            driver.findElement(By.id("show-textbox")).click();
        }
    }
}
