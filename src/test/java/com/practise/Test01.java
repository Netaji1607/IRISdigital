package com.practise;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test01 {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		 WebDriver driver =new ChromeDriver();
		    
		    driver.get("https://www.facebook.com/");
			FileInputStream fis=new FileInputStream("C:\\Users\\netaj\\Desktop\\Config.properties.txt");
		   Properties p=new Properties();
		   p.load(fis);
		   driver.findElement(By.id("email")).sendKeys(p.getProperty("username"));
		   driver.findElement(By.id("pass")).sendKeys(p.getProperty("password"),Keys.ENTER);
	}

}
