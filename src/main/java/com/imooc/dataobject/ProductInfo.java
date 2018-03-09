package com.imooc.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * Created by Jackie on 2018/3/9.
 */
@Entity
@Data
public class ProductInfo {

    public ProductInfo() { }

    @Id
    private String productId;
    private String productName;
    private BigDecimal productPrice;
    /** 库存 */
    private Integer productStock;
    /** 描述 */
    private String productDescription;
    /** 小图 */
    private String productIcon;
    /** 状态 0 正常  1 下架 */
    private Integer productStatus;
    /** 类目编号 */
    private Integer categoryType;
}
