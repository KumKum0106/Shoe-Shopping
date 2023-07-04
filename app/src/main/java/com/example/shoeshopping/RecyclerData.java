package com.example.shoeshopping;

public class RecyclerData {

    private String shoeName;
    private int rating;
    private int price;
    private int imgId;

    public String getShoeName() {
        return shoeName;
    }

    public void setShoeName(String shoeName) {
        this.shoeName = shoeName;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }


    public RecyclerData(String shoeName, int price, int imgId, int rating) {
        this.shoeName = shoeName;
        this.price = price;
        this.imgId = imgId;
        this.rating = rating;
    }
}
