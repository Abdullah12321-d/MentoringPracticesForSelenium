package utilities;

import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class BaseClass {

    public WebDriver driver;
    public WebDriverWait wait;
    public Actions actions;
    public JavascriptExecutor js;


    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterEach
    void tearDown() throws InterruptedException {
        driver.quit();
    }

    protected void takeScreenShot(WebDriver driver) {
        TakesScreenshot ss = (TakesScreenshot) driver;
        File screenFile = ss.getScreenshotAs(OutputType.FILE);
        String timeStamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd:HH-mm-ss"));
        String screenShotName = "Screenshot" + timeStamp + ".png";
        Path screenShotPath = Path.of(System.getProperty("user.dir"), "target", "test-output", "screenshots", screenShotName);

        try {
            FileUtils.copyFile(screenFile, screenShotPath.toFile());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    protected void takeScreenshotOfElement(WebDriver driver, WebElement element) {
        File screenShotFile = element.getScreenshotAs(OutputType.FILE);
        String timeStamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd:HH-mm-ss"));
        String screenShotName = "ElementScreenshot" + timeStamp + ".png";
        Path screenShotPath = Path.of(System.getProperty("user.dir"), "target", "test-output", "screenshots", screenShotName);

        try {
            FileUtils.copyFile(screenShotFile, screenShotPath.toFile());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }




    }
}