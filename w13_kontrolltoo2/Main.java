import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Sentence sentence = new Sentence("the quick brown brown fox jumped over the lazy dog dog");

        try{
            List<String> duplicates = sentence.getDuplicates().stream().map(duplicate -> duplicate.toString()).collect(Collectors.toList());
            Files.write(Path.of("duplicates.txt"), duplicates);
            System.out.println(duplicates);
        } catch(IOException e){
            throw new IllegalArgumentException(e);
        }

        try{
            List<String> uniques = sentence.getUniques().stream().map(unique -> unique.toString()).collect(Collectors.toList());
            Files.write(Path.of("uniques.txt"), uniques);
            System.out.println(uniques);
        } catch(IOException e){
            throw new IllegalArgumentException(e);
        }

    }
}
