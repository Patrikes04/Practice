package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RadioButtonExample {
    public static void exe(WebDriverWait wait) {
        for(int i = 1;i<4;i++){
            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[value='radio" + i + "']"))).click();
    }
}
}
