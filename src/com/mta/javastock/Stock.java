package com.mta.javastock;

import java.util.Date;
import com.mta.javastock.model.Portfolio.ALGO_RECOMMENDATION;
import java.text.SimpleDateFormat;
import java.text.DateFormat;

public class Stock {
	private static final int BUY = 0;
	private static final int SELL = 1;
	private static final int REMOVE = 2;
	private static final int HOLD = 3;
	
	private String symbol;
	private float ask;
	private float bid;
	private Date date;
	private int stockQuantity;
	private ALGO_RECOMMENDATION recommendation;
	
	/*
	 * constructor 
	 */
	public Stock(String string, float f, float g, Date date) {
		this.symbol = string;
		this.ask = f;
		this.bid = g;
		this.date = date;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public float getAsk() {
		return ask;
	}
	public void setAsk(Float ask) {
		this.ask = ask;
	}
	public Float getBid() {
		return bid;
	}
	public void setBid(Float bid) {
		this.bid = bid;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
/* C'tors of Stock */
	
	public Stock(Stock stock){
		this.setSymbol(new String (stock.getSymbol()));
		this.setAsk(stock.getAsk());
		this.setBid(stock.getBid());
		this.date=new Date(stock.getDate().getTime());
		this.recommendation=stock.getRecommendation();
		this.stockQuantity=stock.getStockQuantity();
	}
	public ALGO_RECOMMENDATION getRecommendation() {
		return recommendation;
	}
	
	public void setRecommendation(ALGO_RECOMMENDATION recommendation) {
		this.recommendation = recommendation;
	}

	public int getStockQuantity() {
		return stockQuantity;
	}


	public void setStockQuantity(int stockQuantity) {
		this.stockQuantity = stockQuantity;
	}
	
	public String getHtmlDescription(){
		
		DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
		String dateStr = df.format(getDate());

		String ret= "<br>Stock symbol: </b>"+getSymbol()+" <b> ask: </b>"+getAsk()+"<b> bid: </b>"+getBid()+"<b> quantity: </b>"+getStockQuantity()+
				"<b> date: </b>"+ dateStr;
		return ret;
	
	}
}
