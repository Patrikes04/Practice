package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownExample {
    public static void exe(WebDriver driver) {
        Select select = new Select(driver.findElement(By.id("dropdown-class-example")));
        for (int i = 1; i < 4; i++) {
            select.selectByValue("option" + i + "");
        }
    }
}
