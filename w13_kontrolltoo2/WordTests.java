import org.junit.Test;
import static org.junit.Assert.*;

public class WordTests {
    @Test
    public void Test1(){
        Word word = new Word("pere");
        assertEquals(0, word.total('a'));
    }
    @Test
    public void Test2(){
        Word word = new Word("pere");
        assertEquals(1, word.total('p'));
    }
    @Test
    public void Test3(){
        Word word = new Word("pere");
        assertEquals(2, word.total('e'));
    }
}
