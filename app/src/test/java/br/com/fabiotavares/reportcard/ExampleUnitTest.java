package br.com.fabiotavares.reportcard;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        ReportCard rc = new ReportCard("Fabio", 8,7,5,9,10);
        System.out.print(rc);
        Assert.assertTrue(true);
    }
}