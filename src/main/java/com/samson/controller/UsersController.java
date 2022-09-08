package com.samson.controller;

import com.samson.dto.CommonDto;
import com.samson.entity.SamsonUsers;
import com.samson.service.UsersService;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("api/user")
public class UsersController {

    private final UsersService usersService;

    public UsersController(UsersService usersService) {
        this.usersService = usersService;
    }
    @GetMapping("/login")
    public CommonDto login(@RequestBody SamsonUsers samsonUsers, HttpServletRequest request){
        return null;
    }

}
