package com.zosh.service;

import java.util.List;

import com.zosh.model.Notification;
import com.zosh.model.Order;
import com.zosh.model.Restaurant;
import com.zosh.model.Client;

public interface NotificationService {
	
	public Notification sendOrderStatusNotification(Order order);
	public void sendRestaurantNotification(Restaurant restaurant, String message);
	public void sendPromotionalNotification(Client client, String message);
	
	public List<Notification> findUsersNotification(Long userId);

}
