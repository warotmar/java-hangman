package pl.edu.agh.hangman;

import java.util.Arrays;

public class Game {

    private String wordToFind;
    private char[] guesses;

    public Game(WordProvider wordProvider){
        this.wordToFind = wordProvider.getWordToGuess();
        guesses = new char[wordToFind.length()];
        Arrays.fill(guesses,'_');
    }

    public void play(char a){

    }

    public void printGuesses() {
        for (int i = 0; i < guesses.length; i++) {
            System.out.println("" + guesses[i] + " ");
        }
    }
}
