package com.platform.tip.mapper;

import com.platform.tip.entity.Function;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FunctionMapper {

    List<Function> getFunctionList();

    Integer addFunction(@Param("Function") Function function);

    Integer updateFunctionById(String functionName,int functionId);

    int delFunctionById(int function_id);
}
