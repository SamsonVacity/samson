package com.samson.service;

import com.samson.dto.CommonDto;
import com.samson.entity.SamsonUsers;

public interface UsersService {

    CommonDto logins(String name, String password);

}
