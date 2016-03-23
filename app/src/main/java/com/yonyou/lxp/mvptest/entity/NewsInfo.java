package com.yonyou.lxp.mvptest.entity;

import java.io.Serializable;

/**
 * 作者： liuxiaopeng on 16/3/23.
 * 描述：
 */
public class NewsInfo implements Serializable{

    /**
     * title : 普京露面破外媒失踪谣言
     * content : <em>普京</em>自本月5日会见来访的意大利总理伦齐后,便未再公开露面。11日,俄发布俄罗斯、哈萨克斯坦、白俄罗斯三国领导人会晤推迟举行的消息,西方媒体借此猜测会晤推迟原因是"<em>普京</em>生病"。俄方予以否认,坚称<em>普京</em>身体状况"绝对健康"。13日,俄总统新闻秘书佩斯科夫否认了关于<em>普京</em>"新添...
     * img_width :
     * full_title : 普京露面破外媒失踪谣言
     * pdate : 39分钟前
     * src : 光明网
     * img_length :
     * img :
     * url : http://world.gmw.cn/newspaper/2015-03/17/content_105205337.htm
     * pdate_src : 2015-03-17 10:55:00
     */

    private String title;
    private String content;
    private String img_width;
    private String full_title;
    private String pdate;
    private String src;
    private String img_length;
    private String img;
    private String url;
    private String pdate_src;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImg_width() {
        return img_width;
    }

    public void setImg_width(String img_width) {
        this.img_width = img_width;
    }

    public String getFull_title() {
        return full_title;
    }

    public void setFull_title(String full_title) {
        this.full_title = full_title;
    }

    public String getPdate() {
        return pdate;
    }

    public void setPdate(String pdate) {
        this.pdate = pdate;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public String getImg_length() {
        return img_length;
    }

    public void setImg_length(String img_length) {
        this.img_length = img_length;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPdate_src() {
        return pdate_src;
    }

    public void setPdate_src(String pdate_src) {
        this.pdate_src = pdate_src;
    }

    @Override
    public String toString() {
        return title;
    }
}
