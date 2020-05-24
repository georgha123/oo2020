import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Sentence implements Letters {
    List<Word> words = new LinkedList<>();

    public Sentence(String a){
        String[] wordList = a.split(" ");
        for (String word : wordList) {
            words.add(new Word(word));
        }
    }

    public List<Word> getWords(){
        return words;
    }

    public int count(){
        return words.size();
    }

    public List<Word> getUniques(){
        List<Word> uniques = new ArrayList<>();
        for (Word word : words) {
            if(!uniques.contains(word)){
                uniques.add(word);
            }
        }
        return uniques;
    }

    public List<Word> getDuplicates(){
        List<Word> duplicates = new ArrayList<>(words);
        List<Word> uniques = getUniques();
        for (Word unique : uniques) {
            duplicates.remove(unique);
        }
        return duplicates;
    }


    @Override
    public int total(char a) {
        int sum = 0;
        for (Word word : words) {
                sum += word.total(a);
        }
        return sum;

    }
}
