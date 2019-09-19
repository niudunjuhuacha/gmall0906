package com.atguigu.gmall.service;

import com.atguigu.gmall.bean.UmsMember;
import com.atguigu.gmall.bean.UmsMemberReceiveAddress;

import java.util.List;

/**
 * @author liuqi
 * @create 2019-09-06 10:18
 */
public interface UserService {
    public List<UmsMember> getAllUsers();

    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}
