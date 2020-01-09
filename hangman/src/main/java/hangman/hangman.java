package Hangman;

import acm.util.*;

public class Hangman {

    public static void main(String args[]) {
        Hangman h = new Hangman();
        h.run();
    }

    public void run() {
        RandomGenerator rg = new RandomGenerator();
        int index = rg.nextInt(0, 9);
        HangmanLexicon hexagon = new HangmanLexicon();
        String word = hexagon.getWord(index); 
        System.out.println(word);
        /*create new word from Hangman Lexicon
        game(word)
        playAgain()
        */
    }

    //
    //public void game(String word) {}
    //public boolean playAgain() {}
}