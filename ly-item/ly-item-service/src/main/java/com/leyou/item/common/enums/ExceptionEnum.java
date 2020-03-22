package com.leyou.item.common.enums;



public enum ExceptionEnum {
    PRICE_CANNOT_BE_NULL(400,"price can not be null"),
    CATEGORY_NOT_FOUND(404,"商品分类没有查到");

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
