package com.czxy.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import javax.persistence.Id;
import java.util.Date;

/**
 * @Description  
 * @Author  Baby
 * @Date 2019-10-24 
 */

@Entity
@Table ( name ="product" )
public class Product  implements Serializable {

	private static final long SERIAL_VERSION_UID =  8062695448687198554L;

   	@Column(name = "pid" )
	@Id
	private Integer pid;

   	@Column(name = "pname" )
	private String pName;

   	@Column(name = "price" )
	private Double price;

   	@Column(name = "upload_time" )
	@JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss" , timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
	private Date uploadTime;

   	@Column(name = "image" )
	private String image;

	public Integer getPid() {
		return this.pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}



	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public Date getUploadTime() {
		return uploadTime;
	}

	public void setUploadTime(Date uploadTime) {
		this.uploadTime = uploadTime;
	}

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}


}
