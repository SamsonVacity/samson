package com.samson.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonDto implements Serializable {

    private Boolean status;
    private Object data;
    private String message;

}
