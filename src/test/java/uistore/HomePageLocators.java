package uistore;

import org.openqa.selenium.By;

public class HomePageLocators {

    public By inputBox = By.xpath("//input[@placeholder='Search on Men']");
    public By categoryFilter = By.xpath("//span[text()='Sort By : relevance']");
    public By filterByLowPrice = By.xpath("//span[text()='price: low to high']");
    public By productToHover = By.xpath("//a[@href='/gubb-usa-grooming-scissor/p/72053?productId=72053&pps=1']");
    public By addToBag = By.xpath("//span[text()='Add To Bag']");
    public By shoppingCartBtn = By.id("header-bag-icon");
    // public By proceedBtn = By.xpath("//span[text()='Proceed']");
    public By proceedBtn = By.xpath("(//button[@class=\"css-guzomk e8tshxd0\"])[2]");
    public By iframe = By.xpath("//iframe[@src='/mobileCartIframe?ptype=customIframeCart']");

    public By banner = By.id("66c7fe2cf95a07dcdd5ddb72");
    public By hooverLifestyle = By.xpath("(//a[normalize-space(text())='Fashion & Lifestyle'])[1]");
    public By kurta = By.xpath("//a[text()='Kurtas']");
}
