package com.ming.personal.controller;

import com.ming.personal.moudle.dao.impl.CategoryDaoImpl;
import com.ming.personal.util.Resp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NodeController {

    @Autowired
    private CategoryDaoImpl category;

    @RequestMapping(value = "/node", method = RequestMethod.POST)
    public ResponseEntity addNode(String name, String URL, String cateName, String page){
        category.addNode(name, URL, cateName, page);
        return Resp.Resp(HttpStatus.OK, "success");
    }

    @RequestMapping(value = "/node", method = RequestMethod.DELETE)
    public ResponseEntity delNode(String name, String cateName, String page){
        category.delNode(name, cateName, page);
        return Resp.Resp(HttpStatus.OK, "success");
    }

}
