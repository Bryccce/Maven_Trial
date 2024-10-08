package edu.biwu;

public class Order {
    /*订单编号*/
    private String orderSn;

    /*订单描述信息*/
    private String subject;

    /*订单中商品数量*/
    private Integer quantity;

    public Order() {
    }

    public Order(String orderSn, String subject, Integer quantity) {
        this.orderSn = orderSn;
        this.subject = subject;
        this.quantity = quantity;
    }

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderSn='" + orderSn + '\'' +
                ", subject='" + subject + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
