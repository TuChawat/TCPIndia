/**
 * Description : TCP_India.java is test file which is having test cases for TCP India.
 * Author      : Tushar Chawat
 * Date        : 15/06/2021
 */

package com.bridgelabz.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TCP_Login {
    @FindBy(xpath = "//a[text() = 'Login']")
    WebElement Login;

    @FindBy(xpath = "//button[text() = 'SIGN IN']")
    WebElement Signin;

    public TCP_Login(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void tcpindiaLogin() {
        Login.click();
        Signin.click();
    }
}
