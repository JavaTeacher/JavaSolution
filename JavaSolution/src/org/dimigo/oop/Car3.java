package org.dimigo.oop;

/**
 * << 실습과제 7-3 >>
 * 
 * this를 이용하여 자동차 클래스의 생성자 작성하기
 *
 * 1. 필드 작성 : 회사명, 모델명, 색상, 최대속도, 가격
 * 2. 메소드 작성 : getter 메소드
 * 3. 생성자 작성 : 기본생성자, 매개변수 5개/4개/3개짜리 생성자
 *
 * @author teacher
 * @version 1.0
 *
 */
public class Car3 {
	private String company;		// 회사명
	private String model;		// 모델명
	private String color;		// 색상
	private int maxSpeed;		// 최대속도
	private int price;			// 가격
	
	// 기본 생성자
	public Car3() {
	}
	
	// 매개변수 5개짜리 생성자
	public Car3(String company, String model, String color, int maxSpeed, int price) {
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.price = price;
	}	
	
	// 매개변수 4개짜리 생성자
	public Car3(String company, String model, String color, int maxSpeed) {
		// 바로 위 생성자 호출
		this(company, model, color, maxSpeed, 0);
	}

	// 매개변수 3개짜리 생성자
	public Car3(String company, String model, String color) {
		// 바로 위 생성자 호출
		this(company, model, color, 0);
	}
		
	public String getCompany() {
		return company;
	}

	public String getModel() {
		return model;
	}

	public String getColor() {
		return color;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public int getPrice() {
		return price;
	}

	/**
	 * @param company the company to set
	 */
	public void setCompany(String company) {
		this.company = company;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @param maxSpeed the maxSpeed to set
	 */
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	
}
