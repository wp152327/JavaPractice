/**
 * 
 */
package org.dimigo.exception;

/**
 * <pre>
 * org.dimigo.exception
 * 		|_ Movie
 * 
 * 1. Overview : 
 * 2. Date : 2017. 6. 2.
 * </pre>
 * 
 * @author : cordelia273
 * @version : 1.0
 */
public class Movie {
	private String title;
	private int limitAge;

	public Movie(String title, int limitAge) {
		this.title = title;
		this.limitAge = limitAge;
	}

	public String getTitle() {
		return title;
	}

	public int getLimitAge() {
		return limitAge;
	}

	public void butTicket(int age) throws Exception {
		if (this.limitAge > age) {
			throw new Exception(this.title + "은/는 " + this.limitAge + " 이상 관람가입니다.");
		} else {
			System.out.println(this.title + " 즐감하세요.");
		}
	}
}
