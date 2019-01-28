package com.ming.personal.moudle.dao;

import com.ming.personal.moudle.entity.Category;

import java.util.List;

public interface CategoryDao {
    public void addCategory(Category category);
    public void delCategory(String name, String page);
    public void updateCategory(Category category);
    public List<Category> listCategory(String page);
    public Category getCategoryByName(String name, String page);

    public void addNode(String name, String URL, String cateName, String page);
    public void delNode(String name, String cateName, String page);
}

