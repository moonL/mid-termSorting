import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class TestSort {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		Sorting sort = new Sorting();
		int[] a = {2, 9, 5, 6, 7, 8};
		int[] b = {2, 5, 6, 7, 8, 9};
		boolean isRight = sort.isSorted(a);
		assertEquals(false, isRight);

		sort.insertionSort(a);
		assertArrayEquals(b, a);
		isRight = sort.isSorted(a);
		assertEquals(true, isRight);
	}
	
	
	@Test
	public void test2() {
		Sorting sort = new Sorting();
		int[] a = {2, 9, 5, 6, 7, 8};
		int[] b = {2, 5, 6, 7, 8, 9};
		
		new Sorting().quicksort(a);
		assertArrayEquals(b, a);
		
		int[] c = {6, 8, 7, 9, 5, 4, 3};
		int[] d = {3, 4, 5, 6, 7, 8, 9};
		new Sorting().quicksort(c);
		assertArrayEquals(d, c);
		
		int[] e = {5, 7, 2, 3, 4};
		int[] f = {2, 3, 4, 5, 7};
		new Sorting().quicksort(e);
		assertArrayEquals(e, f);
		
		
	}
	@Test
	public void test3() {
		Sorting sort = new Sorting();
		int[] a = {2, 9, 5, 6, 7, 8, 4, 3, 25, 24, 12};
		int[] b = {2, 3, 4, 5, 6, 7, 8, 9, 12, 24, 25};
		
		sort.quicksort(a);
		assertArrayEquals(b, a);
		
		int[] c = {18, 9, 5, 6, 7, 8, 4, 3, 25, 24, 12};
		int[] d = {3, 4, 5, 6, 7, 8, 9, 12, 18, 24, 25};
		
		sort.quicksort(c);
		assertArrayEquals(d, c);
		
		int[] e = {18, 9, 5, 6, 7, 8, 4, 3, 25, 24, 2};
		int[] f = {2, 3, 4, 5, 6, 7, 8, 9, 18, 24, 25};
		
		sort.quicksort(e);
		assertArrayEquals(f, e);
		
	}
	@Test
	public void test6() {
		Sorting sort = new Sorting();
		Object[] a = {2, 9};
		Object[] b = {9, 2};
		new Sorting().swapReferences(a, 0, 1);
		assertArrayEquals(b, a);
		
		
	}

}
