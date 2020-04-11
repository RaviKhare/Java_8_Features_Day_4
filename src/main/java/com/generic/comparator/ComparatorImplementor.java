package main.java.com.generic.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import main.java.com.model.Order;


public class ComparatorImplementor {

	public static List<Order> getOrderList(){
		  List<Order> orderList = new ArrayList<Order>();
		  orderList.add(new Order(2323l,"Non veg Biryani", 9, new Date(), "spicy", 2342.00));
		  orderList.add(new Order(2423l,"Tandoori kabab",12, new Date(), "spicy mix", 4362.00));
		  orderList.add(new Order(6623l,"Special meal for 2", 4, new Date(), "mild spicy", 892.00));
		  orderList.add(new Order(3343l,"Panee tikka", 8, new Date(), "hot roasted", 1700.00));
		return orderList;
		
	}
	
	public static void main(String[] str) {
		
		// sort order by order name
		List<Order> orderListByName = getOrderList();
		Collections.sort(orderListByName, (o1, o2)-> o1.getOrderName().compareTo(o2.getOrderName()) );
	
		// sort order by order name
		List<Order> orderListByOrderBill = getOrderList();
		Collections.sort(orderListByOrderBill, (o1, o2)-> o1.getOrderBillAmount().compareTo(o2.getOrderBillAmount()));
		}
	
	}

