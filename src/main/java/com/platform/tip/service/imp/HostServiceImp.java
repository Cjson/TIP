package com.platform.tip.service.imp;

import com.platform.tip.entity.Host;
import com.platform.tip.mapper.HostMapper;
import com.platform.tip.service.HostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HostServiceImp implements HostService {

    @Autowired
    private HostMapper hostMapper;

    /**
     *@MethodName: getHostByName
    *@Description: TODO
    *@Param: [name]
    *@Return: com.platform.tip.entity.Host
    */
    @Override
    public List<Host> getHostList() {
        return hostMapper.getHostList();
    }

    /**
     *@MethodName: addHost
    *@Description: TODO
    *@Param: [host]
    *@Return: int
    */
    @Override
    public Host getHostByName(String name) {
        return hostMapper.getHostByName(name);
    }

   /**
    *@MethodName: updateHost
   *@Description: TODO
   *@Param: [host]
   *@Return: int
   */
    @Override
    public int addHost(Host host) {
        return hostMapper.addHost(host);
    }

    /**
     *@MethodName: updateHost
    *@Description: TODO
    *@Param: [host]
    *@Return: int
     */
    @Override
    public int updateHost(Host host) {
        return hostMapper.updateHost(host);
    }
}
