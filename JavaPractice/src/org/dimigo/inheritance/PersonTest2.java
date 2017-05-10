/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 * 		|_ PersonTest2
 * 
 * 1. Overview : 
 * 2. Date : 2017. 5. 10.
 * </pre>
 * 
 * @author : cordelia273
 * @version : 1.0
 */
public class PersonTest2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person[] persons = {
			new Person("Tom"),
			new Korean("홍길동"),
			new Japanese("다나카"),
			new Chinese("왕밍")
		};
		
		for (Person person : persons) {
			greeting(person);
		}
	}
	
	private static void greeting(Person person) {
		System.out.println(person);
		person.sayHello();
		person.sayBye();
		System.out.println();
	}
}
