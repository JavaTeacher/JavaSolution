/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 * |_ Japanese
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 4. 16.
 * </pre>
 *
 * @author : teacher
 * @version : 1.0
 */
public class Japanese extends Person {

	public Japanese(String name) {
		super(name);
	}
	
	public void sayHello() {
		System.out.println("오하이요");
	}
	
	public void sayBye() {
		System.out.println("사요나라");
	}
	
	public String toString() {
		return "저는 일본사람 " + getName() + "입니다.";
	}
	
}
