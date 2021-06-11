package com.restaurant.v1.entity;

/*
  @created 26/05/2021 - 11:05
  @author  Adham eldda
  @package com.restaurant.v1.entity
  @project GreeBash
 */


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

//-- DROP TABLE `category`;
//  CREATE  TABLE IF NOT EXISTS `category`(
//  `id` VARCHAR(150) NOT NULL,
//  `category_id` VARCHAR(150) NOT NULL,
//  `category_name` VARCHAR(150) NOT NULL ,
//  `create_date` DATE NOT NULL ,
//  PRIMARY KEY (`category_id`) )
//  ENGINE = InnoDB;
//  -- DROP TABLE `product`;
//  CREATE  TABLE IF NOT EXISTS `product`(
//  `id` VARCHAR(150) NOT NULL,
//  `product_id` VARCHAR(150) NOT NULL,
//  `product_name` VARCHAR(150) NOT NULL ,
//  `product_price` VARCHAR(150) NOT NULL ,
//  `product_description` VARCHAR(150) NOT NULL ,
//  `product_total_store` int NOT NULL ,
//  `create_date` DATE NOT NULL ,
//  PRIMARY KEY (`product_id`) )
//  ENGINE = InnoDB;
@Entity
@Table(name = "category" )
public class CategoryEntity {

  private String id;

  @Id
  @Column(name = "category_id")
  private String category_id;

  @Column(name = "category_name")
  private String category_name;

  @Column(name = "create_date")
  private Date create_date;

  @Column(name = "description")
  private String description;

  @Column(name = "photo")
  private String photo;

  public CategoryEntity() {
  }

  public CategoryEntity(String category_name, Date create_date, String description, String photo) {
    this.category_name = category_name;
    this.create_date = new Date();
    this.description = description;
    this.photo = photo;
  }
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getCategory_id() {
    return category_id;
  }

  public void setCategory_id(String category_id) {
    this.category_id = category_id;
  }

  public String getCategory_name() {
    return category_name;
  }

  public void setCategory_name(String category_name) {
    this.category_name = category_name;
  }

  public Date getCreate_date() {
    return create_date;
  }

  public void setCreate_date(Date create_date) {
    this.create_date = create_date;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getPhoto() {
    return photo;
  }

  public void setPhoto(String photo) {
    this.photo = photo;
  }

  @Override
  public String toString() {
    return "CategoryEntity{" +
      "id='" + id + '\'' +
      ", category_id='" + category_id + '\'' +
      ", category_name='" + category_name + '\'' +
      ", create_date=" + create_date +
      ", description='" + description + '\'' +
      ", photo='" + photo + '\'' +
      '}';
  }

}
