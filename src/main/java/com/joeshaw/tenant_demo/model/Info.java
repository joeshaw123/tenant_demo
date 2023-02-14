package com.joeshaw.tenant_demo.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("info")
public class Info {
    @TableId(type = IdType.AUTO)
    private long id;
    private String info;
    private String tenantId;
}
