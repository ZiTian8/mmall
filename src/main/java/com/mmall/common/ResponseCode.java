/**
 * @ClassName ResponseCode
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019-02-28 20:10
 */
package com.mmall.common;

public enum ResponseCode {

    SUCCESS(0,"SUCCESS"),
    ERROR(1,"ERROR"),
    NEED_LOGIN(10,"NEED_LOGIN"),
    ILLEGAL_ARGUMENT(1,"ILLEGAL_ARGUMENT");

    private final int code;
    private final String desc;

    ResponseCode(int code, String desc) {
        this.code=code;
        this.desc=desc;
    }

    public int getCode(){
        return code;
    }

    public   String getDesc(){
        return desc;
    }




}
