package com.sogrp.mapper;

import com.sogrp.model.Todo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface TodoMapper {
    @Select("SELECT * FROM todos WHERE id = #{id}")
    Todo findById(@Param("id") Integer id);
}
