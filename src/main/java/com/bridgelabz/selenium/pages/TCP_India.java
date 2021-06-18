/**
 * Description : TCP_India.java is test file which is having test cases for TCP India.
 * Author      : Tushar Chawat
 * Date        : 15/06/2021
 */

package com.bridgelabz.selenium.pages;

import com.bridgelabz.selenium.base.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TCP_India {
    @FindBy(xpath = "//button[text() = 'SEARCH']")
    WebElement Search;

    public TCP_India(WebDriver driver) { PageFactory.initElements(Base.driver, this);
    }

    public void tcpindiaSearch() {
        Search.click();
    }
}
