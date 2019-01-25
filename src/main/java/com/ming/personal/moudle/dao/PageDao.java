package com.ming.personal.moudle.dao;

import com.ming.personal.moudle.entity.Page;

public interface PageDao {
    public Page getPageByName(String name);
    public void addPage(String name);
}
