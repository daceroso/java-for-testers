package com.serenitydojo.exceptions;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WordCounter {

    public int numberOfWordsIn(String value) {
        if(value == null) {
            return 0;
        }
        return value.split("\\W").length;
    }

    public int numberOfWordsInFile(String fileName)  {

        try {
            String fileContent = Files.readString(Paths.get(fileName));
            return numberOfWordsIn(fileContent);
        }catch (NoSuchFileException noSuchFile){
            return 0;
        }catch (IOException otherException) {
            return -1;
        }finally {
            System.out.println("FILE PROCESSED FOR " + fileName);
        }
    }
}
