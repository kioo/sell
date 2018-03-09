package com.imooc.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * 类目表
 */
@Entity
@DynamicUpdate // 动态更新时间的注解
@Data
public class ProductCategory {

    @Id
    @GeneratedValue
    private Integer categoryId; /**类目id*/
    private String categoryName; /**类目名字*/
    private Integer categoryType;

    public ProductCategory() {
    }

    /**类目编号*/

    public ProductCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }
}
