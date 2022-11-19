package model;
import interfaces.WordFrequency;

import java.util.*;

/**
 * @author Lars van der Schoor <larsvanderschoor@hotmail.com>
 * <p>
 * Case assessment Ordina November '22
 */
public class Sentence implements WordFrequency {
    Scanner keyboard = new Scanner(System.in);
    public String wordToGet;
    public String inputText;

    public String getWord() {
        String[] words = inputText.split(" ");
        List<String> wordList = new ArrayList<>(List.of(words));
        wordToGet = keyboard.next();
        if (wordList.contains(wordToGet)) { // IgnoreCase ?
            return wordToGet;
        } else {
            return "\nnot found";
        }
    }

    public int getFrequency(){
        String [] wordList = inputText.split(" ");
        int count = 0;
        for (int i = 0; i < wordList.length; i++) {
            if (wordToGet.equalsIgnoreCase(wordList[i]))
                count++;
        }
        return count;
    }
}