package com.example.kisaan;

public class post {
    private String title;
    private String caption;
    private String imageUrl;

    public post(){

    }
    public post(String Text1,String Text2,String image){

        if(Text1.trim().equals("") || Text2.trim().equals("")){
            Text1 = "No Title";
            Text2 = "No caption";
        }
        title = Text1;
        caption = Text2;
        imageUrl = image;
    }

    public String getCaption() {
        return caption;
    }

    public String getTitle() {
        return title;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
