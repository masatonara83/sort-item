package com.example.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.domain.Items;

@Mapper
public interface ItemMapper {

	public List<Items> findByItems();
	
	public List<Items> itemSort(String sortValue);
	
	public List<Items> itemSearch(@Param("keywords") String[] keywords);
}
