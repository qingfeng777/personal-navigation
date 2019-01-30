package com.ming.personal.moudle.dao.impl;

import com.ming.personal.moudle.dao.SiteDao;
import com.ming.personal.moudle.entity.Node;
import com.ming.personal.moudle.entity.Site;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

@Component
public class SiteDaoImpl implements SiteDao {

    @Autowired
    private MongoTemplate db;

    @Override
    public Site getSite() {
        //find in db, if not exist, add one.
        Site site = db.findOne(new Query(), Site.class);
        if (site == null) {
            site = new Site();
            db.save(site);
        }
        return site;
    }

    @Override
    public void updateSite(Site site) {
        Update update = new Update().set("search", site.getSearch()).set("subSite", site.getSubSite());
        db.updateFirst(new Query(), update, Site.class);
    }

    @Override
    public void addSearch(String name, String URL) {
        Site site = this.getSite();
        site.getSearch().add(new Node(name, URL));
        this.updateSite(site);
    }

    @Override
    public void addSubSite(String name, String URL) {
        Site site = this.getSite();
        site.getSubSite().add(new Node(name, URL));
        this.updateSite(site);
    }

    @Override
    public void delSearch(String name) {
        Site site = this.getSite();
        for (int i = 0; i < site.getSearch().size(); i++) {
            Node node = (Node) site.getSearch().get(i);
            if (name.equals(node.getName())) {
                site.getSearch().remove(i);
                break;
            }
        }
        this.updateSite(site);
    }

    @Override
    public void delSubSite(String name) {
        Site site = this.getSite();
        for (int i = 0; i < site.getSubSite().size(); i++) {
            Node node = (Node) site.getSubSite().get(i);
            if (name.equals(node.getName())) {
                site.getSubSite().remove(i);
                break;
            }
        }
        this.updateSite(site);
    }
}
