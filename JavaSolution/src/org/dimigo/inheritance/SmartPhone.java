/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_ SmartPhone
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 8. 16.
 * </pre>
 *
 * @author		: teacher
 * @version		: 1.0
 */
public class SmartPhone {
	private String model;
	private String company;
	private int price;
	
	public SmartPhone() {
		
	}
	
	public SmartPhone(String model, String company, int price) {
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
		
	}
	
	public void useSpecialFunction(SmartPhone phone) {
		if(phone instanceof IPhone) {
			// IPhone에만 있는 useAirDrop() 호출하기
			IPhone iphone = (IPhone)phone;
			iphone.useAirDrop();
		} else if(phone instanceof Galaxy) {
			// Galaxy에만 있는 useWirelessCharging() 호출하기
			Galaxy galaxy = (Galaxy)phone;
			galaxy.useWirelessCharging();
		}
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("모델명 : ").append(model).append(", 제조사 : ")
		  .append(company).append(", 가격 : ").append(String.format("%,d", price)).append("원");
		
		return sb.toString();
	}
}
