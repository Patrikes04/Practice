package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckboxExample {
    public static void exe(WebDriver driver){
        for(int i=1;i<4;i++) {
            driver.findElement(By.id("checkBoxOption"+i+"")).click();
        }
    }
}
