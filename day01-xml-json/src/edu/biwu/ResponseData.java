package edu.biwu;



/*统一数据响应格式*/
public class ResponseData<T> {
    /*为了实现数据的通用性,这里使用泛型来接收任意引用类型*/
    private T data;
    private Integer code;
    private String msg;

    public ResponseData() {
    }

    public ResponseData(T data, Integer code, String msg) {
        this.data = data;
        this.code = code;
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "ResponseData{" +
                "data=" + data +
                ", code=" + code +
                ", msg='" + msg + '\'' +
                '}';
    }
}

