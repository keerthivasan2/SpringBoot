package com.keerthi.springboot.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.keerthi.springboot.model.Item;
import com.keerthi.springboot.repository.ItemRepository;

@Service
public class ItemServiceImpl implements ItemService{
	
	
	
	private ItemRepository itemrepo;
	
	public ItemServiceImpl(ItemRepository itemrepo) {
		
		super();
		this.itemrepo = itemrepo;
	}
	
	public Item saveItems(Item item) {
		return itemrepo.save(item);
	}
	
	public List<Item> getAllItems(){
		return itemrepo.findAll();
	}

}