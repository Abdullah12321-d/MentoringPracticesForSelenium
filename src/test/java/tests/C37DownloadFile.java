package tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import utilities.BaseClass;

public class C37DownloadFile extends BaseClass {
    @Test
    public void FileDownLoadTest() {
        By seleniumSnapLinkText = By.linkText("selenium-snapshot.png");
        //Go to URL: https://the-internet.herokuapp.com/download
        driver.get("https://the-internet.herokuapp.com/download");

        //Download selenium-snapshot.png
        driver.findElement(seleniumSnapLinkText).click();

        //Verify if the file downloaded successfully
    }
}
