/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 		|_ CarTest
 * 
 * 1. Overview : 
 * 2. Date : 2017. 3. 23.
 * </pre>
 * 
 * @author : cordelia273
 * @version : 1.0
 */
public class CarTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("<< 자동차 목록 >>");
		
		Car car1 = new Car();

		car1.setCompany("현대자동차");
		car1.setModel("제네시스");
		car1.setColor("검정색");
		car1.setMaxSpeed(225);
		car1.setPrice(50000000);

		printCar(car1);

		Car car2 = new Car();

		car2.setCompany("기아자동차");
		car2.setModel("K7");
		car2.setColor("흰색");
		car2.setMaxSpeed(246);
		car2.setPrice(40000000);

		printCar(car2);

		Car car3 = new Car();

		car3.setCompany("삼성자동차");
		car3.setModel("SM7");
		car3.setColor("회색");
		car3.setMaxSpeed(200);
		car3.setPrice(38000000);

		printCar(car3);
		
		Car2 car4 = new Car2();
		
		printCar2(car4);
	}

	public static void printCar(Car car) {
		System.out.println("제조사명 : " + car.getCompany());
		System.out.println("모델명 : " + car.getModel());
		System.out.println("색상 : " + car.getColor());
		System.out.println("최대속도 : " + car.getMaxSpeed() + "km");
		System.out.printf("가격 : %,d원\n", car.getPrice());
		System.out.println();
	}
	
	public static void printCar2(Car2 car) {
		System.out.println("제조사명 : " + car.getCompany());
		System.out.println("모델명 : " + car.getModel());
		System.out.println("색상 : " + car.getColor());
		System.out.println("최대속도 : " + car.getMaxSpeed() + "km");
		System.out.printf("가격 : %,d원\n", car.getPrice());
		System.out.println();
	}

}
