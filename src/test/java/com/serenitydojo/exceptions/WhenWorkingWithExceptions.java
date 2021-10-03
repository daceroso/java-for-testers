package com.serenitydojo.exceptions;

import org.junit.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

public class WhenWorkingWithExceptions {
    WordCounter wordCounter = new WordCounter();


    @Test
    public void shouldCountTheWordsInAString() {

        int numberOfWords = wordCounter.numberOfWordsIn("some string");

        assertThat(numberOfWords).isEqualTo(2);
    }

    @Test
    public void shouldReturnZeroForANullString() {

        assertThat(wordCounter.numberOfWordsIn(null)).isEqualTo(0);
    }

    @Test
    public void shouldCountWordsAFile() throws IOException {
        int numberOfWord = wordCounter.numberOfWordsInFile("src/main/java/com/serenitydojo/resources/hello.txt");
    }

    @Test
    public void shouldReportAnErrorIfTheFileDoesNotExist() {

       int numberOfWords =  wordCounter.numberOfWordsInFile("file-that-does-not-exist.txt");
       assertThat(numberOfWords).isEqualTo(0);
    }
}
