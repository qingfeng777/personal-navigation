package com.ming.personal.moudle.entity;

import org.bson.types.ObjectId;

import java.util.ArrayList;
import java.util.List;

public class Category {
    private String name, page;
    private List<Node> node;
    private ObjectId _id;

    public ObjectId get_id() {
        return _id;
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Node> getNode() {
        if (this.node == null){
            this.node = new ArrayList<>();
        }
        return node;
    }

    public void setNode(List<Node> node) {
        this.node = node;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public Category(String name, String page, List<Node> node) {
        this.name = name;
        this.page = page;
        this.node = node;
    }
}
