import Functions.CharacterReversal;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class CharacterReversalTest {
	 @Test
	    public void testReverseCharacters() {
	        // Arrange
	        String input = "HelloWorld";
	        String expectedOutput = "hELLOwORLD";

	        // Act
	        String actualOutput = CharacterReversal.reverseCharacters(input);

	        // Assert
	        assertEquals(expectedOutput, actualOutput);
	    }

	    @Test
	    public void testReverseCharactersWithEmptyString() {
	        // Arrange
	        String input = "";
	        String expectedOutput = "";

	        // Act
	        String actualOutput = CharacterReversal.reverseCharacters(input);

	        // Assert
	        assertEquals(expectedOutput, actualOutput);
	    }

	    @Test
	    public void testReverseCharactersWithUpperCaseOnly() {
	        // Arrange
	        String input = "HELLO";
	        String expectedOutput = "hello";

	        // Act
	        String actualOutput = CharacterReversal.reverseCharacters(input);

	        // Assert
	        assertEquals(expectedOutput, actualOutput);
	    }

	    @Test
	    public void testReverseCharactersWithLowerCaseOnly() {
	        // Arrange
	        String input = "world";
	        String expectedOutput = "WORLD";

	        // Act
	        String actualOutput = CharacterReversal.reverseCharacters(input);

	        // Assert
	        assertEquals(expectedOutput, actualOutput);
	    }
}
