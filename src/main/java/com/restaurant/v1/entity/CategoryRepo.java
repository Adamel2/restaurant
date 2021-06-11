package com.restaurant.v1.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
  @created 26/05/2021 - 11:18
  @author  Adham eldda
  @package com.restaurant.v1.entity
  @project GreeBash
 */
@Repository
public interface CategoryRepo extends JpaRepository<CategoryEntity,String> {
}
