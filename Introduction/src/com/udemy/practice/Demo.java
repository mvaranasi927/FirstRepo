package com.udemy.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sastry\\Documents\\Meena\\Java\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//System.setProperty("webdriver.ie.driver", "C:\\Users\\sastry\\Documents\\Meena\\Java\\MicrosoftWebDriver.exe");
		//WebDriver driver = new InternetExplorerDriver();
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		driver.get("https://yahoo.com");
		driver.navigate().back();
		driver.close();
		driver.quit();
		

	}

}
