package com.itheima.ssm.pojo;  
/**  
 * ClassName:CustomException <br/>  
 * Function:  <br/>  
 * Date:     Dec 1, 2017 3:26:29 PM <br/>       
 */
public class CustomException extends Exception{

    /**  
     * serialVersionUID:TODO(用一句话描述这个变量表示什么).  
     * @since JDK 1.6  
     */
    private static final long serialVersionUID = 1L;
   
    
    private String message;


    public CustomException(String message) {
          
        this.message = message;
        
    }


    public String getMessage() {
        return message;
    }


    public void setMessage(String message) {
        this.message = message;
    }


 
    
}
  
