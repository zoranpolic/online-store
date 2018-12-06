package com.gdc.store.repository;

import com.gdc.store.domain.ProductCategory;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the ProductCategory entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {

}
