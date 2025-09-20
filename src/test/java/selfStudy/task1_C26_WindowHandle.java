//package selfStudy;
//
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import utilities.BaseClass;
//
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.List;
//import java.util.Set;
//
//public class task1_C26_WindowHandle extends BaseClass {
//
//    /*
//    Go to https://claruswaysda.github.io/
//    Click on Window Handle
//    Click on 'Open Index Page'
//    Verify the link 'https://claruswaysda.github.io/index.html'
//*/
//
//    @Test
//    void windowHandleTest(){
////        Go to https://claruswaysda.github.io/
//        driver.get("https://claruswaysda.github.io/");
//
////        Click on Window Handle
//        driver.findElement(By.linkText("Window Handle")).click();
//
////        Click on 'Open Index Page'
////        String mainWindow = driver.getWindowHandle();
//
//        Set<String> window1 = driver.getWindowHandles();
//        List<String> windowHandles = new ArrayList<>(window1);
//        driver.switchTo().window(windowHandles.get(1));
////        Iterator<String> iterator = window1.iterator();
////        while (iterator.hasNext()){
////            String ch = iterator.next();
////
////
////        }
////        String par =(String) iterator.next();
////        String ch = (String) iterator.next();
//
//        driver.switchTo().window(windowHandles.get(1));
//        driver.findElement(By.id("openIndex")).click();
//        windowHandles = new ArrayList<>(driver.getWindowHandles());
//
//
////        Verify the link 'https://claruswaysda.github.io/index.html'
//        driver.switchTo().window(windowHandles.get(2));
//      String url = driver.getCurrentUrl();
//        Assertions.assertEquals("https://claruswaysda.github.io/index.html",url,"not the now windo");
//
//
//
//        driver.findElement(By.linkText("Window Handle")).click();
//
//        windowHandles = new ArrayList<>(driver.getWindowHandles());
//        driver.switchTo().window(windowHandles.get(3));
//        driver.findElement(By.id("openIndex")).click();
//
//
//        windowHandles = new ArrayList<>(driver.getWindowHandles());
//        driver.switchTo().window(windowHandles.get(4));
//        Assertions.assertEquals("https://claruswaysda.github.io/index.html",url,"not the now windo");
//
//
//
//
//
//
//    }
//
//


//}
