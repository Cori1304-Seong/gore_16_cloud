package com.ohgiraffers.elasticbeanstalk.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "tbl_menu")
@Data
public class Menu {

  @Id
  @Column(name="menu_code")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private String menuCode;

  @Column(name="menu_name")
  private String menuName;

  @Column(name="menu_price")
  private int menuPrice;

  @Column(name="category_code")
  private int categoryCode;

  @Column(name = "orderable_status")
  private String orderableStatus;

}
