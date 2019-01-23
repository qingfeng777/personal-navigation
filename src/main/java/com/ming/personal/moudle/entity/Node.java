package com.ming.personal.moudle.entity;

public class Node {
    private String name, string;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public Node(String name, String string) {
        this.name = name;
        this.string = string;
    }
}
