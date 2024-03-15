package com.tnsif.ShoppingMall.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tnsif.ShoppingMall.entity.ShopOwner;

public interface ShoppingMallRepository extends JpaRepository<ShopOwner, Long>{

	List<ShopOwner> findAll();

	void deleteById(Long id);

	
	

}
