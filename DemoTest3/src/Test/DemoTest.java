package Test;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Random;

import org.junit.jupiter.api.Test;

import Demo.Demo;

public class DemoTest {
	@Test
	public void validTriangle(){
		assertTrue(Demo.isTriangle(3,4,5));
		assertTrue(Demo.isTriangle(5, 12, 13));
        assertTrue(Demo.isTriangle(8, 15, 17));
	}
	
	@Test
	public void InvalidTriangle(){
		assertFalse(Demo.isTriangle(1, 2, 10));
        assertFalse(Demo.isTriangle(2, 3, 6));
        assertFalse(Demo.isTriangle(3, 4, 8));
	}
	
	@Test
	public void DegenerateTriangle1(){
		assertFalse(Demo.isTriangle(1, 1, 2));
        assertFalse(Demo.isTriangle(2, 2, 4));
        assertFalse(Demo.isTriangle(3, 3, 6));
	}
	
	@Test
	public void EquilateralTriangle(){
		assertTrue(Demo.isTriangle(10, 10, 10));
        assertTrue(Demo.isTriangle(7, 7, 7));
        assertTrue(Demo.isTriangle(4, 4, 4));
	}
	@Test
    public void testIsTriangleDegenerateTriangle2() {
        assertFalse(Demo.isTriangle(0, 0, 0));
        assertFalse(Demo.isTriangle(0, 1, 1));
        assertFalse(Demo.isTriangle(1, 0, 1));
        assertFalse(Demo.isTriangle(1, 1, 0));
    }
	
	@Test
    public void testIsTriangle_OneSideZero() {
        assertFalse(Demo.isTriangle(0, 4, 5));
        assertFalse(Demo.isTriangle(3, 0, 5));
        assertFalse(Demo.isTriangle(3, 4, 0));
    }
	
	@Test
    public void testIsTriangle_NegativeSide() {
        assertFalse(Demo.isTriangle(-3, 4, 5));
        assertFalse(Demo.isTriangle(3, -4, 5));
        assertFalse(Demo.isTriangle(3, 4, -5));
    }
	
	@Test
	public void test_main_program_random() { 
		 Random random = new Random();
	        for (int i = 0; i < 100; i++) {
	            int side1 = random.nextInt(100) + 1;
	            int side2 = random.nextInt(100) + 1;
	            int side3 = random.nextInt(100) + 1;
	            boolean result = Demo.isTriangle(side1, side2, side3);
	            if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
	                assertTrue(result);
	            } else {
	                assertFalse(result);
	            }
	        }
	}}