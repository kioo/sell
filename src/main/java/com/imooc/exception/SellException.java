package com.imooc.exception;

import com.imooc.enums.ResultEnum;

/**
 * Created by Jackie on 2018/3/14.
 */
public class SellException extends RuntimeException {

    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
}
