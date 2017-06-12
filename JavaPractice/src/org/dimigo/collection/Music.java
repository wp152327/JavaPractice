/**
 * 
 */
package org.dimigo.collection;

/**
 * <pre>
 * org.dimigo.collection
 * 		|_ Music
 * 
 * 1. Overview : 
 * 2. Date : 2017. 6. 5.
 * </pre>
 * 
 * @author : cordelia273
 * @version : 1.0
 */
public class Music {
	private String title;
	private String singer;
	
	public Music(String title, String singer) {
		this.title = title;
		this.singer = singer;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public String getSinger() {
		return this.singer;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setSinger(String singer) {
		this.singer = singer;
	}
	
	public String toString() {
		return this.title+" ("+this.singer+")";
	}
}
