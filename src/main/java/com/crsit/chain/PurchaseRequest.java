package com.crsit.chain;

/**
 * @ClassName: PurchaseRequest
 * @Description: TODO
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-08-09 16:45
 * @Version: 1.0.0
 **/
public class PurchaseRequest {
    private int type = 0;
    private float price = 0.0f;
    private int id = 0;
    public PurchaseRequest(int type, float price, int id){
        this.type = type;
        this.price = price;
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public float getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }
}
