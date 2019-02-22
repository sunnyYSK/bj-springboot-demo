package com.baizhi.bjboot.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("cmfz_admin")
public class User {

    private Integer id;
    private String username;
    private String password;
}
