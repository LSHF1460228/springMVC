package com.itheima.ssm.service;

import java.util.List;

import com.itheima.ssm.pojo.Items;

/**  
 * ClassName:ItemService <br/>  
 * Function:  <br/>  
 * Date:     Nov 28, 2017 7:32:39 PM <br/>       
 */
public interface ItemService {

    List<Items> getItemsList();
    
    Items getItemsById(Integer id);
    
    void updateItem(Items item);
}
  
