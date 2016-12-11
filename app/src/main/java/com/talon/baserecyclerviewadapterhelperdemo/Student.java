package com.talon.baserecyclerviewadapterhelperdemo;

import java.io.Serializable;

/**
 * Created by Talon on 2016/12/11.
 */

public class Student implements Serializable{
    private String name;
    private String iconUrl;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }
}
