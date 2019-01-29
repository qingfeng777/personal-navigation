package com.ming.personal.moudle.dao;

import com.ming.personal.moudle.entity.Site;

public interface SiteDao {
    public void addSearch(String name, String URL);

    public void addSubSite(String name, String URL);

    public void delSearch(String name);

    public void delSubSite(String name);

    public Site getSite();

    public void updateSite(Site site);
}
