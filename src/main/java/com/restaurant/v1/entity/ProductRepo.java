package com.restaurant.v1.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/*
  @created 26/05/2021 - 11:19
  @author  Adham eldda
  @package com.restaurant.v1.entity
  @project GreeBash
 */
@Repository
public interface ProductRepo extends JpaRepository<ProductEntity, String> {
  @Query(
    value = "SELECT * FROM product WHERE category_id = :category_id",
    nativeQuery = true)
  List<ProductEntity> findAllByCategory_id(@Param("category_id") String category_id);
}
