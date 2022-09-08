package com.samson.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import java.util.Date;

/**
 * 记事本对象
 * @author su.maosen
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Notepad implements Serializable {

    //记事本ID
    private Integer id;
    //记事本主题
    private String theme;
    //记事本内容
    private String content;
    //创建时间
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date createTime;
}
