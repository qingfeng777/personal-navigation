package com.ming.personal.moudle.entity;

import org.bson.types.ObjectId;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

public class Page implements Serializable{
    private String Name;
    // category name
    private List<String> category;
    private ObjectId _id;

    public Page(String name, List<String> category) {
        Name = name;
        this.category = category;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public List<String> getCategorie() {
        return category;
    }

    public void setCategorie(List<String> category) {
        this.category = category;
    }

    public List<String> getCategory() {
        if (this.category == null){
            this.category = new ArrayList<>();
        }
        return category;
    }

    public void setCategory(List<String> category) {
        this.category = category;
    }

    public ObjectId get_id() {
        return _id;
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    @Override
    public String toString() {
        return "Page{" +
                "Name='" + Name + '\'' +
                ", categorie=" + category +
                ", id=" + _id +
                '}';
    }
}
