package com.my.materialdesign.model;

/**
 * Created by vtechhive on 14/9/15.
 */
public class NavDrawerItem {

    private boolean showNotify;
    private String title;

    public NavDrawerItem(){

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isShowNotify() {
        return showNotify;

    }

    public void setShowNotify(boolean showNotify) {
        this.showNotify = showNotify;
    }
}
