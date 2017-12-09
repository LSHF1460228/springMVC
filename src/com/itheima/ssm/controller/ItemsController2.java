package com.itheima.ssm.controller;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.management.Query;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.itheima.ssm.pojo.Items;
import com.itheima.ssm.pojo.QueryVo;
import com.itheima.ssm.service.ItemService;

import jdk.nashorn.internal.ir.RuntimeNode.Request;

/**  
 * ClassName:ItemsController <br/>  
 * Function:  <br/>  
 * Date:     Nov 28, 2017 7:47:21 PM <br/>       
 */
@Controller
public class ItemsController2 {

    @Autowired
    private ItemService itemService;
  
  
   
    @RequestMapping("/editItemSubmit_RequestJson")
    @ResponseBody
    public   Items recJson(@RequestBody Items items){
        System.out.println(items);
        return items;
    }
}
  
