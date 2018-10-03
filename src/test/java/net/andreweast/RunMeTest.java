package net.andreweast;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RunMeTest {
    private RunMe runner;

    @Before
    public void setUp() {
        runner = new RunMe(true);
    }

    @Test
    public void reportStatusTrue() {
        assertEquals(1, runner.report());
    }

    @Test
    public void reportStatusFalse() {
        RunMe runner2 = new RunMe(false);
        assertEquals(-1, runner2.report());
    }
}
