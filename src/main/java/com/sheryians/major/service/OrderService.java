//package com.sheryians.major.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.sheryians.major.dto.PlaceOrderDto;
//import com.sheryians.major.global.GlobalData;
//import com.sheryians.major.model.Product;
//import com.sheryians.major.repository.OrderRepository;
//
//@Service
//public class OrderService {
//	
//	@Autowired
//	OrderRepository orderRepository;
//	
//	@Autowired
//	OrderItemsService orderItemsService;
//	
//	public void placeOrder(int userId) {
//		
//		PlaceOrderDto placeOrderDto = new PlaceOrderDto();
//		placeOrderDto.setUserId(userId);
//		placeOrderDto.setTotalPrice(GlobalData.cart.stream().mapToDouble(Product::getPrice).sum());
//		
//		/*
//		 * int orderId = saveOrder(placeOrderDto, userId);
//		 * 
//		 * List<CartItemDto> cartItemDtoList = GlobalData.cart
//		 */
//	}
//	
//}
