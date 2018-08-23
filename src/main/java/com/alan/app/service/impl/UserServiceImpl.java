package com.alan.app.service.impl;

import com.alan.app.model.User;
import com.alan.app.mapper.UserMapper;
import com.alan.app.service.UserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author wumt
 * @since 2018-08-15
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
