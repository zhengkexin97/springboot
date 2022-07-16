package com.itzkx.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itzkx.daomain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper //定义为数据层的接口
public interface BookDao extends BaseMapper<Book> {

}
