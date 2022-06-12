//package com.sheryians.major.model;
//
//import java.util.Date;
//import java.util.List;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.OneToMany;
//import javax.persistence.Table;
//import javax.validation.constraints.NotBlank;
//
//import com.sheryians.major.global.GlobalData;
//
//@Entity
//@Table(name="order")
//public class Order {
//	
//	@Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Integer id;
//	
//	@Column(name = "user_id")
//    private @NotBlank Integer userId;
//	
//	@Column(name = "created_date")
//    private Date createdDate;
//	
//	@Column(name = "total_price")
//    private Double totalPrice;
//	
//	@OneToMany(cascade = CascadeType.ALL,orphanRemoval = true)
//    @JoinColumn(name = "order_id",referencedColumnName = "id",insertable = false,updatable = false)
//    private List<OrderItem> orderItems;
//	
//	@ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "user_id", referencedColumnName = "id", insertable = false, updatable = false)
//    private User user;
//	
//	public Order() {
//    
//	}
//
//	public Order(Integer userId) {
//		super();
//		this.userId = userId;
//		this.createdDate = new Date();
//		this.totalPrice = GlobalData.cart.stream().mapToDouble(Product::getPrice).sum();
//	}
//
//	public Integer getId() {
//		return id;
//	}
//
//	public void setId(Integer id) {
//		this.id = id;
//	}
//
//	public Integer getUserId() {
//		return userId;
//	}
//
//	public void setUserId(Integer userId) {
//		this.userId = userId;
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
//	public Double getTotalPrice() {
//		return totalPrice;
//	}
//
//	public void setTotalPrice(Double totalPrice) {
//		this.totalPrice = totalPrice;
//	}
//
//	public List<OrderItem> getOrderItems() {
//		return orderItems;
//	}
//
//	public void setOrderItems(List<OrderItem> orderItems) {
//		this.orderItems = orderItems;
//	}
//
//	public User getUser() {
//		return user;
//	}
//
//	public void setUser(User user) {
//		this.user = user;
//	}
//	
//	
//	
//	
//
//	
//}
