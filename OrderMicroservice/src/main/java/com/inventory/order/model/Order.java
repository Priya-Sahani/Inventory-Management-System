package com.inventory.order.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "Orders")
public class Order {

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Transient
	public static final String SEQUENCE_NAME = "users_sequence";

	@Id
	private int orderId;

	private int locationNbr;
	private String materialId;
	private int orderQty;
	private String orderStatus;

	@JsonFormat(pattern="yyyy-MM-dd'T'HH:mm")
	private Date orderDateTime;

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
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

	public int getOrderQty() {
		return orderQty;
	}

	public void setOrderQty(int orderQty) {
		this.orderQty = orderQty;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Date getOrderDateTime() {
		return orderDateTime;
	}

	public void setOrderDateTime(Date orderDateTime) {
		this.orderDateTime = orderDateTime;
	}

	public static String getSequenceName() {
		return SEQUENCE_NAME;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", locationNbr=" + locationNbr + ", materialId=" + materialId
				+ ", orderQty=" + orderQty + ", orderStatus=" + orderStatus + ", orderDateTime=" + orderDateTime + "]";
	}
	


}
