/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_ SmartPhoneTest
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 8. 16.
 * </pre>
 *
 * @author		: teacher
 * @version		: 1.0
 */
public class SmartPhoneTest {

	public static void main(String[] args) {
		// 배열을 이용한 다형성으로 구현
		SmartPhone[] phones = {
				new IPhone("iPhone 7", "애플", 900000),
				new Galaxy("갤럭시 S8", "삼성", 800000)
		};
		
		for(SmartPhone phone : phones) {
			System.out.println(phone);			
			phone.turnOn();
			// 자식클래스에서 오버라이딩한 pay()가 실행됨
			phone.pay();
			
			// IPhone 또는 Galaxy에 있는 특별 기능 사용하기
			phone.useSpecialFunction(phone);
			
			phone.turnOff();
			System.out.println();
		}
		
	}

}
