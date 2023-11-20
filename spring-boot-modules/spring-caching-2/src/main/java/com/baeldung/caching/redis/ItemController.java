package com.baeldung.caching.redis;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {

    private final ItemService itemService;

    public ItemController(ItemService itemService) {
		this.itemService = itemService;
	}

	@GetMapping("/item/{id}")
    public Item getItemById(@PathVariable String id) {
        return itemService.getItemForId(id);
    }

}