package com.langfundamental.constructors;

public class RestaurantBill {
	int cusid;
	String fooditem;
	int quantity;
	double price;
	RestaurantBill(int cusid,String fooditem,int quantity,double price){
		this.cusid=cusid;
		this.fooditem=fooditem;
		this.price=price;
		this.quantity=quantity;
		
	}

	public static void main(String[] args) {
		RestaurantBill t = new RestaurantBill(101,"biryani",2,150.00);
		t.show();
	}
	void show() {
		System.out.println("cusid="+cusid);
		System.out.println("fooditem="+fooditem);
		System.out.println("price="+price);
		System.out.println("quality="+quantity);
		System.out.println("total price="+price*quantity);
	}

}
