package com.ming.personal.moudle.entity;

import java.util.ArrayList;

public class Site {
    private ArrayList search, sub;

    public ArrayList getSearch() {
        return search;
    }

    public void setSearch(ArrayList search) {
        this.search = search;
    }

    public ArrayList getSub() {
        return sub;
    }

    public void setSub(ArrayList sub) {
        this.sub = sub;
    }

    public Site(ArrayList search, ArrayList sub) {
        this.search = search;
        this.sub = sub;
    }
}
