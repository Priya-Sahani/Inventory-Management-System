package com.inventory.order.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
public class Inventory {

    public Inventory() {
		super();
		// TODO Auto-generated constructor stub
	}
	private int id;
    private int locationNbr;
    private String materialId;
    private int resetQty;
    private int orderQty;
    private int availableQuantity;
    @JsonFormat(pattern="yyyy-MM-dd'T'HH:mm")
    private Date updateDateTime;
    
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getLocationNbr() {
		return locationNbr;
	}
	public void setLocationNbr(int locationNbr) {
		this.locationNbr = locationNbr;
	}
	public String getMaterialId() {
		return materialId;
	}
	public void setMaterialId(String materialId) {
		this.materialId = materialId;
	}
	public int getResetQty() {
		return resetQty;
	}
	public void setResetQty(int resetQty) {
		this.resetQty = resetQty;
	}
	public int getOrderQty() {
		return orderQty;
	}
	public void setOrderQty(int orderQty) {
		this.orderQty = orderQty;
	}
	public int getAvailableQuantity() {
		return availableQuantity;
	}
	public void setAvailableQuantity(int availableQuantity) {
		this.availableQuantity = availableQuantity;
	}
	public Date getUpdateDateTime() {
		return updateDateTime;
	}
	public void setUpdateDateTime(Date updateDateTime) {
		this.updateDateTime = updateDateTime;
	}
	@Override
	public String toString() {
		return "Inventory [id=" + id + ", locationNbr=" + locationNbr + ", materialId=" + materialId + ", resetQty="
				+ resetQty + ", orderQty=" + orderQty + ", availableQuantity=" + availableQuantity + ", updateDateTime="
				+ updateDateTime + "]";
	}
}
