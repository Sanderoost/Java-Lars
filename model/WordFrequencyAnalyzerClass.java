package model;

import interfaces.*;
import java.util.*;

/**
 * @author Lars van der Schoor <larsvanderschoor@hotmail.com>
 * <p>
 * Case assessment Ordina November '22 - Class for WordFrequencyAnalyzer
 */
public class WordFrequencyAnalyzerClass implements WordFrequencyAnalyzer {

    public int calculateHighestFrequency(String inputText) {
        String[] words = inputText.toLowerCase().split(" ");
        Arrays.sort(words);
        int max = 0;
        int count = 1;
        String currentWord = words[0];
        for (int i = 1; i < words.length; i++) {
            if (words[i].equalsIgnoreCase(currentWord)) {
                count++;
            } else {
                count = 1;
                currentWord = words[i];
            }
            if (max < count) {
                max = count;
            }
        }
        if (max < 1) {
            max = 1;
        }
        return max;
    }

    public int calculateHighestFrequencyForWord(String inputText, String wordToFind) {
        Sentence sentence = new Sentence();
        sentence.inputText = inputText;
        sentence.wordToGet = wordToFind;
        int count = sentence.getFrequency();
        return count;
    }

    public List calculateMostFrequentNWords(String inputText, int n) {
        List <WordFrequency> myList = new ArrayList<WordFrequency>();
        String[] words = inputText.toLowerCase().split(" ");
        for (int index = 0; index < words.length; index++) {
            Sentence sentence = new Sentence();
            sentence.inputText = inputText;
            sentence.wordToGet = words[index];
            myList.add(sentence);
        }

        return myList;
    }
}
