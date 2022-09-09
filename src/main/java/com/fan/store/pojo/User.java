package com.fan.store.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 用户类
 */
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Data
public class User extends BaseEntityProperties implements Serializable {

    private Integer uid;

    private String username;

    private String password;

    private String salt;

    private String phone;

    private String email;

    private Integer gender;

    private String avatar;

    private Integer isDeleted;

}
