package com.redcompany.red.hibernate.one.entity.service;

public class ResponseParam {

    private boolean isRequestCompleted =false;
    private String pageNames;





    public String getPageNames() {
        return pageNames;
    }

    public void setPageNames(String pageNames) {
        this.pageNames = pageNames;
    }

    public boolean isRequestCompleted() {
        return isRequestCompleted;
    }

    public void setRequestCompleted(boolean requestCompleted) {
        isRequestCompleted = requestCompleted;
    }
}
