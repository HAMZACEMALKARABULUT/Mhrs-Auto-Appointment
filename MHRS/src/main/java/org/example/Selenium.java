package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Selenium {


    public void test(String userName,String password){

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--lang=tr");

        WebDriver driver = new ChromeDriver(options);
        Actions action=new Actions(driver);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        driver.get("https://mhrs.gov.tr/vatandas/#/");

        WebElement inputElement =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("LoginForm_username")));

        inputElement.sendKeys(userName);

        WebElement inputElement2 =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("LoginForm_password")));
        inputElement2.sendKeys(password);

        WebElement submitButton=  wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[type='submit']")));

        submitButton.click();

        WebElement closeInfo= wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[class='ant-btn']")));

        closeInfo.click();

        WebElement makeAppointment= wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class='ant-card randevu-card hasta-randevu-card mb-16 mr-16'] h3")));
        makeAppointment.click();

        WebElement generalSearch= wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[class='ant-btn randevu-turu-button genel-arama-button ant-btn-lg']")));
        generalSearch.click();

        WebElement cityCheckBox= wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class='ant-tabs-content ant-tabs-content-animated ant-tabs-top-content'] " +
                "div:nth-child(3) div:nth-child(2) div:nth-child(1) span:nth-child(1) span:nth-child(1) span:nth-child(1) span:nth-child(1) span:nth-child(1)")));

        cityCheckBox.click();

        WebElement selectCity= wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(7) > section:nth-child(3) > main:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) " +
                "> div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > form:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > span:nth-child(1) > div:nth-child(2) >" +
                " div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > ul:nth-child(2) > li:nth-child(1) > ul:nth-child(3) > li:nth-child(2) > span:nth-child(2)")));
        selectCity.click();

        try {
            Thread.sleep(5000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        action.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();

        WebElement selectClinic= wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(7) > section:nth-child(3) > main:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > form:nth-child(1) > div:nth-child(5) > div:nth-child(2) > div:nth-child(1) > span:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > ul:nth-child(2) > li:nth-child(76) > span:nth-child(2) > span:nth-child(1)")));
        selectClinic.click();




        WebElement searchAppointment= wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[type='submit']")));

        searchAppointment.click();
    }
}
