package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	
	@Test
	public void testLinearSearch() {  
		_00_LinearSearch ls = new _00_LinearSearch();
		//1. use the assertEquals method to test your linear search method.
		String[] sa = {"hello","bye","goodbye","hi"};
		
		assertEquals(_00_LinearSearch.linearSearch(sa,"bye"),1); 
		assertEquals(_00_LinearSearch.linearSearch(sa,"h"),-1);
		assertEquals(_00_LinearSearch.linearSearch(sa,"goodbye"),2);
	}

	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		int[] ia = {1, 12, 25,76, 80,82,93,99,123,657,1234,5445};
		assertEquals(_01_BinarySearch.binarySearch(ia,1, 5445, 25),2); 
		assertEquals(_01_BinarySearch.binarySearch(ia,1, 5445, 98),-1); 
		
		
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
	}
}
