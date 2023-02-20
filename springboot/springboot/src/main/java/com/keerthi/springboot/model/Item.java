package com.keerthi.springboot.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.keerthi.springboot.model.Item;
import com.keerthi.springboot.service.ItemService;

@RestController
@RequestMapping("/item")

public class ItemController {
	

	private ItemService itemService;

	public ItemController(ItemService employeeService) {
		super();
		this.itemService = employeeService;
	}
	
	// build create employee REST API
	@PostMapping()
	public ResponseEntity<Item> saveEmployee(@RequestBody Item item){
		return new ResponseEntity<Item>(itemService.saveItems(item), HttpStatus.CREATED);
	}
	
	@GetMapping("/all")
	public List<Item> getAllItem(){
		return itemService.getAllItems();
	}

}