package com.pixellato.sofa;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        MainActivity m = new MainActivity();
        int result = m.calculateSum(3,3);
        assertEquals(6, result);
    }
}