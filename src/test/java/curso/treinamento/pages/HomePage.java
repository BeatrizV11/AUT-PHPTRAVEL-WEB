package curso.treinamento.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import curso.treinamento.utils.Helper;

public class HomePage {
	
	public HomePage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//a[@href='https://www.phptravels.net/admin/logout']")
	private static WebElement linkLogout;
	
	@FindBy (xpath = "//a[@href='#ACCOUNTS']")
	private static WebElement btnAccounts;
	
	@FindBy (xpath = "//ul[@id='ACCOUNTS']//following::a[text()='Admins']")
	private static WebElement btnAdmins;
	
	@FindBy (xpath = "//ul[@id='ACCOUNTS']//following::a[text()='Suppliers']")
	private static WebElement btnSuppliers;
	
	@FindBy (xpath = "//ul[@id='ACCOUNTS']//following::a[text()='Customers']")
	private static WebElement btnCustomers;
	 
	@FindBy (xpath = "//ul[@id='ACCOUNTS']//following::a[text()='GuestCustomers']")
	private static WebElement btnGuestCustomers;
	
	
	public static Boolean validar_pagina() {
		
		Helper.aguardar_elemento(10, linkLogout);
		return linkLogout.isDisplayed();
	}
	
	public static void clicarBtnAccounts() {
		Helper.aguardar_elemento(10, btnAccounts);
		btnAccounts.click();
	}
	
	public static Boolean validar_btn_admins() {
		
		Helper.aguardar_elemento(10, btnAdmins);
		return Helper.elemento_existe(btnAdmins, 10);
	}
	
	public static Boolean validar_btn_suppliers() {
		
		Helper.aguardar_elemento(10, btnSuppliers);
		return Helper.elemento_existe(btnSuppliers, 10);
	}
	
	public static Boolean validar_btn_customers() {
		
		Helper.aguardar_elemento(10, btnCustomers);
		return Helper.elemento_existe(btnCustomers, 10);
	}
	
public static Boolean validar_btn_guestcustomers() {
		
		Helper.aguardar_elemento(10, btnGuestCustomers);
		return Helper.elemento_existe(btnGuestCustomers, 10);
	}
	
}

//a[@href='https://www.phptravels.net/admin/accounts/admins/']