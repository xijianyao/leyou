package com.leyou.item.service;

import com.leyou.item.pojo.Item;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class ItemService {
    public Item SaveItem(Item item){
        Integer id = new Random().nextInt(100);
        item.setId(id);
        return item;
    }

}
