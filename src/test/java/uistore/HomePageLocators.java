package uistore;

import org.openqa.selenium.By;

public class HomePageLocators {

    public By inputBox = By.xpath("//input[@placeholder='Search on Men']");
    public By categoryFilter = By.xpath("//span[text()='Sort By : relevance']");
    public By filterByLowPrice = By.xpath("//span[text()='price: low to high']");
}
