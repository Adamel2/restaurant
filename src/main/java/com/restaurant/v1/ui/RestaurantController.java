package com.restaurant.v1.ui;

/*
  @created 26/05/2021 - 11:06
  @author  Adham eldda
  @package com.restaurant.v1.ui
  @project GreeBash
 */

import com.restaurant.v1.entity.CategoryEntity;
import com.restaurant.v1.entity.CategoryRepo;
import com.restaurant.v1.entity.ProductEntity;
import com.restaurant.v1.entity.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/v1")
@CrossOrigin
public class RestaurantController {


  @Autowired
  private CategoryRepo categoryRepo;

  @Autowired
  private ProductRepo productRepo;

  @PostMapping("/addCategory")
  public ResponseEntity<CategoryEntity> addCategory(@RequestBody CategoryEntity categoryEntity){
    categoryEntity.setId(UUID.randomUUID().toString());
    categoryEntity.setCategory_id(UUID.randomUUID().toString());
    categoryEntity.setCreate_date(new Date());
    CategoryEntity categoryEntity1 = categoryEntity;
    categoryRepo.save(categoryEntity1);
    return ResponseEntity.status(HttpStatus.ACCEPTED).body(categoryRepo.save(categoryEntity1));
  }
  @GetMapping("/findAllCategory")
  public ResponseEntity<List<CategoryEntity>> findAllCategory(){

    return ResponseEntity.status(HttpStatus.OK).body(categoryRepo.findAll());
  }
  @GetMapping("/findCategoryById/{id}")
  public ResponseEntity<CategoryEntity>  findCategoryById(@PathVariable String id){
    CategoryEntity categoryEntity = categoryRepo.findById(id).get();
    return ResponseEntity.status(HttpStatus.OK).body(categoryEntity);
  }

  @PostMapping("addProduct")
  public ResponseEntity<ProductEntity> addProduct(@RequestBody ProductEntity productEntity)
  {
    productEntity.setId(UUID.randomUUID().toString());
    productEntity.setProduct_id(UUID.randomUUID().toString());
    productEntity.setCreate_date(new Date());

    return ResponseEntity.status(HttpStatus.OK).body(productRepo.save(productEntity));
  }

  @GetMapping("/findAllProduct")
  public ResponseEntity<List<ProductEntity>> findAllProduct(){

    return ResponseEntity.status(HttpStatus.OK).body(productRepo.findAll());
  }
  @GetMapping("/findProductById/{id}")
  public ResponseEntity<ProductEntity>  findProductById(@PathVariable String id){
    ProductEntity productEntity = productRepo.findById(id).get();
    return ResponseEntity.status(HttpStatus.OK).body(productEntity);
  }

  @GetMapping("/findAllProductByCategoryId/{id}")
  public ResponseEntity<List<ProductEntity>>  findAllProductByCategoryId(@PathVariable String id){

    List<ProductEntity> list = productRepo.findAllByCategory_id(id);
    return ResponseEntity.status(HttpStatus.OK).body(list);
  }

}
