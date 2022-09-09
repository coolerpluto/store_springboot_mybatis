package com.fan.store.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * 实体类共有的属性
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class BaseEntityProperties implements Serializable {

    private String createdUser;

    private Date createdTime;

    private String modifiedUser;

    private Date modifiedTime;


}
