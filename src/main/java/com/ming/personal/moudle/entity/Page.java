package com.ming.personal.moudle.entity;

import java.util.List;

public class Page {
    private String Name;
    private List<Category> categorie;
    private long id;

    public Page(String name, List<Category> categorie, long id) {
        Name = name;
        this.categorie = categorie;
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public List<Category> getCategorie() {
        return categorie;
    }

    public void setCategorie(List<Category> categorie) {
        this.categorie = categorie;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Page{" +
                "Name='" + Name + '\'' +
                ", categorie=" + categorie +
                ", id=" + id +
                '}';
    }
}
