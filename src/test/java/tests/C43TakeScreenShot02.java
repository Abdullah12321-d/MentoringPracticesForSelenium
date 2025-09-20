package tests;

import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.devtools.v139.filesystem.model.File;
import utilities.BaseClass;

import java.nio.file.Path;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class C43TakeScreenShot02  extends BaseClass {

     /*
    Go to Linkedin
    Take homepage's screenshot
    Take logo's screenshot
*/
//
//    @Test
//    public void screenShotWithTestBaseTest(){
//        driver.get("https://www.linkedin.com");
//
//        TakesScreenshot ss = (TakesScreenshot) driver;
//        File screenFile = ss.getScreenshotAs(OutputType.FILE);
//        String timeStamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd-HH-mm-ss-SSS"));
//        String screenShotName = "Screenshot"+timeStamp+".png";
//        Path screenShotPath = Path.of(System.getProperty("user.dir"),"test_outputs","screenshots",screenShotName);
//        takeElementsScreenshot(driver,screenFile);
////        try {
////            FileUtils.copyFile(screenFile,screenShotPath.toFile());
////        } catch (Exception e) {
////            throw new RuntimeException(e);
////        }
//
//
//    }
//
//}
}