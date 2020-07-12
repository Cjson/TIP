package com.platform.tip.util;

public class ResponseUtil {
    
     /**
      *@Description: TODO
      *@Param: data
      *@Return: ResponseData
      *@time: 2020/7/12 19:59
      */       
    public static <T> ResponseData<T> success(T data){
       return new ResponseData<>(ResponseCode.SUCCESS,data);
    }
    
     /**
      *@Description: TODO
      *@Param:  * @param null
      *@Return: ResponseData
      *@time: 2020/7/12 19:59
      */       
    public static <T> ResponseData<T> success(){
        return new ResponseData<>(ResponseCode.SUCCESS);
    }
    
     /**
      *@Description: TODO
      *@Param:  * @param null
      *@Return: ResponseData
      *@time: 2020/7/12 19:58
      */       
    public static <T> ResponseData<T> param_null(){
        return new ResponseData<>(ResponseCode.PARAM_NULL);
    }
    
     /**
      *@Description: TODO
      *@Param: 
      *@Return: 
      *@time: 2020/7/12 19:54
      */       
    public static <T> ResponseData<T> param_error(){
        return new ResponseData<>(ResponseCode.PARAM_ERROR);
    }

    /**
     *@Description: TODO
     *@Param: 
     *@Return: 
     *@time: 2020/7/12 19:51
     */       
    public static <T> ResponseData<T> param_not_exit(){
        return new ResponseData<>(ResponseCode.PARAM_EXIT);
    }

   
    /**
     *@Description: TODO
     *@Param: 
     *@Return: 
     *@time: 2020/7/12 19:49
    */
    public static <T> ResponseData<T> param_exit(){
        return new ResponseData<>(ResponseCode.PARAM_EXIT);
    }
}
