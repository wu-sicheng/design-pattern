package com.wusicheng.e34_visitor_pattern.old;

/**
 * @author wsc
 * @date 2018/7/23
 * @description 商品
 */

public class Good {
    private String name;
    private int price;
    private String packing;

    public Good(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getPacking() {
        return packing;
    }

    public void setPacking(String packing) {
        this.packing = packing;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Good{");
        sb.append("name='").append(name).append('\'');
        sb.append(", price=").append(price);
        sb.append(", packing='").append(packing).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
