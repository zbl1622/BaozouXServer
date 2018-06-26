package com.zbl.baozoudaily.xserver.article.response;

public class NewsImageBean {

    private boolean isAvatar;

    private boolean isNoJump;

    private boolean isVideo;

    private boolean isHeadPhoto = false;

    private String imageUrl;

    private String smallImageUrl;

    private String videoUrl;

    public NewsImageBean(final String pImageUrl, final String pSmallImageUrl) {
        this.imageUrl = pImageUrl;
        this.smallImageUrl = pSmallImageUrl;
    }

    public boolean isAvatar() {
        return isAvatar;
    }

    public void setIsAvatar(boolean isAvatar) {
        this.isAvatar = isAvatar;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getSmallImageUrl() {
        return smallImageUrl;
    }

    public boolean isHeadPhoto() {
        return isHeadPhoto;
    }

    public void setIsHeadPhoto(boolean isHeadPhoto) {
        this.isHeadPhoto = isHeadPhoto;
    }

    public boolean isNoJump() {
        return isNoJump;
    }

    public void setIsNoJump(boolean isNoJump) {
        this.isNoJump = isNoJump;
    }

    public boolean isVideo() {
        return isVideo;
    }

    public void setIsVideo(boolean isVideo) {
        this.isVideo = isVideo;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }
}
