/**
 * Description : TCP_India.java is test file which is having test cases for TCP India.
 * Author      : Tushar Chawat
 * Date        : 15/06/2021
 */

package com.bridgelabz.selenium;

import com.bridgelabz.selenium.base.Base;
import com.bridgelabz.selenium.pages.TCP_India;
import com.bridgelabz.selenium.pages.TCP_Login;
import org.testng.annotations.Test;

public class TcpindiaTest extends Base {
    public TCP_India India;
    public TCP_Login Login;

    @Test(priority = 0)
    public void tcpindia() throws InterruptedException {
        India = new TCP_India(driver);
        India.tcpindiaSearch();
        driver.switchTo().alert().dismiss();
        Thread.sleep(2000);
    }

    @Test(priority = 1)
    public void tcpIndiaLogin(){
        Login = new TCP_Login(driver);
        Login.tcpindiaLogin();
        driver.switchTo().alert().dismiss();
    }
}
