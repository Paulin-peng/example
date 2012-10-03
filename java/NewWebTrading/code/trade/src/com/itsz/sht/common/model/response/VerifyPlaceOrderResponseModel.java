//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : wmt
//  @ File Name : VerifyPlaceOrderResponseModel.java
//  @ Date : 2008-3-6
//  @ Author : kyzou
//
//



package com.itsz.sht.common.model.response;

import java.math.BigDecimal;

import com.itsz.sht.common.model.AbstractResponseModel;


public class VerifyPlaceOrderResponseModel  extends AbstractResponseModel{
	private String accountId;
	private OrderFeeResponseModel orderFeeResp;
	private String instrCode;
	private String orderSide;
	private BigDecimal orderQuantity;
	private BigDecimal orderPrice;
	private String orderType;
	private String allOrNothing;
	private String conditionType;
	private String transactionProtection;

	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public OrderFeeResponseModel getOrderFeeResp() {
		return orderFeeResp;
	}
	public void setOrderFeeResp(OrderFeeResponseModel orderFeeResp) {
		this.orderFeeResp = orderFeeResp;
	}
	public String getInstrCode() {
		return instrCode;
	}
	public void setInstrCode(String instrCode) {
		this.instrCode = instrCode;
	}
	public String getOrderSide() {
		return orderSide;
	}
	public void setOrderSide(String orderSide) {
		this.orderSide = orderSide;
	}
	public BigDecimal getOrderQuantity() {
		return orderQuantity;
	}
	public void setOrderQuantity(BigDecimal orderQuantity) {
		this.orderQuantity = orderQuantity;
	}
	public BigDecimal getOrderPrice() {
		return orderPrice;
	}
	public void setOrderPrice(BigDecimal orderPrice) {
		this.orderPrice = orderPrice;
	}
	public String getOrderType() {
		return orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	public String getAllOrNothing() {
		return allOrNothing;
	}
	public void setAllOrNothing(String allOrNothing) {
		this.allOrNothing = allOrNothing;
	}
	public String getConditionType() {
		return conditionType;
	}
	public void setConditionType(String conditionType) {
		this.conditionType = conditionType;
	}
	public String getTransactionProtection() {
		return transactionProtection;
	}
	public void setTransactionProtection(String transactionProtection) {
		this.transactionProtection = transactionProtection;
	}
}