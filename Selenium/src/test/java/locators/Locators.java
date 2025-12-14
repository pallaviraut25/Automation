package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		// id
		driver.findElement(By.id("nav-top"));

		driver.findElement(By.id("a-page"));

		// name

		driver.findElement(By.name("twitter:card"));

		driver.findElement(By.name("twitter:site:id"));

		// Classname

		driver.findElement(By.className("vjs-styles-dimensions"));
		driver.findElement(By.className("vjs-styles-defaults"));

		// linkText

		driver.findElement(By.linkText("Customer Service"));

		driver.findElement(By.linkText("MX Player"));

		// PartiallinkText
		driver.findElement(By.partialLinkText("MX Playe"));

		driver.findElement(By.partialLinkText("Today's Deal"));

		// tagname

		driver.findElement(By.tagName("div"));

		driver.findElement(By.tagName("body"));

		// CSS Selector:Cascading Style Sheet

		// 1)tagname and id_value
		// tagname#id_value

		driver.findElement(By.cssSelector("div#nav-belt"));

		driver.findElement(By.cssSelector("div#nav-tools"));

		// 2)tagname and valueofclass

		// tagname.valueofclass---spaces remove---dot

		driver.findElement(By.cssSelector("a-carousel-col a-carousel-right celwidget"));

		driver.findElement(By.cssSelector("navLeftFooter nav-sprite-v1"));

		// 3)tagname and attribute
		// tagname[attribute="value"]

		driver.findElement(By.cssSelector("div[class=\"a-carousel-col a-carousel-right celwidget\"]"));

		driver.findElement(By.cssSelector("div[data-csa-c-action=\"herotatorRightArrow\"]"));

		// 4)tagname and multiple attribute
		// tagname[attribute1="value1"]tagname[attribute2="value2"]

		driver.findElement(By.cssSelector(
				"div[data-csa-c-action=\"herotatorRightArrow\"]div[class=\"a-section a-spacing-none aok-relative\"]"));

		// 5)contains*
		// tagname[attribute*="value"]

		driver.findElement(By.cssSelector("div[class*=\"a-carousel-col a-carousel-right celwidget\"]"));

		driver.findElement(By.cssSelector("div[data-csa-c-action*=\"herotatorRightArrow\"]"));

		// 6)Startswith^
		// tagname[attribute^="value"]

		driver.findElement(By.cssSelector("div[class^=\"a-carousel-col a-carousel-right celwidget\"]"));

		driver.findElement(By.cssSelector("div[data-csa-c-action^=\"herotatorRightArrow\"]"));

		// 7)endswith$
		// tagname[attribute$="value"]

		driver.findElement(By.cssSelector("div[class$=\"a-carousel-col a-carousel-right celwidget\"]"));

		driver.findElement(By.cssSelector("a[aria-disabled$=\"false\"]"));

		// 8)Pseudoclass--- css selector--dropdown and if we have parent and child
		// combination

		// a)First_class
		// parent tagname [parent attribute="valueofparentattribute"] :first-child

		driver.findElement(By.cssSelector("select[aria-describedby=\"searchDropdownDescription\"] :first-child"));

		// b)last_class
		// select[aria-describedby="searchDropdownDescription"] :last-child

		driver.findElement(By.cssSelector("select[aria-describedby=\"searchDropdownDescription\"] :last-child"));

		// c)nth_child
		// select[aria-describedby="searchDropdownDescription"] :nth-child(Number)
		// Number:Value of specific dropdown

		driver.findElement(By.cssSelector("select[aria-describedby=\"searchDropdownDescription\"] :nth-child(4)"));

		// d)nth_last_child(n)
		// select[aria-describedby="searchDropdownDescription"] :nth-last-child(Number)

		driver.findElement(By.cssSelector("select[aria-describedby=\"searchDropdownDescription\"] :nth-last-child(4)"));

		// 8]xpath
		// 1]Tagname and attribute
		// Syntax://tagname[@attribute="Value"]

		driver.findElement(By.xpath("(//div[@data-csa-c-painter=\"scalable-image-link\"])[2]"));

		driver.findElement(By.xpath("(//li[@aria-roledescription=\"Slide\"])[6]"));

		// 2]Tagname and Multiple Attribute
		// Syntax://tagname[@attribute1="Value1"][@attribute2="Value2"]

		driver.findElement(By.xpath("//hr[@class=\"nav-assistant-separator\"][@aria-hidden=\"true\"]"));

		driver.findElement(By.xpath("//div[@id=\"pageContent\"][@class=\"a-section a-spacing-none\"]"));

		// 3]Tagname and Multiple Attribute with and
		// Syntax://tagname[@attribute1="Value1" and @attribute2="Value2"]

		driver.findElement(By.xpath("//div[@id=\"pageContent\" and @class=\"a-section a-spacing-none\"]"));

		driver.findElement(By.xpath("//hr[@class=\"nav-assistant-separator\" and @aria-hidden=\"true\"]"));

		// 4]Tagname and Multiple Attribute with or
		// Syntax://tagname[@attribute1="Value1" or @attribute2="Value2"]

		driver.findElement(By.xpath("//nav[@id=\"shortcut-menu\" or @class=\"nav-assistant\"]"));

		driver.findElement(By.xpath("//div[@id=\"pageContent\" or @class=\"a-section a-spacing-non\"]"));

		// 5]Contains
		// Syntax://tagname[Contains(@attribute,"Value")]

		driver.findElement(By.xpath("(//ol[contains(@class,\"a-carousel\")])[2]"));

		driver.findElement(By.xpath("//div[contains (@class,\"a-carousel-viewport\")]"));

		// 6]start-with

		// Syntax://tagname[Starts-with(@attribute,"Value")]

		driver.findElement(By.xpath("//div[starts-with (@class,\"a-carousel-viewport\")]"));

		driver.findElement(By.xpath("//div[starts-with(@class,\"a-carousel-col a-carousel-center\")]"));

		// 7]text
		// Syntax://tagname[text()="textpresent"]

		driver.findElement(By.xpath("//a[text()=\"Customer Service\"]"));

		driver.findElement(By.xpath("//a[text()=\"Bestsellers\"]"));

		// 8]Xpath:Parent And Child Relationship
		// Syntax://parenttagname[@parentattribute="value"]//childtagname[@childattribute="value"]

		driver.findElement(
				By.xpath("//select[@aria-describedby=\"searchDropdownDescription\"]//option[@selected=\"selected\"]"));

		// 9]Current node or self node or parentchildtagname or childtagname
		// Syntax://tagname[@attribute="value"]//self::currenttagname

		driver.findElement(By.xpath("//option[@value=\"search-alias=fashion\"]//self::option"));

		// 10]Select parent node from child
		// Syntax://childtagname[@childattribute="value"]//parent::parenttagname

		driver.findElement(By.xpath("//option[@value=\"search-alias=appliances\"]//parent::select"));

		// 11]Select child node from parent
		// Syntax://parenttagname[@parentattribute="value"]//child::childtagname

		driver.findElement(By.xpath("(//select[@name=\"url\"]//child::option)[43]"));

		driver.findElement(By.xpath("(//select[@name=\"url\"]//child::option)[3]"));

	}

}
