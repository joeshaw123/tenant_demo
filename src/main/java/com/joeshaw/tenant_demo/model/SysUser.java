package com.joeshaw.tenant_demo.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "sys_user")
public class SysUser {
    @TableId(type = IdType.AUTO)
    private long id;
    private String username;
    private String password;
    private String tenantId;

}
