package com.platform.tip.service.imp;

import com.platform.tip.entity.Function;
import com.platform.tip.mapper.FunctionMapper;
import com.platform.tip.service.FunctionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FunctionServiceImp implements FunctionService {

    @Autowired
    private FunctionMapper functionMapper;

    @Override
    public List<Function> getFunctionList() {
        return functionMapper.getFunctionList();
    }

    @Override
    public Integer addFunction(Function function) {
        return functionMapper.addFunction(function);
    }

    @Override
    public Integer updateFunctionById(String functionName,int functionId) {
        return functionMapper.updateFunctionById(functionName,functionId);
    }

    @Override
    public int delFunctionById(int function_id) {
        return functionMapper.delFunctionById(function_id);
    }
}
