package tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import utilities.BaseClass;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class C34_DownlodTest extends BaseClass {
     /*
    Go to https://claruswaysda.github.io/downloadUpload.html
    Click on download
    Verify that 'QAProgram.png' file is downloaded
    */

    @Test
    void downloadTest() throws InterruptedException, IOException {
//        Go to https://claruswaysda.github.io/downloadUpload.html
        driver.get("https://claruswaysda.github.io/downloadUpload.html");

//        Click on download
        Files.deleteIfExists(Path.of(System.getProperty("user.home")+"\\downloads\\QAProgram.png"));

        driver.findElement(By.xpath("//a[@class ='download-btn']")).click();
        Thread.sleep(300);


//        Verify that 'QAProgram.png' file is downloaded
        boolean isFile = Files.exists(Path.of(System.getProperty("user.home")+"\\downloads\\QAProgram.png"));
        Thread.sleep(300);
        System.out.println("isFile = " + isFile);
        assert isFile;

    }




}
