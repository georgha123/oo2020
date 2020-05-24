import org.junit.Test;
import static org.junit.Assert.*;

public class SentenceTests {
    @Test
    public void test1(){
        Sentence sentence = new Sentence("the quick brown fox jumped over the lazy dog");
        assertEquals(1, sentence.total('a'));
        assertEquals(9, sentence.count());
    }
}
