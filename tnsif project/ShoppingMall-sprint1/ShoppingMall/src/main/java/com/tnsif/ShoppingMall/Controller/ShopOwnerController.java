package com.tnsif.ShoppingMall.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tnsif.ShoppingMall.Repository.ShoppingMallRepository;
import com.tnsif.ShoppingMall.entity.ShopOwner;

@RestController
@RequestMapping("/ShoppingMall")
@CrossOrigin(origins = "http://localhost:4200")
public class ShopOwnerController {
	@Autowired
	private ShoppingMallRepository smRepo;
	@GetMapping("/{id}")
	public ShopOwner getShopOwnerById(@PathVariable Long id)
	{
		return smRepo.findById(id).get();
	}
	@PostMapping
	public ShopOwner createShopOwner(@RequestBody ShopOwner shopowner) {
		return smRepo.save(shopowner);
		
	}
	@PutMapping("/{id}")
	public ShopOwner updateUser(@RequestBody ShopOwner shopowner,@PathVariable Long id)
	{
		shopowner.setId(id);
		return smRepo.save(shopowner);
		
	}
	@DeleteMapping("/{id}")
	public void deleteShopOwner(@PathVariable Long id)
	{
		smRepo.deleteById(id);
	}
	@GetMapping
	public List<ShopOwner> getAllShopOwner(){
		return smRepo.findAll();
	}
	@GetMapping("/Msg")
	public String getMsg()
	{
		return "This is my backend application";
	}
	
	

}
