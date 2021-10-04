package com.serenitydojo.exceptions.handlingExceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileLoader {

    public String readHelloWorld() throws IOException {
        FileLoader fileLoader = new FileLoader();
        return Files.readString(Paths.get("src/main/java/com/serenitydojo/resources/hello.txt"));
    }

    public Boolean fileContainsText(String filename, String expectedText) {
        String path = "src/main/resources/" + filename;
        return null;// (Files.readString(Paths.get(path)).contains(expectedText));
    }

    public Boolean fileHasText(String filename, String expectedText) {
        String path = "src/main/resources/" + filename;
        return null;// (Files.readString(Paths.get(path)).contains(expectedText));
    }
}
