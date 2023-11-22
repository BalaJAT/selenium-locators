package learning.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DemoBlazeTest {
	
	public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Set up Chrome options to start the browser maximized
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");

        // Create a new instance of the ChromeDriver with Chrome options
        WebDriver driver = new ChromeDriver(chromeOptions);

        // Navigate to https://www.demoblaze.com/
        driver.get("https://www.demoblaze.com/");

        // Verify if the title of the page is "store"
        String pageTitle = driver.getTitle();
        if (pageTitle.equals("store")) {
            System.out.println("Page landed on the correct website");
        } else {
            System.out.println("Page not landed on the correct website");
        }

        // Close the browser
        driver.quit();
    }

}
