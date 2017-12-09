package com.itheima.ssm.pojo;

import java.util.List;

/**  
 * ClassName:QueryVo <br/>  
 * Function:  <br/>  
 * Date:     Nov 30, 2017 4:42:50 PM <br/>       
 */
public class QueryVo {

    private Items items;
    private Integer[] ids;
    private List<Items> itemList;
    

    public List<Items> getItemList() {
        return itemList;
    }

    public void setItemList(List<Items> itemList) {
        this.itemList = itemList;
    }

    public Integer[] getIds() {
        return ids;
    }

    public void setIds(Integer[] ids) {
        this.ids = ids;
    }

    public Items getItems() {
        return items;
    }

    public void setItems(Items items) {
        this.items = items;
    }
    
}
  
