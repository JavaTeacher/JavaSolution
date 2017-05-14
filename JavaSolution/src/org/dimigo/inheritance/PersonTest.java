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
public class PersonTest {

	public static void main(String[] args) {
		Person p = new Person("Tom");
		Korean k = new Korean("홍길동");
		Japanese j = new Japanese("다나까");
		Chinese c = new Chinese("왕밍");
		
		// toString() 호출
		System.out.println(p);
		System.out.println(k);
		System.out.println(j);
		System.out.println(c);
		System.out.println();
		
		// sayHello() 호출
		p.sayHello();
		k.sayHello();
		j.sayHello();
		c.sayHello();
		System.out.println();
		
		// sayBye() 호출
		p.sayBye();
		k.sayBye();
		j.sayBye();
		c.sayBye();

	}
	
}
