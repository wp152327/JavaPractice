/**
 * 
 */
package org.dimigo.exception;

/**
 * <pre>
 * org.dimigo.exception
 * 		|_ MovieTest
 * 
 * 1. Overview : 
 * 2. Date : 2017. 6. 2.
 * </pre>
 * 
 * @author : cordelia273
 * @version : 1.0
 */
public class MovieTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie[] movies = { new Movie("에일리언:커버넌트", 15), new Movie("가디언즈 오브 갤럭시", 12) };

		int age = 13;
		for (Movie movie : movies) {
			try {
				movie.butTicket(age);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
