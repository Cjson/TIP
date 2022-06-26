package com.platform.tip.entity;


public class Host {

    private Integer id;
    private String ip;
    private String name;

    public void setIp(String ip) {
        this.ip = ip;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIp() {
        return ip;
    }

    public String getName() {
        return name;
    }
}

