package com.mta.javastock.service;

import java.util.Date;
import com.mta.javastock.model.Portfolio;
import com.mta.javastock.Stock;
import java.util.Calendar;

public class PortfolioManager {
	
/* This class is a portfolio manager , it will execute methods of portfolio*/
	
	public Portfolio getPortfolio()
	{
		Portfolio Portfolio = new Portfolio();
		Portfolio.setTitle("Exercise 7 portfolio");	
		Portfolio.updateBalance(10000);
		
		
		Calendar cal=Calendar.getInstance();
		cal.set(2014, 11, 15);
		Date date1=(Date) cal.getTime();
		Date date2=(Date) cal.getTime();
		Date date3=(Date) cal.getTime();
		
		Stock stock1=new Stock("PIH",10F,8.5F,date1);
		Stock stock2=new Stock("AAL",30F,25.5F,date2);		
		Stock stock3=new Stock("CAAS",20F,15.5F,date3);
		
		Portfolio.buyStock(stock1, 20);
		Portfolio.buyStock(stock2, 30);
		Portfolio.buyStock(stock3, 40);

		Portfolio.sellStock("AAL",-1);
		Portfolio.removeStock("CAAS");
		
		return (Portfolio);
	}

}
