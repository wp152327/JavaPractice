/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 * 		|_ SmartPhone
 * 
 * 1. Overview : 
 * 2. Date : 2017. 5. 12.
 * </pre>
 * 
 * @author : cordelia273
 * @version : 1.0
 */
public class SmartPhone {
	private String model;
	private String company;
	private int price;

	SmartPhone() {

	}

	SmartPhone(String model, String company, int price) {
		this.model = model;
		this.company = company;
		this.price = price;
	}

	public void turnOn() {
		System.out.println(model + "의 전원을 켭니다.");
	}

	public void turnOff() {
		System.out.println(model + "의 전원을 끕니다.");
	}

	public void pay() {
		System.out.println("결제를 진행합니다.");
	}

	public void useSpecialFunction(SmartPhone phone) {
		if(phone instanceof IPhone) {
			((IPhone) phone).userAirDrop();
		}
		if(phone instanceof Galaxy) {
			((Galaxy) phone).userWirelessCharging();
		}
	}

	public String toString() {
		return "모델명 : " + model + ", 제조사 : " + company + ", 가격 : " + price;
	}
}
