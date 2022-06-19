package com.springboot.beans.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@XmlRootElement
public class product {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int productid;
		private String productname;
	private String productaddress;
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
	@Override
	public String toString() {
		return "product [productid=" + productid + ", productname=" + productname + ", productaddress=" + productaddress
				+ ", date=" + date + "]";
	}
	
}
