package com.baeldung.caching.redis;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Item implements Serializable {
	private static final long serialVersionUID = -3685888031068519651L;
	private @Id String id;
	private String description;
	
	public Item() {}
	
	public Item(String id, String description) {
		this.id = id;
		this.description = description;
	}

	public String getId() {
		return id;
	}

	public String getDescription() {
		return description;
	}
}