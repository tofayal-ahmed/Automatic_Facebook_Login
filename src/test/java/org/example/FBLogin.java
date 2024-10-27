package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FBLogin {
    public static void main(String[] args) {


            // Open a browser
            WebDriver browser = new ChromeDriver();

            // Load https://facebook.com
            browser.get("https://facebook.com");

            browser.findElement(By.id("email")).sendKeys("Tanzil Tofayal");
            browser.findElement(By.id("email")).clear();
            browser.findElement(By.id("email")).sendKeys("Tanzil Tofayal");

            browser.findElement(By.name("pass")).sendKeys("12345");
            browser.findElement(By.id("pass")).clear();
            browser.findElement(By.name("pass")).sendKeys("12345");

            browser.findElement(By.name("login")).click();

            browser.close();


        }

    }
