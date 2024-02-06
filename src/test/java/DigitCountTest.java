import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.util.Map;
import org.junit.Test;
public class DigitCountTest {
	@Test
    public void testDigitCount() {
        // Test case 1
        int input1 = 12345;
        Map<Integer, Integer> result1 = DigitCount.calculateDigitCount(input1);
        Map<Integer, Integer> expected1 = new HashMap<>();
        expected1.put(1, 1);
        expected1.put(2, 1);
        expected1.put(3, 1);
        expected1.put(4, 1);
        expected1.put(5, 1);
        assertEquals(expected1, result1);

        // Test case 2
        int input2 = 112233;
        Map<Integer, Integer> result2 = DigitCount.calculateDigitCount(input2);
        Map<Integer, Integer> expected2 = new HashMap<>();
        expected2.put(1, 2);
        expected2.put(2, 2);
        expected2.put(3, 2);
        assertEquals(expected2, result2);

        // Test case 3
        int input3 = 987654321;
        Map<Integer, Integer> result3 = DigitCount.calculateDigitCount(input3);
        Map<Integer, Integer> expected3 = new HashMap<>();
        expected3.put(1, 1);
        expected3.put(2, 1);
        expected3.put(3, 1);
        expected3.put(4, 1);
        expected3.put(5, 1);
        expected3.put(6, 1);
        expected3.put(7, 1);
        expected3.put(8, 1);
        expected3.put(9, 1);
        assertEquals(expected3, result3);
    }

    @Test
    public void testDuplicateDigits() {
        // Test case 1
        int input1 = 112233;
        Map<Integer, Integer> result1 = DigitCount.calculateDigitCount(input1);
        assertTrue(result1.containsValue(2));

        // Test case 2
        int input2 = 123456;
        Map<Integer, Integer> result2 = DigitCount.calculateDigitCount(input2);
        assertTrue(result2.isEmpty());

        // Test case 3
        int input3 = 1122334455;
        Map<Integer, Integer> result3 = DigitCount.calculateDigitCount(input3);
        assertTrue(result3.containsValue(2));
    }
}
