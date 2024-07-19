package com.zosh.request;

import java.util.List;



import com.zosh.model.Food;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddCartItemRequest {
	
	
	private Long menuItemId;
	private int quantity;
	private List<String> ingredients;
	
	
	
	

}
