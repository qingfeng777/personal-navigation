package com.ming.personal.controller;

import com.ming.personal.moudle.dao.impl.SiteDaoImpl;
import com.ming.personal.moudle.entity.Node;
import com.ming.personal.util.Resp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SiteController {

    @Autowired
    private SiteDaoImpl site;

    @RequestMapping(value = "/site/search", method = RequestMethod.POST)
    public ResponseEntity addSearch(Node node){
        site.addSearch(node.getName(), node.getURL());
        return Resp.Resp(HttpStatus.OK, "success");
    }

    @RequestMapping(value = "/site/search", method = RequestMethod.DELETE)
    public ResponseEntity delSearch(String name){
        site.delSearch(name);
        return Resp.Resp(HttpStatus.OK, "success");
    }

    @RequestMapping(value = "/site/sub", method = RequestMethod.POST)
    public ResponseEntity addSubSite(Node node){
        site.addSubSite(node.getName(), node.getURL());
        return Resp.Resp(HttpStatus.OK, "success");
    }

    @RequestMapping(value = "/site/sub", method = RequestMethod.DELETE)
    public ResponseEntity delSub(String name){
        site.delSubSite(name);
        return Resp.Resp(HttpStatus.OK, "success");
    }
}
