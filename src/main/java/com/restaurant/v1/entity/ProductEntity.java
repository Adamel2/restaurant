package com.restaurant.v1.entity;

/*
 @created 26/05/2021 - 11:06
 @author  Adham eldda
 @package com.restaurant.v1.entity
 @project GreeBash
*/

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "product")
public class ProductEntity {

  private String id;

  @Id
  @Column(name = "product_id")
  private String product_id;

  @Column(name = "product_name")
  private String product_name;

  @Column(name = "category_id")
  private String category_id;

  @Column(name = "product_price")
  private String product_price;

  @Column(name = "product_description")
  private String product_description;

  @Column(name = "product_total_store")
  private int product_total_store;

  @Column(name = "create_date")
  private Date create_date;

  @Column(name = "photo")
  private String photo;

  public ProductEntity() {}

  public ProductEntity(
      String product_name,
      String category_id,
      String product_price,
      String product_description,
      int product_total_store,
      Date create_date,
      String photo) {
    this.product_name = product_name;
    this.category_id = category_id;
    this.product_price = product_price;
    this.product_description = product_description;
    this.product_total_store = product_total_store;
    this.create_date = new Date();
    this.photo = photo;
  }


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getProduct_id() {
    return product_id;
  }

  public void setProduct_id(String product_id) {
    this.product_id = product_id;
  }

  public String getProduct_name() {
    return product_name;
  }

  public void setProduct_name(String product_name) {
    this.product_name = product_name;
  }

  public String getProduct_price() {
    return product_price;
  }

  public void setProduct_price(String product_price) {
    this.product_price = product_price;
  }

  public String getProduct_description() {
    return product_description;
  }

  public void setProduct_description(String product_description) {
    this.product_description = product_description;
  }

  public int getProduct_total_store() {
    return product_total_store;
  }

  public void setProduct_total_store(int product_total_store) {
    this.product_total_store = product_total_store;
  }

  public Date getCreate_date() {
    return create_date;
  }

  public void setCreate_date(Date create_date) {
    this.create_date = create_date;
  }

  public String getCategory_id() {
    return category_id;
  }

  public void setCategory_id(String category_id) {
    this.category_id = category_id;
  }

  public String getPhoto() {
    return photo;
  }

  public void setPhoto(String photo) {
    this.photo = photo;
  }

  @Override
  public String toString() {
    return "ProductEntity{" +
      "id='" + id + '\'' +
      ", product_id='" + product_id + '\'' +
      ", product_name='" + product_name + '\'' +
      ", category_id='" + category_id + '\'' +
      ", product_price='" + product_price + '\'' +
      ", product_description='" + product_description + '\'' +
      ", product_total_store=" + product_total_store +
      ", create_date=" + create_date +
      ", photo='" + photo + '\'' +
      '}';
  }
}
