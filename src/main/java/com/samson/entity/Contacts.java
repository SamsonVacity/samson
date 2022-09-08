package com.samson.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;

/**
 * ；联系人对象
 * @author su.maosen
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Contacts implements Serializable {

    //联系人id
    private Integer id;
    //联系人姓名
    private String name;
    //联系人电话
    private String tel;
    //联系人关系
    private String relationship;
}
