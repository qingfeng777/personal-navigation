package com.ming.personal.moudle.dao.impl;

import com.ming.personal.moudle.dao.CategoryDao;
import com.ming.personal.moudle.entity.Category;
import com.ming.personal.moudle.entity.Node;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class CategoryDaoImpl implements CategoryDao {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public void addCategory(Category category) {
        mongoTemplate.save(category);
    }

    @Override
    public void delCategory(String name, String page) {
        Query query =  new Query(Criteria.where("name").is(name).and("page").is(page));
        mongoTemplate.remove(query, Category.class);
    }

    @Override
    public void updateCategory(Category category) {
        Query query=new Query(Criteria.where("_id").is(category.get_id())); //  数组 只能一个一个加?
        Update update= new Update().set("name", category.getName()).set("node", category.getNode()); // .push("node", category.getNode());
        mongoTemplate.updateFirst(query, update, Category.class);
    }

    @Override
    public List<Category> listCategory(String page) {
        Query query = new Query(Criteria.where("page").is(page));
        return mongoTemplate.find(query, Category.class);
    }

    @Override
    public Category getCategoryByName(String name, String page) {
        Query query =  new Query(Criteria.where("name").is(name).and("page").is(page));
        return mongoTemplate.findOne(query, Category.class);
    }

    // blow is node func .

    @Override
    public void addNode(String name, String URL, String cateName, String page) {
        Category cate = this.getCategoryByName(cateName, page);
        cate.getNode().add(new Node(name, URL));
        this.updateCategory(cate);
    }

    @Override
    public void delNode(String name, String cateName, String page) {
        Category cate = this.getCategoryByName(cateName, page);
        for (Node node : cate.getNode()){
            if (name.equals(node.getName())){
                cate.getNode().remove(node);
                break;
            }
        }
        this.updateCategory(cate);
    }
}
