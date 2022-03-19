package com.example.huesapp.ModelClass;

public class CartModelClass {
    String productName,productUrl;
    int productCost,productQuantity;


    public CartModelClass(String productName, int productCost, int productQuantity) {
        this.productName = productName;
        this.productCost = productCost;
        this.productQuantity = productQuantity;
    }


    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductUrl() {
        return productUrl;
    }

    public void setProductUrl(String productUrl) {
        this.productUrl = productUrl;
    }

    public int getProductCost() {
        return productCost;
    }

    public void setProductCost(int productCost) {
        this.productCost = productCost;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }


}
