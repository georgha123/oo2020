import java.util.Objects;

public class Word implements Letters{
    public Word(String a){
        word = a;
    }

    String word;

    @Override
    public int total(char a) {
        int sum = 0;
        for (char letter : word.toCharArray()) {
            if(letter == a){
                sum++;
            }
        }
        return sum;
    }

    @Override
    public boolean equals(Object a) {
        if(!(a instanceof Word)){
            return false;
        }
        Word other = (Word) a;

        return word.equals(other.word);
    }

    @Override
    public String toString() {
        return word;
    }
}
