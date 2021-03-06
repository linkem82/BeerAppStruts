package com.example.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.example.model.Beer;
import com.example.model.BeerAdvisor;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.Validation;

@Validation
public class BeerSelect extends ActionSupport {
	private static final long serialVersionUID = 1L;
	
	private String beerColor;
	private List<Beer> brands;

    public List<Beer> getBrands() {
		return brands;
	}

	public void setBrands(List<Beer> brands) {
		this.brands = brands;
	}

	public String getBeerColor() {
		return beerColor;
	}

	public void setBeerColor(String beerColor) {
		this.beerColor = beerColor;
	}

	/**
     * Default constructor. 
     */
    public BeerSelect() {
        // TODO Auto-generated constructor stub
    }

	public String execute() {
		BeerAdvisor ba = new BeerAdvisor();			
		//String color = (String) (ServletActionContext.getRequest()).getParameter("beerColor");
		this.brands = ba.getBeers(this.getBeerColor());
		//(ServletActionContext.getRequest()).setAttribute("brands", brands);
		return SUCCESS;
	}

}
