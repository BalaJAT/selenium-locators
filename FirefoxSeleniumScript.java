package learning.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxSeleniumScript {
	
	public static void main(String[] args) {
        // Set the path to the GeckoDriver (Firefox driver) executable
        System.setProperty("webdriver.gecko.driver", "path/to/geckodriver");

        // Create a new instance of the FirefoxDriver
        WebDriver driver = new FirefoxDriver();

        // Maximize the browser window
        driver.manage().window().maximize();

        // Navigate to https://www.google.com/
        driver.get("https://www.google.com");

        // Print the URL of the current page
        System.out.println("Current URL: " + driver.getCurrentUrl());

        // Reload the page
        driver.navigate().refresh();

        // Wait for a few seconds to see the refreshed page
        try {
            Thread.sleep(3000); // You might want to use a more robust method for waiting in a real-world scenario
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Close the browser
        driver.quit();
    }


}
