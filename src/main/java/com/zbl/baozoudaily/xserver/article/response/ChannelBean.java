package com.zbl.baozoudaily.xserver.article.response;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangbaoliang on 2016/05/04.
 */
public class ChannelBean{

    public final static int SHOW_TYPE_NORMAL = 6;
    public final static int SHOW_TYPE_HEAD = 7;

    private long id = 0;
    private String name = "";
    private String thumbnail = "";
    private String summary = "";
    private String image = "";

    private long timestamp = 0;
    //用于在单篇页中标记
    private int show_type = SHOW_TYPE_NORMAL;
    public boolean hideDivider = false;

    public List<DocumentBean> data = new ArrayList<>();

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public int getShowType() {
        return show_type;
    }

    public void setShowType(int show_type) {
        this.show_type = show_type;
    }
}
