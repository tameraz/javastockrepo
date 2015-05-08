package com.mta.javastock.servlet;

import java.io.IOException;

import com.mta.javastock.service.PortfolioManager;
import com.mta.javastock.model.Portfolio;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PortfolioServlet extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/html");
		
		PortfolioManager portfolioManager = new PortfolioManager();
		Portfolio portfolio1 = portfolioManager.getPortfolio();
		Portfolio portfolio2 = new Portfolio(portfolio1);
		portfolio2.setTitle("Portfolio#2");
		
		resp.getWriter().println(portfolio1.getHtmlString());
		resp.getWriter().println(portfolio2.getHtmlString());
		
		portfolio1.removeStock(portfolio1.stocks[0]);
		
		resp.getWriter().println(portfolio1.getHtmlString());
		resp.getWriter().println(portfolio2.getHtmlString());
		
		portfolio2.stocks[portfolio2.portfolioSize -1].setBid(55.55f);
		
		resp.getWriter().println(portfolio1.getHtmlString());
		resp.getWriter().println(portfolio2.getHtmlString());
		
	

	}
}
