package com.test;

import com.base.BaseClass;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;

public class FbTest extends BaseClass {

    @BeforeTest
    public void initialize(){
        init();
    }

    @Test
    public void fbTest() throws AWTException {
        Robot robot = new Robot();
        robot.mouseWheel(100);   // scroll down the page
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_N);       // ctrl+n will open new window

        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_N);
        robot.delay(1000);
    }
    @AfterTest
    public void closeWindow(){
        close();
    }
}
