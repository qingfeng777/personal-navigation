package com.ming.personal.controller;

import com.ming.personal.moudle.dao.impl.CategoryDaoImpl;
import com.ming.personal.moudle.entity.Category;
import com.ming.personal.util.Logger;
import com.ming.personal.util.Resp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CategoryController {

    @Autowired
    private CategoryDaoImpl categoryDao;

    @RequestMapping(value = "/category", method = RequestMethod.GET)
    public ResponseEntity getCategory(String page){
        return Resp.Resp(HttpStatus.OK, categoryDao.listCategory(page));
    }

    @RequestMapping(value = "/category", method = RequestMethod.PUT)
    public ResponseEntity updateCategory(Category category){ // @RequestBody needed?
        categoryDao.updateCategory(category);
        return Resp.Resp(HttpStatus.OK, "success");
    }

    @RequestMapping(value = "/category", method = RequestMethod.DELETE)
    public ResponseEntity delCategory(String name, String page){
        categoryDao.delCategory(name, page);
        return Resp.Resp(HttpStatus.OK, "success");
    }

    // 同 page ,同name check
    @RequestMapping(value = "/category", method = RequestMethod.POST)
    public ResponseEntity addCategory(@RequestBody Category category){
        Category oldCate = categoryDao.getCategoryByName(category.getName(), category.getPage());
        if (oldCate != null){
            return Resp.Resp(HttpStatus.CONFLICT, Logger.errLog("category name already exist ."));
        }
        categoryDao.addCategory(category);
        return Resp.Resp(HttpStatus.OK, "success");
    }

    @RequestMapping(value = "/category/name", method = RequestMethod.GET)
    public ResponseEntity getCategoryByName(String name, String page){
        return new ResponseEntity(categoryDao.getCategoryByName(name, page), HttpStatus.OK);
    }
}
