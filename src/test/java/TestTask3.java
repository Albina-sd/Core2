import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static com.java.core.Task3.fuzzySearch;
import static org.junit.jupiter.api.Assertions.assertEquals;


@DisplayName("A special test case for fuzzy search")
public class TestTask3 {

    @Test
    @DisplayName("Check wrong chars position")
    public void Test1(){
        String pattern = "def";
        String text = "abcdclmnfke";
        assertEquals(false, fuzzySearch(pattern, text));
    }

    @Test
    @DisplayName("Check missing symbol")
    public void Test2(){
        String pattern = "def";
        String text = "abcdclmnfk";
        assertEquals(false, fuzzySearch(pattern, text));
    }

    @Test
    @DisplayName("Check positive test")
    public void Test3(){
        String pattern = "def";
        String text = "abcdclmnenjkjnlf";
        assertEquals(true, fuzzySearch(pattern, text));
    }

    @Test
    @DisplayName("Test where symbols in pattern duplicated but in input string not")
    public void Test4(){
        String pattern = "defdef";
        String text = "abcd cle mnf k";
        assertEquals(false, fuzzySearch(pattern, text));
    }

    @Test
    @DisplayName("One more positive test where symbols in pattern and string duplicated")
    public void Test5(){
        String pattern = "defdef";
        String text = "abc d cl e mn f knjk d ss e hh f";
        assertEquals(true, fuzzySearch(pattern, text));
    }

    @Test
    @DisplayName("Check long pattern")
    public void Test6(){
        String pattern = "longpatterncheckwithsymbols$*)9";
        String text = "knjklonjkkjjkjgpatteuuurhjhhkks ncheckwithsymkjjuhiusdhbhfkbols$*) d ss e hh 9f";
        assertEquals(true, fuzzySearch(pattern, text));
    }

}
