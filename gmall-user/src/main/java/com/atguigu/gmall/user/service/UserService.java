package com.atguigu.gmall.user.service;

import com.atguigu.gmall.user.bean.UmsMember;
import com.atguigu.gmall.user.bean.UmsMemberReceiveAddress;

import java.util.List;

/**
 * @author liuqi
 * @create 2019-09-06 10:18
 */
public interface UserService {
    public List<UmsMember> getAllUsers();

    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}
