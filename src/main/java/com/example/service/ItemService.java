package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.domain.Items;
import com.example.repository.ItemMapper;

@Service
@Transactional
public class ItemService {
	
	@Autowired
	private ItemMapper mapper;

	public List<Items> findByItems(){
		return mapper.findByItems();
	}
	
	public List<Items> sortItems(Integer sortValue){
		return mapper.itemSort(Integer.toString(sortValue));
	}
}
