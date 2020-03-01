package pl.edu.agh.hangman;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class WordsListProvider {
    private final List<String> wordsList = createWordsList();
    private Random rd = new Random();
    private String path;

    public WordsListProvider(String path){
        this.path = path;
    }

    private List<String> createWordsList(){
        List<String> words = new ArrayList<String>();
        try {
            File file = new File( getClass().getClassLoader().getResource(path).getFile());
            Scanner myReader = new Scanner(file);
            while (myReader.hasNextLine()) {
                String line = myReader.nextLine();
                words.add(line);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return words;
    }

    public List<String> getWordsList(){
        return wordsList;
    }
}
