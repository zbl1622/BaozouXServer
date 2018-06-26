package com.zbl.baozoudaily.xserver.article;

import com.zbl.baozoudaily.xserver.article.response.DocumentBean;
import com.zbl.baozoudaily.xserver.article.response.FavoritesBean;
import com.zbl.baozoudaily.xserver.article.response.MainTabBean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ArticleController {

    /**
     * 首页文章分类标签
     *
     * @return
     */
    @RequestMapping(value = "/**/tags/index", method = RequestMethod.GET)
    private MainTabBean getMainTags() {
        MainTabBean mainTabBean = new MainTabBean();
        mainTabBean.setVersion(1);
        List<MainTabBean.Data> dataList = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            MainTabBean.Data data = new MainTabBean.Data();
            data.setName("文章类型" + i);
            data.setUrl("");
            dataList.add(data);
        }
        mainTabBean.setData(dataList);
        return mainTabBean;
    }

    /**
     * 收藏文章列表
     *
     * @return
     */
    @RequestMapping(value = "/**/documents/favorites", method = RequestMethod.GET)
    private FavoritesBean getFavorites() {
        FavoritesBean favoritesBean = new FavoritesBean();
        favoritesBean.setTimestamp(1);
        List<DocumentBean> dataList = new ArrayList<>();
        for (int i = 0; i < 16; i++) {
            DocumentBean data = new DocumentBean();
            data.setTitle("收藏文章" + i);
            data.setThumbnail("https://www.qqtouxiang.com/d/file/jiemei/2017-01-04/6064093faff73b9378aa83527d64ebbc.jpg");
            data.setImage("https://www.qqtouxiang.com/d/file/jiemei/2017-01-04/6064093faff73b9378aa83527d64ebbc.jpg");
            dataList.add(data);
        }
        favoritesBean.setData(dataList);
        return favoritesBean;
    }

}
