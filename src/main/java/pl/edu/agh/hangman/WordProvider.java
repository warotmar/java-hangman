package pl.edu.agh.hangman;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WordProvider {
    private Random rd = new Random();

    public String getWordToGuess(){
        WordsListProvider wordsList = new WordsListProvider("slowa.txt");
        List<String> list = wordsList.getWordsList();
        return list.get(rd.nextInt(list.size()));
    }
}
