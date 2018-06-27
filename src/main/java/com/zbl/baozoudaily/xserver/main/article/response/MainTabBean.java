package com.zbl.baozoudaily.xserver.main.article.response;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by MZW on 2016/3/23.
 */
public class MainTabBean {
    private long version = 0;

    public List<Data> getData() {
        return data;
    }

    public void setData(List<Data> data) {
        this.data = data;
    }

    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }

    private List<Data> data = new ArrayList<>();

    public static class Data implements Serializable {
        private String name = "";
        private String url = "";

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }
}
