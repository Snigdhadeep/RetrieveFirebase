package com.techpenta.retrievefirebase;

public class Model {

    String image,lastpaymentdate,menuid,name,paymentstatus,phone;

    public Model() {

    }

    public Model(String image, String lastpaymentdate, String menuid, String name, String paymentstatus, String phone) {
        this.image = image;
        this.lastpaymentdate = lastpaymentdate;
        this.menuid = menuid;
        this.name = name;
        this.paymentstatus = paymentstatus;
        this.phone = phone;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getLastpaymentdate() {
        return lastpaymentdate;
    }

    public void setLastpaymentdate(String lastpaymentdate) {
        this.lastpaymentdate = lastpaymentdate;
    }

    public String getMenuid() {
        return menuid;
    }

    public void setMenuid(String menuid) {
        this.menuid = menuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPaymentstatus() {
        return paymentstatus;
    }

    public void setPaymentstatus(String paymentstatus) {
        this.paymentstatus = paymentstatus;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
