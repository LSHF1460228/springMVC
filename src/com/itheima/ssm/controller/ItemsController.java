package com.itheima.ssm.controller;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.management.Query;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itheima.ssm.pojo.CustomException;
import com.itheima.ssm.pojo.Items;
import com.itheima.ssm.pojo.QueryVo;
import com.itheima.ssm.service.ItemService;


/**  
 * ClassName:ItemsController <br/>  
 * Function:  <br/>  
 * Date:     Nov 28, 2017 7:47:21 PM <br/>       
 */
@Controller
public class ItemsController {

    @Autowired
    private ItemService itemService;
    @RequestMapping("/itemList")
    public ModelAndView  getItemList() throws Exception{
        if (true) {
            throw new CustomException("找不到数据");
        }
       // int i = 1/0;
        List<Items> list = itemService.getItemsList();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("itemList",list);
        modelAndView.setViewName("itemList");
        return modelAndView;
        
    }
   /* @RequestMapping("/itemEdit")
    public ModelAndView itemEdit(HttpServletRequest request ){
        //从request中获得页面传递过来的id
        String strId = request.getParameter("id");
        Integer id = null;
        //如果有id转换为int类型
        if (strId != null && !"".equals(strId)) {
            id = new Integer(strId);
        }else {
            return null;
        }
        
        Items items = itemService.getItemsById(id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("item",items);
        //跳转页面
        modelAndView.setViewName("editItem");
        return modelAndView;
        
    }
    */
    //直接获取id参数,需要保证和页面传递过来的参数名一致
    @RequestMapping("/itemEdit")
    public String itemEdit(Model model ,Integer id ){
       /* //从request中获得页面传递过来的id
        String strId = request.getParameter("id");
        Integer id = null;
        //如果有id转换为int类型
        if (strId != null && !"".equals(strId)) {
            id = new Integer(strId);
        }else {
            return null;
        }*/
        
        Items items = itemService.getItemsById(id);
        model.addAttribute("item",items);
        return "editItem";
        
    }
    
    @RequestMapping("/updateitem")
    public String updateByItem(Items item,HttpServletRequest request) throws Exception {
        //get方法处理乱码的方式(还可以通过修改修改tomcat配置文件/conf/server.xml添加编码与工程编码一致，如下：
        //<Connector URIEncoding="utf-8" connectionTimeout="20000" port="8080" protocol="HTTP/1.1" redirectPort="8443"/>)

       /* String  name = new String(request.getParameter("name").getBytes("ISO8859-1"),"utf-8");
        String  detail = new String(request.getParameter("detail").getBytes("ISO8859-1"),"utf-8");
        item.setName(name);
        item.setDetail(detail);*/
        itemService.updateItem(item);
        return "success";
        
    }
    
    @RequestMapping("/item/queryitem")
    public void  queryitem(QueryVo vo,Integer[] ids){
        System.out.println(ids);
        System.out.println(vo.getItems().getName());
        System.out.println(vo.getItems().getId());
                
    }
}
  
