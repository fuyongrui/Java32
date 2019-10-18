package com.xdkj.bean;

import java.util.Date;

/**
 * @author mr guo
 * @create 2019-10-16 9:30
 */
public class Product {

    private Integer pid;
    private String pname;
    private Double price;
    private Date createDate;

    public Product(Integer pid, String pname, Double price, Date createDate) {
        this.pid = pid;
        this.pname = pname;
        this.price = price;
        this.createDate = createDate;
    }

    public Product() {
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "Product{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                ", price=" + price +
                ", createDate=" + createDate +
                '}';
    }
}
