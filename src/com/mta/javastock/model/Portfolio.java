package com.mta.javastock.model;
import com.mta.javastock.Stock;

public class Portfolio {
	
	private static final int MAX_PORTFOLIO_SIZE = 5;
	
	private String title;
	public int portfolioSize = 0;
	public Stock[] stocks = new Stock[MAX_PORTFOLIO_SIZE];
	
	/*
	 * Constructor
	 */
	public Portfolio()
	{
		this.title ="Tamer Portfolio";
		this.stocks = new Stock[MAX_PORTFOLIO_SIZE]; 
		this.portfolioSize = 0;
	}
	/*
	 * another Constructor 
	 */
	public Portfolio (String title,int portfolioSize )
	{
		this.title = title ;
		this.portfolioSize = portfolioSize ;
		this.stocks = new Stock [MAX_PORTFOLIO_SIZE] ; 
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Stock[] getStocks() {
		return stocks;
	}
	public void setStocks(Stock[] stocks) {
		this.stocks = stocks;
	}
	/*
	 * add stock to the arr
	 */
	public void addStock(Stock stock) {
		
		if(stock != null && portfolioSize < MAX_PORTFOLIO_SIZE) {
			this.stocks[portfolioSize] = stock;
			portfolioSize++;
		}else {
			System.out.println("The Portfolio is full, or the stock is null");
		}
	}
	/*
	 * remove stock from the arr[]
	 */
	public void removeStock(Stock stock)
	{
		for (int i=0;i<this.portfolioSize; i++)
		{
			if(this.stocks[i].getSymbol().equals(stock.getSymbol()))
			{
				this.stocks[i]=this.stocks[this.portfolioSize -1];
				this.stocks[this.portfolioSize -1] =null ;
				this.portfolioSize--;
				break;
			}
		}
	}
	public String getHtmlString() {
		
		String res = new String( "<h1>" + getTitle() + "</h1>" );
		
		for(int i = 0; i < portfolioSize ;i++) {
			res += this.stocks[i].getHtmlDescription() + "<br>";
		}
		return res;
	}
	/*
	 * copy constructor
	 */
	public Portfolio(Portfolio protfolio)
	{
		this(new String(protfolio.getTitle()),protfolio.portfolioSize);
		
		Stock[] coppy = protfolio.getStocks();
		for (int i = 0; i < protfolio.portfolioSize; i++) 
		{
			this.stocks[i] = new Stock(coppy[i]); 
		}
	
	}
}

