package com.palace.service.impl;

import com.palace.dao.SysUserMapper;
import com.palace.entity.SysUser;
import com.palace.service.SysUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class SysUserServiceImpl implements SysUserService {
    @Resource
    private SysUserMapper userMapper;

    @Override
    public SysUser getUserById(int userId){
        return this.userMapper.selectByPrimaryKey(userId);
    }
}
