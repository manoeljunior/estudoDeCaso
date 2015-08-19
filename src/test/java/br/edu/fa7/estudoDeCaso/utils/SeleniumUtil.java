package br.edu.fa7.estudoDeCaso.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumUtil {

	private static WebDriver driver;
	private static WebDriverWait wait;
	
	public static WebDriver getDriver() {
		if (driver == null)
			driver = new FirefoxDriver();
		
		return driver;
	}
	
	public static String obterMensagem() {		
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.className("ui-messages")));
		WebElement element = driver.findElement(By.className("ui-messages"));
		return element.getText();
	}
	
	public static String obterTitulo() {
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("title")));
		return driver.getTitle();
	}
	
}
