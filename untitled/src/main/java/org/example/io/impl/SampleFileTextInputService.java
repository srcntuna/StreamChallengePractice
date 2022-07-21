package org.example.io.impl;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.example.io.TextInputService;

public class SampleFileTextInputService implements TextInputService {
    private static final String FILE_NAME = "/Users/sabrisercantuna/Desktop/Java-Course/Week5/Day4/StreamChallengePractice/untitled/book.txt";
    @Override
    public String getText() {
        // TODO



        String contents = null;
        try{
   contents = Files.readString(Path.of(FILE_NAME));
        }catch (IOException ioException) {
            ioException.printStackTrace();
        }


        return contents;





    }
}
