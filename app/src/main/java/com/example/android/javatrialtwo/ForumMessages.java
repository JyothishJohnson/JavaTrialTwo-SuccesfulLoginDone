package com.example.android.javatrialtwo;

/**
 * Created by g50 on 28-03-2017.
 */

public class ForumMessages {

    private String text;
    private String name;
    private String photoUrl;
    private String userPhoto;



    public ForumMessages() {
    }

    public ForumMessages(String text, String name, String photoUrl, String userPhoto) {

        super();
        this.text = text;
        this.name = name;
        this.photoUrl = photoUrl;
        this.userPhoto= userPhoto;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public String getUserPhoto() {
        return userPhoto;
    }

    public void setUserPhoto(String userPhoto) {
        this.userPhoto = userPhoto;
    }
}
