package com.test;

import com.base.BaseClass;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class FbTest extends BaseClass {

    @BeforeTest
    public void initialize(){
        init();
    }

    @org.testng.annotations.Test
    public void fbTest(){
        driver.findElement(By.id("email")).sendKeys("");
        driver.findElement(By.id("pass")).sendKeys("");
    }

    @AfterTest
    public void closeWindow(){
        close();
    }
}
