package dad.codesignal;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class AdjacentElementsProductTest {
    private EdgeOfTheOcean eoto;

    @Before
    public void setup() {
        eoto = new EdgeOfTheOcean();
    }

    @Test
    public void test1() {
        int array[] = {3, 6, -2, -5, 7, 3};
        assertEquals(21, eoto.adjacentElementsProduct(array));
    }

    @Test
    public void test2() {
        int array[] = {-1, -2};
        assertEquals(2, eoto.adjacentElementsProduct(array));
    }

    @Test
    public void test3() {
        int array[] = {5, 1, 2, 3, 1, 4};
        assertEquals(6, eoto.adjacentElementsProduct(array));
    }

    @Test
    public void test4() {
        int array[] = {1, 2, 3, 0};
        assertEquals(6, eoto.adjacentElementsProduct(array));
    }

    @Test
    public void test5() {
        int array[] = {9, 5, 10, 2, 24, -1, -48};
        assertEquals(50, eoto.adjacentElementsProduct(array));
    }

    @Test
    public void test6() {
        int array[] = {5, 6, -4, 2, 3, 2, -23};
        assertEquals(30, eoto.adjacentElementsProduct(array));
    }

    @Test
    public void test7() {
        int array[] = {4, 1, 2, 3, 1, 5};
        assertEquals(6, eoto.adjacentElementsProduct(array));
    }

    @Test
    public void test8() {
        int array[] = {-23, 4, -3, 8, -12};
        assertEquals(-12, eoto.adjacentElementsProduct(array));
    }

    @Test
    public void test9() {
        int array[] = {1, 0, 1, 0, 1000};
        assertEquals(0, eoto.adjacentElementsProduct(array));
    }
}
