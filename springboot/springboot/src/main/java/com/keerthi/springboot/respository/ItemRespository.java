package com.keerthi.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.keerthi.springboot.model.Item;

public interface ItemRepository extends JpaRepository<Item,Long>{

}
