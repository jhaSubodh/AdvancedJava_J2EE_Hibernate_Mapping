package com.example.HibernateManyToManyBiDirectional;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

@Entity
public class CustomerBiDirectional {
	@Id
	private int cID;
	private String cName;
	
	@ManyToMany
	@JoinTable(joinColumns = @JoinColumn(name = "product_fk"), inverseJoinColumns = @JoinColumn(name = "customer_id"))
	private List<ProductsBiDirectional> productsBiDirectional;

	public int getcID() {
		return cID;
	}

	public void setcID(int cID) {
		this.cID = cID;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public List<ProductsBiDirectional> getProducts() {
		return productsBiDirectional;
	}

	public void setProducts(List<ProductsBiDirectional> productsBiDirectional) {
		this.productsBiDirectional = productsBiDirectional;
	}
	
}
