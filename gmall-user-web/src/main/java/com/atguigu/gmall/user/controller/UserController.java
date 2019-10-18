package com.atguigu.gmall.user.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall.bean.UmsMember;
import com.atguigu.gmall.bean.UmsMemberReceiveAddress;
import com.atguigu.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author liuqi
 * @create 2019-09-06 10:18
 */
@Controller
public class UserController {

    @Reference
    UserService userService;

    @RequestMapping("getAllUsers")
    @ResponseBody
    public List<UmsMember> getAllUsers(){

        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        List<UmsMember> list = new ArrayList<UmsMember>();
        list = userService.getAllUsers();
        return list;
    }

    @RequestMapping("getReceiveAddressByMemberId")
    @ResponseBody
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId){
        List<UmsMemberReceiveAddress> receiveAddressList = userService.getReceiveAddressByMemberId(memberId);
        return receiveAddressList;
    }


    @RequestMapping("index")
    @ResponseBody
    public String index(){
        return "index!";
    }

}
