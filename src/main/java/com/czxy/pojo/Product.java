package com.czxy.pojo;

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
	private String pname;

   	@Column(name = "price" )
	private Double price;

   	@Column(name = "upload_time" )
	private Date upload_Time;

   	@Column(name = "image" )
	private String image;

	public Integer getPid() {
		return this.pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getPname() {
		return this.pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Date getUpload_Time() {
		return this.upload_Time;
	}

	public void setUpload_Time(Date upload_Time) {
		this.upload_Time = upload_Time;
	}

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}


}
