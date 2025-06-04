import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimilarityTest {

    private Similarity sm;

    @BeforeEach
    void setUp() {
        sm = new Similarity();
    }

    @Test
    void notNullSimilarityObject() {
        assertNotNull(sm);
    }

    @Test
    void invalidInputNotString() {
        assertThrows(IllegalArgumentException.class, () -> {
            sm.compare("123", "abc");
        });
        assertThrows(IllegalArgumentException.class, () -> {
            sm.compare("123", "ab1c");
        });
        assertThrows(IllegalArgumentException.class, () -> {
            sm.compare("123", "");
        });
    }

    @Test
    void sameLength() {
        int expected = 60;

        int ret = sm.compare("asd", "qwe");

        assertEquals(expected, ret);
    }

    @Test
    void gapIs2timesBigger() {
        int expected = 0;

        int ret = sm.compare("qweq", "aa");

        assertEquals(expected, ret);
    }


    @Test
    void gapIs2timesBiggerAndAIsShorterThanB() {
        int expected = 0;

        int ret = sm.compare("avq", "qofnvk");

        assertEquals(expected, ret);
    }

    @Test
    void differentLength_3_2() {
        int expected = 30;

        int ret = sm.compare("qqq", "aq");

        assertEquals(expected, ret);
    }

    @Test
    void differentLength_2_1() {
        int expected = 0;

        int ret = sm.compare("qq", "q");

        assertEquals(expected, ret);
    }

    @Test
    void differentLength_10_7() {
        int expected = 34;

        int ret = sm.compare("jsnvoneifc", "aasqcja");

        assertEquals(expected, ret);
    }

}