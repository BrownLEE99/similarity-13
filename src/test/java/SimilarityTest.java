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
        assertThrows(IllegalArgumentException.class,()->{
            sm.compare("123", "abc");
        });
        assertThrows(IllegalArgumentException.class,()->{
            sm.compare("123", "ab1c");
        });
        assertThrows(IllegalArgumentException.class, () -> {
            sm.compare("123", "");
        });
    }

    @Test
    void sameLength() {
        int ret = sm.compare("asd", "qwe");
        assertEquals(60, ret);
    }

}