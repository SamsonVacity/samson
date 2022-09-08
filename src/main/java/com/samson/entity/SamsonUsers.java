package com.samson.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;

/**
 * 管理员对象
 * @author su.maosen
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SamsonUsers implements Serializable {

    //管理员id
    private Integer id;
    //管理员名称
    private String name;
    //管理员密码
    private String password;

}
