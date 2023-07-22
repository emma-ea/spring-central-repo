package com.emma_ea.item_service.repository;

import com.emma_ea.item_service.entity.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Item, Long> { }
