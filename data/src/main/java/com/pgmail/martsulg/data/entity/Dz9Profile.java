package com.pgmail.martsulg.data.entity;

/**
 * Created by lenovo on 05.09.2017.
 */

public class Dz9Profile implements DataModel {
    private String Link;

    public Dz9Profile(String link) {
       Link = link;
    }

    public String getLink() {
        return Link;
    }

    public void setLink(String link) {
        Link = link;
    }
}
