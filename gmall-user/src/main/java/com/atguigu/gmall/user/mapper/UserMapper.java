package com.atguigu.gmall.user.mapper;

import com.atguigu.gmall.user.bean.UmsMember;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @author liuqi
 * @create 2019-09-06 10:18
 */

public interface UserMapper extends Mapper<UmsMember> {
    public List<UmsMember> selectAllUsers();
}
