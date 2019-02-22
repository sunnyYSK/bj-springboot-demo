package com.baizhi.bjboot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * (Admin)实体类
 *
 * @author makejava
 * @since 2019-02-20 10:49:13
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Admin implements Serializable {

    private Integer id;

    private String username;

    private String password;


}