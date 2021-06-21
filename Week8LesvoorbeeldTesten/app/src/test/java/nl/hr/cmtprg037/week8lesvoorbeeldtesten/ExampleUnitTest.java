package nl.hr.cmtprg037.week8lesvoorbeeldtesten;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void additionSameNumbers_isCorrect() {
        assertEquals("4", Calculator.add("2", "2"));
    }

    @Test
    public void additionDifferentNumbers_isCorrect() {
        assertEquals("4", Calculator.add("1", "3"));
    }

    @Test
    public void additionZero_isCorrect() {
        assertEquals("2", Calculator.add("2", "0"));
    }

    @Test
    public void additionNegative_isCorrect() {
        assertEquals("4", Calculator.add("5", "-1"));
    }
}