//package com.sheryians.major.model;
//
//import java.util.Date;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.OneToOne;
//import javax.persistence.Table;
//import javax.validation.constraints.NotNull;
//
//@Entity
//@Table(name = "orderitems")
//public class OrderItem {
//	
//	@Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Integer orderItemId;
//	
//	@Column(name = "productId")
//    private @NotNull Long productId;
//	
//	@Column(name = "price")
//    private @NotNull double price;
//	
//	@Column(name = "order_id")
//    private Integer orderId;
//	
//	@Column(name = "created_date")
//    private Date createdDate;
//	
//	@ManyToOne
//    @JoinColumn(name = "order_id",referencedColumnName = "id",insertable = false,updatable = false)
//    private Order order;
//	
//	@OneToOne
//    @JoinColumn(name = "productId",referencedColumnName = "id",insertable = false,updatable = false)
//    private Product product;
//	
//	public OrderItem(){
//		
//	}
//
//	public OrderItem(@NotNull long productId, @NotNull double price, Integer orderId) {
//		super();
//		this.productId = productId;
//		this.price = price;
//		this.orderId = orderId;
//		this.createdDate = new Date();
//	}
//
//	public Integer getOrderItemId() {
//		return orderItemId;
//	}
//
//	public void setOrderItemId(Integer orderItemId) {
//		this.orderItemId = orderItemId;
//	}
//
//	public long getProductId() {
//		return productId;
//	}
//
//	public void setProductId(long productId) {
//		this.productId = productId;
//	}
//
//	public double getPrice() {
//		return price;
//	}
//
//	public void setPrice(double price) {
//		this.price = price;
//	}
//
//	public Integer getOrderId() {
//		return orderId;
//	}
//
//	public void setOrderId(Integer orderId) {
//		this.orderId = orderId;
//	}
//
//	public Date getCreatedDate() {
//		return createdDate;
//	}
//
//	public void setCreatedDate(Date createdDate) {
//		this.createdDate = createdDate;
//	}
//
//	public Order getOrder() {
//		return order;
//	}
//
//	public void setOrder(Order order) {
//		this.order = order;
//	}
//
//	public Product getProduct() {
//		return product;
//	}
//
//	public void setProduct(Product product) {
//		this.product = product;
//	}
//	
//	
//	
//}
