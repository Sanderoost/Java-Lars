package interfaces;

import java.util.List;

public interface WordFrequencyAnalyzer {
    int calculateHighestFrequency(String text);
    int calculateHighestFrequencyForWord(String text, String word);
    List<WordFrequency> calculateMostFrequentNWords (String text, int n);
}
