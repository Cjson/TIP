package com.platform.tip.controller;

import com.platform.tip.entity.Host;
import com.platform.tip.service.imp.HostServiceImp;
import com.platform.tip.util.ResponseData;
import com.platform.tip.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("host")
public class HostController {

    @Autowired
    private HostServiceImp hostServiceImp;


    /**
     *@MethodName: getHostList
    *@Description: TODO
    *@Param: []
    *@Return: com.platform.tip.util.ResponseData
    * */
    @GetMapping("gethostlist")
    public ResponseData<List<Host>> getHostList(){
        return ResponseUtil.success(hostServiceImp.getHostList());
    }


    /**
     *@MethodName: getHostByName
    *@Description: TODO
    *@Param: [name]
    *@Return: com.platform.tip.util.ResponseData
    */
    @GetMapping("gethostbyname")
    public ResponseData<Host> getHostByName(String name){
        if (StringUtils.isEmpty(name)){
            return ResponseUtil.param_null();
        }
        return ResponseUtil.success(hostServiceImp.getHostByName(name));
    }

    /**
     *@MethodName: addHost
    *@Description: TODO
    *@Param: [host]
    *@Return: com.platform.tip.util.ResponseData
    */
    @GetMapping("addhost")
    public ResponseData<Integer> addHost(Host host){
        if(StringUtils.isEmpty(host.getIp()) && StringUtils.isEmpty(host.getName())){
            return ResponseUtil.param_null();
        }
        return ResponseUtil.success(hostServiceImp.addHost(host));
    }

    /**
     *@MethodName: updateHost
    *@Description: TODO
    *@Param: [host]
    *@Return: com.platform.tip.util.ResponseData
    */
    @GetMapping("updatehost")
    public ResponseData<Integer> updateHost(Host host){
        if(StringUtils.isEmpty(host.getIp()) || StringUtils.isEmpty(host.getName())){
            return ResponseUtil.param_null();
        }
        return ResponseUtil.success(hostServiceImp.updateHost(host));
    }

     /**
       * @MethodName: deleteHost
       *@Description: TODO
       *@Param: [id]
       *@Return: com.platform.tip.util.ResponseData
       *@time: 2020/7/16 0:42
      */
    public ResponseData<Integer> deleteHost(int id){
        if (StringUtils.isEmpty(String.valueOf(id))){
            return ResponseUtil.param_null();
        }
        return ResponseUtil.success();
    }
}
