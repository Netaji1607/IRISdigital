package com.practise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataHandleByProperties {
 public static void main(String[] args) throws IOException, InterruptedException {
	WebDriverManager.firefoxdriver().setup();
    WebDriver driver =new FirefoxDriver();
    
    driver.get("https://www.facebook.com/");
    Thread.sleep(3000);
	FileInputStream fis=new FileInputStream("C:\\Users\\netaj\\Desktop\\Config.properties.txt");
   Properties p=new Properties();
   p.load(fis);
   driver.findElement(By.id("email")).sendKeys(p.getProperty("username"));
   driver.findElement(By.id("pass")).sendKeys(p.getProperty("password"),Keys.ENTER);
   }
}
