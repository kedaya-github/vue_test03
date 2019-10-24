package com.czxy.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import javax.persistence.Id;

/**
 * @Description  
 * @Author  Baby
 * @Date 2019-10-22 
 */

@Entity
@Table ( name ="t_goods" )
public class Good implements Serializable {

	private static final long SERIAL_VERSION_UID =  79662754680243195L;

   	@Column(name = "id" )
	@Id
	private Integer id;

   	@Column(name = "name" )
	private String name;

   	@Column(name = "image" )
	private String image;

   	@Column(name = "price" )
	private Double price;

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Good{" +
				"id=" + id +
				", name='" + name + '\'' +
				", image='" + image + '\'' +
				", price=" + price +
				'}';
	}
}
