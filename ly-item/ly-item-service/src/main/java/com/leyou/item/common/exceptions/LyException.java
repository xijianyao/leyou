package com.leyou.item.common.exceptions;

import com.leyou.item.common.enums.ExceptionEnum;

public class LyException  extends RuntimeException{

    public LyException(ExceptionEnum exceptionEnum) {
        this.exceptionEnum = exceptionEnum;
    }

    public ExceptionEnum getExceptionEnum() {
        return exceptionEnum;
    }

    public void setExceptionEnum(ExceptionEnum exceptionEnum) {
        this.exceptionEnum = exceptionEnum;
    }

    private ExceptionEnum exceptionEnum;
}
