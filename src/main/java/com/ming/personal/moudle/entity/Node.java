package com.ming.personal.moudle.entity;

public class Node {
    private String name, URL;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public Node(String name) {
        this.name = name;
    }

    public Node() {
    }

    public Node(String name, String URL) {
        this.name = name;
        this.URL = URL;
    }
}
