package com.joeshaw.tenant_demo.mapper;

import com.baomidou.mybatisplus.annotation.InterceptorIgnore;
import com.baomidou.mybatisplus.annotation.SqlParser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.joeshaw.tenant_demo.model.Info;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface InfoMapper extends BaseMapper<Info> {


    //    @SqlParser(filter = true)  //3.4之前
    @InterceptorIgnore(tenantLine = "true")
    @Select("select * from info where info = #{info}")
    public List<Info> getBy(String info);
}
