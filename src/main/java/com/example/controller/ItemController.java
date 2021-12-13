package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.Items;
import com.example.service.ItemService;

@Controller
@RequestMapping("/item")
public class ItemController {

	@Autowired
	private ItemService service;
	
	@RequestMapping("/list")
	public String itemList(Integer sortValue,String searchName ,Model model) {
		
		if(searchName != null) {
			String key = searchName.replaceAll("　", " ").replaceAll("\\s{2,}", " ").trim();
			String[] keywords = key.split(" ");
			List<Items> itemList = service.searchItems(keywords);
			model.addAttribute("itemList",itemList);
			return "item-list";
		}
		
		if(sortValue == null) {
			List<Items> itemList =  service.findByItems();
			model.addAttribute("itemList",itemList);
		} else {
			List<Items> itemList = service.sortItems(sortValue);
			model.addAttribute("itemList", itemList);
		}
		
		return "item-list";
	}
	
	
}
