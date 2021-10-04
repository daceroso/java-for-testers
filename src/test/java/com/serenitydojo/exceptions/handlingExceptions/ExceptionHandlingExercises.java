package com.serenitydojo.exceptions.handlingExceptions;

import org.junit.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;


public class ExceptionHandlingExercises {

    @Test
    public void workingWithDeclaredException() throws IOException {
        FileLoader fileLoader = new FileLoader();
        assertThat(fileLoader.readHelloWorld()).isEqualTo("Hello World");

    }
}
