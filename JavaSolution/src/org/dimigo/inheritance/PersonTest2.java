/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 * |_ PersonTest
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 4. 16.
 * </pre>
 *
 * @author : teacher
 * @version : 1.0
 */
public class PersonTest2 {

	public static void main(String[] args) {
		
		// 배열을 이용한 다형성 구현
		Person[] people = {
				new Person("Tom"),
				new Korean("홍길동"),
				new Japanese("다나까"),
				new Chinese("왕밍")
		};
		
		for (Person p : people) {
			// 매개변수를 이용한 다형성 구현
			greeting(p);
		}
		
	}

	private static void greeting(Person p) {		
		System.out.println(p);	// toString() 호출
		p.sayHello();
		p.sayBye();
		System.out.println();
	}

}
