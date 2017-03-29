package org.dimigo.oop;

/**
 * << 실습과제 7-1 >>
 * 
 * 자동차 클래스를 작성하기
 *
 * 1. 필드 작성 : 회사명, 모델명, 색상, 최대속도, 가격
 * 2. 메소드 작성 : getter, setter 메소드
 *
 * @author teacher
 * @version 1.0
 *
 */
public class Car {
	private String company;		// 회사명
	private String model;		// 모델명
	private String color;		// 색상
	private int maxSpeed;		// 최대속도
	private int price;			// 가격
	
	/**
	 * @return the company
	 */
	public String getCompany() {
		return company;
	}	
	
	public void setCompany(String newCompany) {
		company = newCompany;
	}
	
	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}
	
	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}
	
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	
	/**
	 * @return the maxSpeed
	 */
	public int getMaxSpeed() {
		return maxSpeed;
	}
	
	/**
	 * @param maxSpeed the maxSpeed to set
	 */
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}
	
	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	
}
