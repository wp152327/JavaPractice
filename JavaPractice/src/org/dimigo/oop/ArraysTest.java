/**
 * 
 */
package org.dimigo.oop;

import java.util.Arrays;

/**
 * <pre>
 * org.dimigo.oop
 * 		|_ ArraysTest
 * 
 * 1. Overview : 
 * 2. Date : 2017. 4. 10.
 * </pre>
 * 
 * @author : cordelia273
 * @version : 1.0
 */
public class ArraysTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] src = {"MS", "Apple", "Lenovo", "구보 5바퀴", "HP"};
		
		// output
		System.out.println(Arrays.toString(src));
		
		// copy
		String[] dest = Arrays.copyOf(src, 3);
		System.out.println(Arrays.toString(dest));
	}

}
