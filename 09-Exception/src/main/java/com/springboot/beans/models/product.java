package com.springboot.beans.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@XmlRootElement
public class product {

	@Override
	public String toString() {
		return "product [productid=" + productid + ", productname=" + productname + ", productaddress=" + productaddress
				+ ", date=" + date + "]";
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int productid;
   
	
	@Size(min=3,max=40,message="minimum 3 characters is allowed")
	private String productname;
	@Min(value=10,message="address must enter 10 characters")
	private String productaddress;
	
	@CreationTimestamp
	private Date date;
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getProductaddress() {
		return productaddress;
	}
	public void setProductaddress(String productaddress) {
		this.productaddress = productaddress;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

}
