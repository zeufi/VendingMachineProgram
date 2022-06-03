import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ProductTest {
    /**
     * Method under test: {@link Product#valueOf(String)}
     */
    @Test
    void testValueOf() {
        Product actualValueOfResult = Product.valueOf("Water");
        assertEquals(40, actualValueOfResult.getPrice());
        assertEquals(1, actualValueOfResult.getSelectionNumber());
    }

    /**
     * Method under test: {@link Product#valueOf(int)}
     */
    @Test
    void testValueOf2() {
        assertEquals(Product.EMPTY, Product.valueOf(10));
    }

    /**
     * Method under test: {@link Product#valueOf(int)}
     */
    @Test
    void testValueOf3() {
        assertEquals(Product.Water, Product.valueOf(1));
    }

    /**
     * Method under test: {@link Product#valueOf(int)}
     */
    @Test
    void testValueOf4() {
        assertEquals(Product.Crisp, Product.valueOf(2));
    }

    /**
     * Method under test: {@link Product#valueOf(int)}
     */
    @Test
    void testValueOf5() {
        assertEquals(Product.Chocolate, Product.valueOf(3));
    }
}

