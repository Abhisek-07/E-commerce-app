//package com.sheryians.major.dto;
//
//import javax.validation.constraints.NotNull;
//
//import com.sheryians.major.model.Order;
//
//public class PlaceOrderDto {
//	
//	private Integer id;
//    private @NotNull Integer userId;
//    private @NotNull Double totalPrice;
//    
//    public PlaceOrderDto() {
//    
//    }
//    
//    public PlaceOrderDto(Order order) {
//        
//    	this.setId(order.getId());
//        this.setUserId(order.getUserId());
//        this.setTotalPrice(order.getTotalPrice());
//    }
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
//	public Double getTotalPrice() {
//		return totalPrice;
//	}
//
//	public void setTotalPrice(Double totalPrice) {
//		this.totalPrice = totalPrice;
//	}
//    
//    
//    
//}
