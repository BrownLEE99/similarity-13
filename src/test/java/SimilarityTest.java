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
}