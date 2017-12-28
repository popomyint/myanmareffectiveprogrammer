package com.mep.domain.admin.category.dto;

import java.io.Serializable;

public class CategoryListDto implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer categoryId;
	
	private String categoryName;

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

}
