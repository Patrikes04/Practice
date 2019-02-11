package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebTableExample {
    public static void exe(WebDriver driver, WebDriverWait wait,int price){
        wait.until(ExpectedConditions.elementToBeClickable(By.id("checkBoxOption1")));
        int count=driver.findElements(By.xpath("//table[@id='product']/tbody/tr")).size();
        for(int i=2;i<count;i++){
            if (driver.findElement(By.xpath("//table[@id='product']/tbody/tr["+i+"]/td[3]")).getText().equals(String.valueOf(price))){
                System.out.println(driver.findElement(By.xpath("//table[@id='product']/tbody/tr["+i+"]/td[2]")).getText());
            }
        }
    }
}
