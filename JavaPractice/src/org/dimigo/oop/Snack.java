/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 		|_ Snack
 * 
 * 1. Overview : 
 * 2. Date : 2017. 4. 5.
 * </pre>
 * 
 * @author : cordelia273
 * @version : 1.0
 */
public class Snack {

	private String name;
	private String company;
	private int price;
	private int number;
	
	public Snack() {
		
	}
	
	public Snack(String name, String company, int price, int number) {
		this.name = name;
		this.company = company;
		this.price = price;
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	public int calcPrice() {
		return this.price * this.number;
	}

	@Override
	public String toString() {
		return "Snack [name=" + name + ", company=" + company + ", price=" + price + ", number=" + number + "]";
	}

}
