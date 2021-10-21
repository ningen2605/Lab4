package lab4;

import lab4.GradeBook;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GradeBookTester {
    private GradeBook g1;
    private GradeBook g2;

    @BeforeEach
    void setUp() {
        g1 = new GradeBook(5);
        g2 = new GradeBook(5);

        g1.addScore(2);
        g1.addScore(5);
        g2.addScore(3);
        g2.addScore(1);
        g2.addScore(4);
    }

    @AfterEach
    void tearDown() {
        g1 = null;
        g2 = null;
    }

    @Test
    void addScore() {
        assertTrue(g1.toString().equals("2.0 5.0"));
        assertTrue(g2.toString().equals("3.0 1.0 4.0"));
        assertEquals(2,  g1.getScoreSize());
        assertEquals(3,  g2.getScoreSize());
    }


    @Test
    void sum() {
        assertEquals(7, g1.sum());
        assertEquals(8, g2.sum());
    }

    @Test
    void minimum() {
        assertEquals(2, g1.minimum());
        assertEquals(1, g2.minimum());
    }

    @Test
    void finalScore() {
        assertEquals(5.0D, g1.finalScore());
        assertEquals(7.0D, g2.finalScore());
    }

    @Test
    void getScoreSize() {
    }

    @Test
    void testToString() {
    }
}