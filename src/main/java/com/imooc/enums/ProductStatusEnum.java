package com.imooc.enums;

import lombok.Getter;

/**
 * 商品状态
 */
@Getter
public enum ProductStatusEnum {
    UP(0,"在架"),
    DOWN(1,"下架")
    ;
    private Integer code;
    private String messgae;

    ProductStatusEnum(Integer code, String messgae) {
        this.code = code;
        this.messgae = messgae;
    }
}
