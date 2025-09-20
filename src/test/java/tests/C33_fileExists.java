package tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.devtools.v139.filesystem.model.File;
import utilities.BaseClass;

import java.nio.file.Files;
import java.nio.file.Path;

public class C33_fileExists  {

    @Test
    void fileExists() {
     boolean isFile = Files.exists(Path.of(System.getProperty("user.dir")+"\\files\\test_doc.txt"));
        System.out.println("isFile = " + isFile);
        assert isFile;
    }

}
