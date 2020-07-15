package com.platform.tip.mapper;

import com.platform.tip.entity.Host;

import java.util.List;

public interface HostMapper {


     List<Host> getHostList();

     Host getHostByName(String name);

     int addHost(Host host);

     int updateHost(Host host);

     int deleteHost(int id);

}
