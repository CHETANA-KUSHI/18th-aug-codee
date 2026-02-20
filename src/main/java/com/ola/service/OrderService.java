package com.ola.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ola.entity.OrderEntity;
import com.ola.repo.OrderRepo;
import com.ola.request.OrderRequest;

@Service
public class OrderService {
	
	@Autowired
	OrderRepo orderRepo;

	public int createOrde(OrderRequest orderRequest)
	{
		
		OrderEntity orderEntity = new OrderEntity();
		
		orderEntity.setName(orderRequest.getName());
		orderEntity.setPrice(orderRequest.getPrice());
		orderEntity.setStatus(orderRequest.getStatus());
		
		OrderEntity entity = orderRepo.save(orderEntity);
		int orderId= entity.getId();
		
		return orderId;
	}
}
