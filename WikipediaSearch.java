package learning.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WikipediaSearch {
	
	public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Set up Chrome options to start the browser maximized
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");

        // Create a new instance of the ChromeDriver with Chrome options
        WebDriver driver = new ChromeDriver(chromeOptions);

        // Navigate to https://www.wikipedia.org/
        driver.get("https://www.wikipedia.org/");

        // Find the search input element by its name attribute value (search for "Artificial intelligence")
        WebElement searchBox = driver.findElement(By.name("search"));
        searchBox.sendKeys("Artificial intelligence");
        searchBox.sendKeys(Keys.RETURN);

        // Click on the "History" section in the search result
        WebElement historyLink = driver.findElement(By.linkText("History"));
        historyLink.click();

        // Wait for a few seconds to see the history section
        try {
            Thread.sleep(5000); // You might want to use a more robust method for waiting in a real-world scenario
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the title of the section
        System.out.println("Title of the history section: " + driver.getTitle());

        // Close the browser
        driver.quit();
    }

}
