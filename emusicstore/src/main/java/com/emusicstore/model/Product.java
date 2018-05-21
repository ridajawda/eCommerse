package com.emusicstore.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.web.multipart.MultipartFile;

/**
 * Created by Le on 1/2/2016.
 */

@Entity
@Table(name = "product")
public class Product {

	@Id
	@Column(name = "product_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productId;
    
	@NotEmpty (message = "The product name must not be null.")
	@Column(name = "productName")
	private String productName;
    
	
	@Column(name = "productCategory")
	private String productCategory;
    
	
	@Column(name = "productDescription")
	private String productDescription;
    
	@Min(value = 0, message = "The product price must no be less then zero.")
	@Column(name = "productPrice")
	private double productPrice;
   
	@Column(name = "productCondition")
	private String productCondition;
   
	@Column(name = "productStatus")
	private String productStatus;
   
	@Min(value = 0, message = "The product unit must not be less than zero.")
	@Column(name = "unitInStock")
	private int unitInStock;
    
	@Column(name = "productManufacturer")
	private String productManufacturer;
	
	@Transient
	private MultipartFile productImage;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductCondition() {
        return productCondition;
    }

    public void setProductCondition(String productCondition) {
        this.productCondition = productCondition;
    }

    public String getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(String productStatus) {
        this.productStatus = productStatus;
    }

    public int getUnitInStock() {
        return unitInStock;
    }

    public void setUnitInStock(int unitInStock) {
        this.unitInStock = unitInStock;
    }

    public String getProductManufacturer() {
        return productManufacturer;
    }

    public void setProductManufacturer(String productManufacturer) {
        this.productManufacturer = productManufacturer;
    }

	public MultipartFile getProductImage() {
		return productImage;
	}

	public void setProductImage(MultipartFile productImage) {
		this.productImage = productImage;
	}
    
}
