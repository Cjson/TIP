package com.platform.tip.entity;


import javax.validation.constraints.NotNull;

import org.springframework.boot.autoconfigure.domain.EntityScan;


import java.util.Date;

@EntityScan
public class Function {

    int id;

    @NotNull(message = "功能id不能为空")
    int function_id;

    @NotNull(message = "功能名字不能为空")
    String function_name;

    String create_by;

    String create_time;

    public int getId() {
        return id;
    }

    public int getFunction_id() {
        return function_id;
    }

    public void setFunction_id(int function_id) {
        this.function_id = function_id;
    }

    public void setFunction_name(String function_name) {
        this.function_name = function_name;
    }

    public String getFunction_name() {
        return function_name;
    }

    public String getCreate_by() {
        return create_by;
    }

    public void setCreate_by(String create_by) {
        this.create_by = create_by;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    @Override
    public String toString() {
        return "Function{" +
                "id=" + id +
                ", function_id=" + function_id +
                ", function_name='" + function_name + '\'' +
                ", create_by='" + create_by + '\'' +
                ", create_time='" + create_time + '\'' +
                '}';
    }
}
