package com.baeldung.caching.redis;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class ItemService {

	private ItemRepository itemRepository;

	public ItemService(ItemRepository itemRepository) {
		this.itemRepository = itemRepository;
	}

	@Cacheable(value = "itemCache")
	public Item getItemForId(String id) {
		return itemRepository.findById(id).orElseThrow(RuntimeException::new);
	}

}