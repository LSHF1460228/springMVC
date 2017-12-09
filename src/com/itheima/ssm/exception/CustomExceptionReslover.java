package com.itheima.ssm.exception;


import java.io.PrintWriter;
import java.io.StringWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import com.itheima.ssm.pojo.CustomException;

/**  
 * ClassName:CustomExceptionReslover <br/>  
 * Function:  <br/>  
 * Date:     Dec 1, 2017 3:38:54 PM <br/>       
 */
public class CustomExceptionReslover implements HandlerExceptionResolver{

    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response,
            Object handler, Exception ex) {
    String message2 = "";
     if (ex instanceof CustomException) {
       CustomException message = (CustomException) ex;
       message2 = message.getMessage();
    }else {
        ex.printStackTrace();
        StringWriter  out = new StringWriter();
        PrintWriter printWriter = new  PrintWriter(out);
        ex.printStackTrace(printWriter);
        String message = out.toString();
        System.out.println("写入日志文件:"+message);
        System.out.println("发送邮件短信了");
        message2 = "您的网咯有问题请重试!";
    }
     ModelAndView modelAndView = new ModelAndView();
     modelAndView.addObject("message",message2);
     modelAndView.setViewName("error");
        return modelAndView;
    }

}
  
