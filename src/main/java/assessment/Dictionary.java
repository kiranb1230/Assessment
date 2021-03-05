package assessment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Dictionary {

    private DictionaryService dictService;

    public void setDictionaryService(DictionaryService dictService){
        this.dictService = dictService;
    }

    /**
     * @return String list with the dictionary content
     */
    public List<String> getDictionary() {
        return dictService.getDictionary();
    }

    /**
     * @param word any given string
     * @return boolean if the word found in the dictionary
     */
    public boolean isEnglishWord(String word) {
        return dictService.isEnglishWord(word);
    }

    /**
     * @param input_word string
     * @return String list with all the possible word combinations from the given input
     */
    public List<String> findPossibleWords(String input_word) {
        ArrayList <String> matches = new ArrayList <String> ();
        List<String> dictionary = getDictionary();
        
        // convert to lower case    
        input_word = input_word.toLowerCase();

        // for each word in dictionary
        for (String dictWord : dictionary) { 
            // match flag
            Boolean nonMatch = true;

            // checking dict word in input word with all possible combinations
            // loop over and replace character check if the length is same.
            for (char eachDictWord : dictWord.toCharArray()) {
                String dw = Character.toString(eachDictWord);
                if (dictWord.length() - dictWord.replace(dw, "").length() != input_word.length() - input_word.replace(dw, "").length()) {
                    nonMatch = false;
                    break;
                }
            }
            
            if (nonMatch) {
                matches.add(dictWord);
            }
        }
        
        System.out.println("Possible Combinations :" + String.join(", ", matches));
        return matches;
    }
}
