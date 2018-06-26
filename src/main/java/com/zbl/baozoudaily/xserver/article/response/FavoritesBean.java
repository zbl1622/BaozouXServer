package com.zbl.baozoudaily.xserver.article.response;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by MengZhaoWei on 2015/11/3.
 */
public class FavoritesBean{

    public List<DocumentBean> getData() {
        return data;
    }

    public void setData(List<DocumentBean> data) {
        this.data = data;
    }

    public List<DocumentBean> data=new ArrayList<>();
    public long timestamp = 0;

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}
