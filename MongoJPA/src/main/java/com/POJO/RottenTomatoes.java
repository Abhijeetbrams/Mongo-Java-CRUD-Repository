package com.POJO;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class RottenTomatoes {

    private Date lastUpdated;

    private ViewerRating viewer;

    public RottenTomatoes() {
        super();
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public ViewerRating getViewer() {
        return viewer;
    }

    public void setViewer(ViewerRating viewer) {
        this.viewer = viewer;
    }
}
