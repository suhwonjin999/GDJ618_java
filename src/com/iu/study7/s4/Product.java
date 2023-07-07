package com.iu.study7.s4;

// abstract 지정자: 객체만 못만들뿐이지, 타입명으로 쓸 수 있다.
public abstract class Product {
	
	/* 부모 클래스 : 멤버 변수 선언
	*/
	private String company;
	private String modelName;
	private String color;
	private int price;
	private int point;
	
	public String getCompany() {
		return company;
	}
	
	public void setCompany(String company) {
		this.company = company;
	}
	
	public String getModelName() {
		return modelName;
	}
	
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	public int getPoint() {
		return point;
	}
	
	public void setPoint(int point) {
		this.point = point;
	}
	
	
	

}
