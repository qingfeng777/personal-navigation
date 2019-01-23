package com.ming.personal.moudle.entity;

import java.util.List;

public class Category {
    private String name;
    private List<Node> node;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Node> getNode() {
        return node;
    }

    public void setNode(List<Node> node) {
        this.node = node;
    }

    public Category(String name, List<Node> node) {
        this.name = name;
        this.node = node;
    }
}
