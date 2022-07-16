package com.itzkx.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.itzkx.daomain.Book;

public interface IBookService extends IService<Book> {
    Boolean modify(Book book);

    Boolean delete(Integer id);

    IPage<Book> getPage(Integer currentPage, int pageSize);
}
