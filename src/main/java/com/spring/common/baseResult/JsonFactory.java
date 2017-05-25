package com.spring.common.baseResult;

import com.alibaba.fastjson.JSONObject;

import java.io.Serializable;

/**
 * Created by yuxin on 2017/3/15.
 */
public class JsonFactory<T> implements Serializable{

    private static final long serialVersionUID = -2356903913554982739L;

    private final static Integer DEFAULT_SUCCESS_CODE = 10000;
    private final static String DEFAULT_SUCCESS_MSG = "SUCCESS";



    public JSONObject successFactory(){
        JSONObject json = new JSONObject();
        json.put("code",DEFAULT_SUCCESS_CODE);
        json.put("msg",DEFAULT_SUCCESS_MSG);
        json.put("showMsg",DEFAULT_SUCCESS_MSG);
        json.put("success",true);
        return json;
    }

    public JSONObject successFactory(T data){
        JSONObject json = new JSONObject();
        json.put("code",DEFAULT_SUCCESS_CODE);
        json.put("msg",DEFAULT_SUCCESS_MSG);
        json.put("showMsg",DEFAULT_SUCCESS_MSG);
        json.put("success",true);
        json.put("info",data);
        return json;
    }

    public JSONObject successFactory(T data,ResultEnum result){
        JSONObject json = new JSONObject();
        json.put("code",DEFAULT_SUCCESS_CODE);
        json.put("msg",result.getMsg());
        json.put("showMsg",result.getShowMsg());
        json.put("success",true);
        json.put("info",data);
        return json;
    }

    public JSONObject errorFactory(ResultEnum result){
        JSONObject json = new JSONObject();
        json.put("code",result.getCode());
        json.put("msg",result.getMsg());
        json.put("showMsg",result.getShowMsg());
        json.put("success",false);
        return json;
    }

    public JSONObject errorFactory(T data,ResultEnum result){
        JSONObject json = new JSONObject();
        json.put("code",result.getCode());
        json.put("msg",result.getMsg());
        json.put("showMsg",result.getShowMsg());
        json.put("success",false);
        json.put("info",data);
        return json;
    }


}
