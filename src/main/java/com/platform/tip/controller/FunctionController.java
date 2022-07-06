package com.platform.tip.controller;


import com.platform.tip.entity.Function;
import com.platform.tip.service.FunctionService;
import com.platform.tip.util.ResponseData;
import com.platform.tip.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/function")
public class FunctionController {

    @Autowired
    private FunctionService functionService;

    @GetMapping("/getFunctionList")
    public ResponseData<List<Function>> getFunctionList(){
       return ResponseUtil.success(functionService.getFunctionList());
    }

    @PostMapping("/addFunction")
    public ResponseData<Integer> addFunction(@Valid @RequestBody Function function){
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String current_time = simpleDateFormat.format(date);
        function.setCreate_time(current_time);
        return ResponseUtil.success(functionService.addFunction(function));
    }

    @PostMapping("/updateFunctionById")
    public ResponseData<Integer> updateFunctionById(@RequestBody Function function){
        String functionName = function.getFunction_name();
        int functionId = function.getFunction_id();
        return ResponseUtil.success(functionService.updateFunctionById(functionName,functionId));
    }

    @PostMapping("/delFunctionById")
    public ResponseData<Integer> delFunctionById(int function_id){
        return ResponseUtil.success(functionService.delFunctionById(function_id));
    }

}
