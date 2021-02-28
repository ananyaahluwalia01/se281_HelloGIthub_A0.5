package nz.ac.auckland.softeng281.hellogithub;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import nz.ac.auckland.softeng281.hellogithub.Basics;

import static org.junit.Assert.*;

@RunWith(Suite.class)
@SuiteClasses({
	BasicsTestSuite.BasicTest.class
})

public class BasicsTestSuite {

	@FixMethodOrder(MethodSorters.NAME_ASCENDING)
    public static class BasicTest {

        @Test
        public void testTriple() {
            assertEquals(3, Basics.triple(1));
            assertEquals(15, Basics.triple(5));
            assertEquals(0, Basics.triple(0));
            assertEquals(33, Basics.triple(11));
            assertEquals(-6, Basics.triple(-2));
            assertEquals(-369, Basics.triple(-123));
        }
        
        @Test
        public void testAbsoloute() {
            assertEquals(3, Basics.absolute(-3), 0.0001);
            assertEquals(0, Basics.absolute(0), 0.0001);
            assertEquals(12, Basics.absolute(-12), 0.0001);
            assertEquals(3, Basics.absolute(3), 0.0001);
            assertEquals(12.87, Basics.absolute(-12.87), 0.0001);
            assertEquals(25, Basics.absolute(25), 0.0001);
            assertEquals(3.0012, Basics.absolute(3.0012), 0.0001);
        }
        
        @Test
        public void testMinimum() {
            assertEquals(-3, Basics.min(-3, 2));
            assertEquals(0, Basics.min(0, 0));
            assertEquals(0, Basics.min(0, 7));
            assertEquals(0, Basics.min(5, 0));
            assertEquals(12, Basics.min(29, 12));
            assertEquals(-87, Basics.min(-32, -87));
            assertEquals(25, Basics.min(25, 92));
        }
        
        @Test
        public void testMaximum() {
            assertEquals(2, Basics.max(-3, 2));
            assertEquals(0, Basics.max(0, 0));
            assertEquals(7, Basics.max(0, 7));
            assertEquals(5, Basics.max(5, 0));
            assertEquals(29, Basics.max(29, 12));
            assertEquals(-32, Basics.max(-32, -87));
            assertEquals(92, Basics.max(25, 92));
        }

        @Test
        public void testRounding() {
            assertEquals(1, Basics.round(1.0));
            assertEquals(5, Basics.round(5.1));
            assertEquals(7, Basics.round(7.499));
            assertEquals(3, Basics.round(2.51));
            assertEquals(10, Basics.round(9.99));
            assertEquals(-2, Basics.round(-1.99));
            assertEquals(-11, Basics.round(-11.499));
        }
        
    }

}

