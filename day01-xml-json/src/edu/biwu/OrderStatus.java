package edu.biwu;

public enum OrderStatus {
    CREATE_NEW(1000,"待付款"),
    PAYED(1001,"已付款"),
    SENDED(1002,"已发货");

    /*状态码*/
    private Integer code;

    /*状态码描述信息*/
    private String msg;

    OrderStatus(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

}
