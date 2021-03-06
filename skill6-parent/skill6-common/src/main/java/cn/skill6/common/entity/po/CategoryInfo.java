package cn.skill6.common.entity.po;

import java.util.Date;

import cn.skill6.common.entity.enums.CategoryType;

/**
 * 目录分类实体类
 *
 * @author 何明胜
 * @version 1.0.2
 * @since 2018年8月15日 下午11:31:09
 */
public class CategoryInfo {
  private Long categoryId;

  private String categoryName;

  private CategoryType categoryType;

  private Date categoryCreateDate;

  private Date categoryModifyDate;

  private Boolean categoryValid;

  public CategoryInfo(
      Long categoryId,
      String categoryName,
      CategoryType categoryType,
      Date categoryCreateDate,
      Date categoryModifyDate,
      Boolean categoryValid) {
    this.categoryId = categoryId;
    this.categoryName = categoryName;
    this.categoryType = categoryType;
    this.categoryCreateDate = categoryCreateDate;
    this.categoryModifyDate = categoryModifyDate;
    this.categoryValid = categoryValid;
  }

  public CategoryInfo() {
    super();
  }

  public Long getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(Long categoryId) {
    this.categoryId = categoryId;
  }

  public String getCategoryName() {
    return categoryName;
  }

  public void setCategoryName(String categoryName) {
    this.categoryName = categoryName == null ? null : categoryName.trim();
  }

  public CategoryType getCategoryType() {
    return categoryType;
  }

  public void setCategoryType(CategoryType categoryType) {
    this.categoryType = categoryType;
  }

  public Date getCategoryCreateDate() {
    return categoryCreateDate;
  }

  public void setCategoryCreateDate(Date categoryCreateDate) {
    this.categoryCreateDate = categoryCreateDate;
  }

  public Date getCategoryModifyDate() {
    return categoryModifyDate;
  }

  public void setCategoryModifyDate(Date categoryModifyDate) {
    this.categoryModifyDate = categoryModifyDate;
  }

  public Boolean getCategoryValid() {
    return categoryValid;
  }

  public void setCategoryValid(Boolean categoryValid) {
    this.categoryValid = categoryValid;
  }
}
