package com.imooc.repository;

import com.imooc.dataobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * ProductCategory table repository
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer> {
}
