package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SugesstionClassExample {
    public static void exe(WebDriver driver,WebDriverWait wait) throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(By.id("autocomplete"))).sendKeys("and");
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String script = "return document.getElementById('autocomplete').value;";
        int i;
        for (i = 0; i < 20; i++) {
            String text = (String) js.executeScript(script);
            if (text.equals("Finland")) {
                driver.findElement(By.id("autocomplete")).sendKeys(Keys.ENTER);
            }else{
                driver.findElement(By.id("autocomplete")).sendKeys(Keys.ARROW_DOWN);
            }
        }
    }

}
