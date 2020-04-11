/**
 * 
 */
package main.java.com.model;

import java.util.Date;

/**
 * @author rk
 *
 */


public class Order {

   private Long orderId;
   private String orderName;
   private int orderQuantity;
   private Date orderDate;
   private String orderFlavour;
   private Double orderBillAmount;
   
   
	public Order() {
		super();
	}

	public Order(Long orderId, String orderName, int orderQuantity, Date orderDate, String orderFlavour, Double orderBillAmount) {
		super();
		this.orderId = orderId;
		this.orderName = orderName;
		this.orderQuantity = orderQuantity;
		this.orderDate = orderDate;
		this.orderFlavour =orderFlavour;
		this.orderBillAmount =orderBillAmount;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public int getOrderQuantity() {
		return orderQuantity;
	}

	public void setOrderQuantity(int orderQuantity) {
		this.orderQuantity = orderQuantity;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public String getOrderFlavour() {
		return orderFlavour;
	}

	public void setOrderFlavour(String orderFlavour) {
		this.orderFlavour = orderFlavour;
	}

	public Double getOrderBillAmount() {
		return orderBillAmount;
	}

	public void setOrderBillAmount(Double orderBillAmount) {
		this.orderBillAmount = orderBillAmount;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderName=" + orderName + ", orderQuantity=" + orderQuantity
				+ ", orderDate=" + orderDate + ", orderFlavour=" + orderFlavour + ", orderBillAmount=" + orderBillAmount
				+ "]";
	}
	
	
	
}
