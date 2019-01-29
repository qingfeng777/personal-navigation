package com.ming.personal.moudle.entity;

import java.util.ArrayList;

public class Site {
    private ArrayList search, subSite;

    public ArrayList getSearch() {
        if (this.search == null){
            this.search = new ArrayList();
        }
        return search;
    }

    public void setSearch(ArrayList search) {
        this.search = search;
    }

    public ArrayList getSubSite() {
        if (this.subSite == null){
            this.subSite = new ArrayList();
        }
        return subSite;
    }

    public void setSubSite(ArrayList subSite) {
        this.subSite = subSite;
    }

    public Site(ArrayList search, ArrayList subSite) {
        this.search = search;
        this.subSite = subSite;
    }

    public Site() {
    }
}
