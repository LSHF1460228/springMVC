package com.itheima.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itheima.ssm.mapper.ItemsMapper;
import com.itheima.ssm.pojo.Items;
import com.itheima.ssm.pojo.ItemsExample;
import com.itheima.ssm.service.ItemService;

/**  
 * ClassName:ItemServiceImpl <br/>  
 * Function:  <br/>  
 * Date:     Nov 28, 2017 7:33:16 PM <br/>       
 */
@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemsMapper itemsMapper;
    @Override
    public List<Items> getItemsList() {
      //1.需要注入mapper(由sprin管理的)
        //2.创建exmaple对象  对象的作用就是：用于设置各种查询的条件
      ItemsExample example = new ItemsExample();
     // 3.设置查询条件 
      //4.执行查询 
      List<Items> list = itemsMapper.selectByExample(example);
        return list;
    }
    @Override
    public Items getItemsById(Integer id) {
          
        Items items = itemsMapper.selectByPrimaryKey(id);
        return items;
    }
    @Override
    public void updateItem(Items item) {
          
        itemsMapper.updateByPrimaryKey(item);
        
    }
 
        
    
        

}
  
