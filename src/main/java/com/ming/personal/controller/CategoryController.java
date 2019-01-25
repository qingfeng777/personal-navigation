package com.ming.personal.controller;

import com.ming.personal.moudle.dao.impl.CategoryDaoImpl;
import com.ming.personal.moudle.entity.Category;
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
        return new ResponseEntity(categoryDao.listCategory(page), HttpStatus.OK);
    }

    @RequestMapping(value = "/category", method = RequestMethod.PUT)
    public ResponseEntity updateCategory(Category category){ // @RequestBody needed?
        categoryDao.updateCategory(category);
        return new ResponseEntity( HttpStatus.OK);
    }

    @RequestMapping(value = "/category", method = RequestMethod.DELETE)
    public ResponseEntity delCategory(){
        return new ResponseEntity(categoryDao.listCategory(""), HttpStatus.OK);
    }

    // 同 page ,同名check
    @RequestMapping(value = "/category", method = RequestMethod.POST)
    public ResponseEntity addCategory(@RequestBody Category category){
        categoryDao.addCategory(category);
        return new ResponseEntity(HttpStatus.OK);
    }

    @RequestMapping(value = "/category/name", method = RequestMethod.GET)
    public ResponseEntity getCategoryByName(String name, String page){
        return new ResponseEntity(categoryDao.getCategoryByName(name, page), HttpStatus.OK);
    }
}
