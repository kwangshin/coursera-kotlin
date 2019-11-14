import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.*

internal class CourseraWeek2Test {

    @Test
    fun isValidIdentifier_withLetter_expectTrue() {
        assertTrue(isValidIdentifier("name"))
    }

    @Test
    fun isValidIdentifier_withUnderscore_expectTrue() {
        assertTrue(isValidIdentifier("_"))
    }

    @Test
    fun isValidIdentifier_startWithUnderscore_expectTrue() {
        assertTrue(isValidIdentifier("_name"))
    }

    @Test
    fun isValidIdentifier_startWithUnderscoreAndNumber_expectTrue() {
        assertTrue(isValidIdentifier("_2"))
    }

    @Test
    fun isValidIdentifier_withEmpty_expectFalse() {
        assertFalse(isValidIdentifier(""))
    }

    @Test
    fun isValidIdentifier_startWithNumber_expectFalse() {
        assertFalse(isValidIdentifier("2"))
    }

    @Test
    fun isValidIdentifier_withSymbol_expectFalse() {
        assertFalse(isValidIdentifier("$"))
    }
}