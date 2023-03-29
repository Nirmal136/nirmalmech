package com.willysalazar.example.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.ie.InternetExplorerDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

class ChromeLocalDriverFactory{

    private ChromeOptions ieOptions;

    ChromeLocalDriverFactory(ChromeOptions chromeOptions) {
        this.ieOptions = ieOptions;
    }

    WebDriver driver() {
    	System.setProperty("webdriver.ie.driver", "C:\\Users\\SONY\\eclipse-workspace\\Selenium_Practice\\drivers\\IEDriverServer.exe");
	    WebDriver driver= new InternetExplorerDriver();
        WebDriverManager.iedriver().setup();
        return new ChromeDriver(ieOptions);
    }
    
    
}
