package com.tedu.sp01.service;

import java.util.Lists;

import com.tedu.sp01.pojo.Item;

public interface ItemService {
	List<Item> getItems(String orderId);
	void decreaseNumbers(List<Item> list);
	
	
	
	
	
}
