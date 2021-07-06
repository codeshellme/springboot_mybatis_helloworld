package com.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;
import java.util.Map;

@Mapper
public interface TestDao {
    /**
     * 执行 SQL 语句， 可多条拼接
     * @param sql sql 语句
     */
    @Update("${sql}")
    void executeSql(String sql);

    @Select("SELECT count(*) FROM sys_info")
    int sysInfoCount();

    @Select("SELECT * FROM sys_info limit 1")
    Map<String, Object> sysInfo();

    @Select("SELECT * FROM bas_doctor")
    List<Map<String, Object>> bas_doctor();

    List<Map<String, Object>> bas_doctor2();
}
