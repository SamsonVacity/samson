package com.samson.service;

import com.samson.dao.SamsonUsersDao;
import com.samson.dto.CommonDto;
import com.samson.entity.SamsonUsers;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UsersServiceImpl implements UsersService{

    private final SamsonUsersDao samsonUsersDao;

    public UsersServiceImpl(SamsonUsersDao samsonUsersDao){
        this.samsonUsersDao=samsonUsersDao;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public CommonDto logins(String name, String password) {
        CommonDto result = new CommonDto();
        if(name == null || password == null){
            result.setMessage("用户名或密码不能为空");
            return result;
        }
        name=name.trim();
        SamsonUsers names = samsonUsersDao.selectByName(name);
        if (names.getName() == null){
            result.setMessage("该用户名不存在");
            return result;
        }
        if (!names.getPassword().equals(password)){
            result.setMessage("密码错误");
            return result;
        }
        names.setName(null);
        names.setPassword(null);
        result.setStatus(true);
        result.setData(names);
        return result;
    }
}
