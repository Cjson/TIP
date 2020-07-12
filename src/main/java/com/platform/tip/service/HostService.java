package com.platform.tip.service;

import com.platform.tip.entity.Host;

import java.util.List;


public interface HostService {

    //获取host列表
    List<Host> getHostList();

    Host getHostByName(String name);

    int addHost(Host host);

    int updateHost(Host host);
}
