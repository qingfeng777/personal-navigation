package com.ming.personal.moudle.dao.impl;

import com.ming.personal.moudle.dao.PageDao;
import com.ming.personal.moudle.entity.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

@Component
public class PageDaoImpl implements PageDao {

    @Autowired
    private MongoTemplate db;

    @Override
    public Page getPageByName(String name) {
        Query query =  new Query(Criteria.where("name").is(name));
        Page page = db.findOne(query, Page.class);
        return page;
    }

    @Override
    public void addPage(String name) {
        Page page = new Page(name,null);
        db.save(page);
    }
}
