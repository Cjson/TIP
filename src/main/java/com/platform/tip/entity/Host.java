package com.platform.tip.entity;


import lombok.Data;

@Data
public class Host {

    private Integer id;
    private String ip;
    private String name;

    public String getIp() {
        return ip;
    }

    public String getName() {
        return name;
    }
}

