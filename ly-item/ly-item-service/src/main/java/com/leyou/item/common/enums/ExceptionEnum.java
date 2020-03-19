package com.leyou.item.common.enums;



public enum ExceptionEnum {
    PRICE_CANNOT_BE_NULL(400,"price can not be null");

    ;
    private int code;

    ExceptionEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    private String message;

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }


}
