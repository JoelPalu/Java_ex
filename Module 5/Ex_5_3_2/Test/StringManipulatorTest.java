import org.junit.*;
import static org.junit.jupiter.api.Assertions.*;
public class StringManipulatorTest{

    @Test
    public void canConcatenate() {
        StringManipulator sm = new StringManipulator();
        assertEquals("abcdef", sm.concatenate("abc", "def"));
    }

    @Test
    public void canFindLength() {
        StringManipulator sm = new StringManipulator();
        assertEquals(3, sm.findLength("abc"));
    }

    @Test
    public void canConvertToUpperCase() {
        StringManipulator sm = new StringManipulator();
        assertEquals("ABC", sm.convertToUpperCase("abc"));
    }

    @Test
    public void canConvertToLowerCase() {
        StringManipulator sm = new StringManipulator();
        assertEquals("abc", sm.convertToLowerCase("ABC"));
    }

    @Test
    public void canContainSubstring() {
        StringManipulator sm = new StringManipulator();
        assertTrue(sm.containsSubstring("abc", "a"));
        assertFalse(sm.containsSubstring("abc", "d"));
    }

}
