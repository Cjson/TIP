package com.platform.tip.service;

import com.platform.tip.entity.Function;

import java.util.List;

public interface FunctionService {

    List<Function> getFunctionList();

    Integer addFunction(Function function);

    Integer updateFunctionById(String functionName,int functionId );

    int delFunctionById(int function_id);
}
