package org.dimigo.oop;

/**
 * << 실습과제 7-3 >>
 * 
 * 다양한 생성자를 이용하여 자동차 객체 초기화하기
 *
 * 1. 매개변수 5개짜리 생성자를 호출하여 현대자동차 객체 초기화
 *    매개변수 4개짜리 생성자를 호출하여 기아자동차 객체 초기화
 *    매개변수 3개짜리 생성자를 호출하여 삼성자동차 객체 초기화
 * 2. getter 메소드를 호출하여 객체의 필드 값 출력
 *
 * @author teacher
 * @version 1.0
 *
 */
public class CarTest3 {

	public static void main(String[] args) {
		System.out.println("<< 자동차 목록 >>");

		// 매개변수 5개짜리 생성자를 호출하여 객체 초기화
		Car3 genesis = new Car3("현대자동차", "제네시스", "검정색", 225, 50000000);
		
		// 매개변수 4개짜리 생성자를 호출하여 객체 초기화
		Car3 k7 = new Car3("기아자동차", "K7", "흰색", 246);
		
		// 매개변수 3개짜리 생성자를 호출하여 객체 초기화
		Car3 sm7 = new Car3("삼성자동차", "SM7", "회색");
		
		System.out.println("제조사명 : " + genesis.getCompany());
		System.out.println("모델명 : " + genesis.getModel());
		System.out.println("색상 : " + genesis.getColor());
		System.out.println("최대속도 : " + genesis.getMaxSpeed() + "km");
		System.out.println("가격 : " + String.format("%,d", genesis.getPrice()) + "원");
		System.out.println();
		
		System.out.println("제조사명 : " + k7.getCompany());
		System.out.println("모델명 : " + k7.getModel());
		System.out.println("색상 : " + k7.getColor());
		System.out.println("최대속도 : " + k7.getMaxSpeed() + "km");
		System.out.println("가격 : " + String.format("%,d", k7.getPrice()) + "원");
		System.out.println();
		
		System.out.println("제조사명 : " + sm7.getCompany());
		System.out.println("모델명 : " + sm7.getModel());
		System.out.println("색상 : " + sm7.getColor());
		System.out.println("최대속도 : " + sm7.getMaxSpeed() + "km");
		System.out.println("가격 : " + String.format("%,d", sm7.getPrice()) + "원");
		System.out.println();
		
	}

}
