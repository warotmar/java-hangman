package pl.edu.agh.hangman;

public class Game {

    private String wordToFind;
    private char[] guesses;

    public Game(WordsListProvider wordsListProvider){
        
        guesses = new char[wordToFind.length()];

    }

    public char[] getGuesses(){
        return guesses;
    }

    public void play(char a){

    }
}
