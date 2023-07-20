package com.emma_ea.item_service.repository;

import com.emma_ea.item_service.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> { }
