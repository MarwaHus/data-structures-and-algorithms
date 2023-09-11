package brackets;

import Brackets.BracketValidator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppTest {
    @Test
    public void testValidBrackets() {
        String str = "[(a)]";
        assertTrue(BracketValidator.validateBrackets(str));
    }

    @Test
    public void testInvalidBrackets() {
        String str = "{(a+b)*(c+d)]";
        assertFalse(BracketValidator.validateBrackets(str));
    }

    @Test
    public void testEmptyString() {
        String str = "";
        assertTrue(BracketValidator.validateBrackets(str));
    }

    @Test
    public void testOnlyOpeningBrackets() {
        String str = "(()[]{})";
        assertTrue(BracketValidator.validateBrackets(str));
    }

    @Test
    public void testOnlyClosingBrackets() {
        String str = "()[]{}";
        assertTrue(BracketValidator.validateBrackets(str));
    }

    @Test
    public void testNestedBrackets() {
        String str = "{()[{}]}";
        assertTrue(BracketValidator.validateBrackets(str));
    }

    @Test
    public void testUnbalancedOpeningBrackets() {
        String str = "({[()])}";
        assertFalse(BracketValidator.validateBrackets(str));
    }

    @Test
    public void testUnbalancedClosingBrackets() {
        String str = "{([])";
        assertFalse(BracketValidator.validateBrackets(str));
    }
}

