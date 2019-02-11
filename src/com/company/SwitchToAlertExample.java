package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SwitchToAlertExample {
    public static void exe(WebDriver driver, WebDriverWait wait){
        driver.findElement(By.id("name")).sendKeys("Patryk");
        driver.findElement(By.id("alertbtn")).click();
        if(!driver.switchTo().alert().getText().equals("Hello Patryk, share this practice page and share your knowledge")){
            System.out.println("Incorrect 1st text");
        }
        driver.switchTo().alert().dismiss();
        driver.findElement(By.id("name")).sendKeys("Patryk");
        driver.findElement(By.id("confirmbtn")).click();
        if(!driver.switchTo().alert().getText().equals("Hello Patryk, Are you sure you want to confirm?")){
            System.out.println("Incorrect 2nd test");
        }
        driver.switchTo().alert().accept();
        System.out.println("Alert Accepted");
        driver.findElement(By.id("confirmbtn")).click();
        driver.switchTo().alert().dismiss();
        System.out.println("Alert Dismissed");
    }
}
