package com.hyr.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Part_03 {
	WebDriver driver;
	@BeforeMethod
	
	public void setup()
	{
		    WebDriverManager.chromedriver().setup();
		    driver=new ChromeDriver();
		    driver.manage().window().maximize();
	}
	@AfterMethod
	public void tearup()
	{
		driver.close();
	}
	
	@Test
	
	public void TestGoogle() throws InterruptedException, Exception {
   
     FileInputStream fis=new FileInputStream("./src/test/resources/PropertiesFiles/Hero.properties");
    Properties p=new Properties();
     p.load(fis);
      String   url=p.getProperty("Url");
      driver.get(url);
      String data = p.getProperty("BestActor");
    driver.findElement(By.name("q")).sendKeys(data,Keys.ENTER);
   System.out.println(driver.getTitle());
   FileOutputStream fos =new FileOutputStream("./src/test/resources/PropertiesFiles/Hero.properties");
       p.setProperty("BestPlayer","NikhilKumar");
       p.store(fos,"Done By Netaji");
       fos.flush();
       }
	@Test(dataProvider="loxin")
	public void Exceldata(String st) throws EncryptedDocumentException, IOException
	{
	  driver.get("https://www.google.com/");
	  driver.findElement(By.name("q")).sendKeys(st,Keys.ENTER);
	  
	}
	@DataProvider(name="foxin")
	public String[] Data() throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/ExcelData/Testdata.xlsx");	
		 Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet= workbook.getSheet("Sheet1");
		System.out.println(sheet.getLastRowNum());
		String [] str=new String[sheet.getLastRowNum()+1];
	     
	    for(int i=0;i<=sheet.getLastRowNum();i++)
	    {         
	    	 Row row=  sheet.getRow(i);
	         Cell cell=  row.getCell(0);
	       String str1=  cell.getStringCellValue();
           str[i]=str1;	 
           
	    }
	    return str;
	}
	@DataProvider(name="loxin")
	public String[] Data1() throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/ExcelData/Testdata.xlsx");	
		 XSSFWorkbook  workbook = new XSSFWorkbook(fis);
		 
		XSSFSheet sheet= workbook.getSheet("Sheet1");
		System.out.println(sheet.getLastRowNum());
		String [] str=new String[sheet.getLastRowNum()+1];
	     
	    for(int i=0;i<=sheet.getLastRowNum();i++)
	    {         
	    	 Row row=  sheet.getRow(i);
	         Cell cell=  row.getCell(0);
	       String str1=  cell.getStringCellValue();
           str[i]=str1;	 
           
	    }
	    return str;
	}
}
