package org.bootcamp.model;

import org.bootcamp.model.constant.Stock;
import org.bootcamp.model.constant.Type;

public class Trade {
    private Stock stock;

    private Type type;

    private double price;

    private int shares;

    public Trade(Stock stock, Type type, double price, int shares) {
        if (price < 0 || shares <= 0) {
            throw new IllegalArgumentException("INVALID PARAM");
        }
        this.stock = stock;
        this.type = type;
        this.price = price;
        this.shares = shares;
    }

    public Trade(Trade source) {
        this.stock = source.stock;
        this.type = source.type;
        this.price = source.price;
        this.shares = source.shares;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("INVALID PARAM");
        }
        this.price = price;
    }

    public int getShares() {
        return shares;
    }

    public void setShares(int shares) {
        if (shares <= 0) {
            throw new IllegalArgumentException("INVALID PARAM");
        }
        this.shares = shares;
    }
}
