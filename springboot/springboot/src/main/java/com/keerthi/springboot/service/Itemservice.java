package com.keerthi.springboot.service;

import java.util.List;

import com.keerthi.springboot.model.Item;

public interface ItemService {
	
	Item saveItems(Item item);
	
	List<Item> getAllItems();

}
